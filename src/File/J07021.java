package File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class J07021 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new BufferedReader(new FileReader("DATA.in")))) {
			while(sc.hasNextLine()){
				String s = sc.nextLine();
				if(s.trim().equals("END")){
					break;
				}
				else{
					String[] arr = s.trim().split("\\s+");
					String name = "";
					for(String x : arr){
						name += Character.toUpperCase(x.charAt(0));
						for(int i = 1; i < x.length(); i++){
							name += Character.toLowerCase(x.charAt(i));
						}
						name += " ";
					}
					System.out.println(name.trim());
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
