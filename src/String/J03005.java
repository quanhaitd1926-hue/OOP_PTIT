package String;

import java.util.Scanner;

public class J03005 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			sc.nextLine();
			while(t-- > 0){
				String s = sc.nextLine();
				String[] arr = s.trim().split("\\s+");
				String name = "";
				for(int i = 1; i < arr.length; i++){
					name += Character.toUpperCase(arr[i].charAt(0));
					for(int j = 1; j < arr[i].length(); j++){
						name += Character.toLowerCase(arr[i].charAt(j));
					}
					name += " ";
				}
				name = name.trim();
				name += ", " + arr[0].toUpperCase();
				System.out.println(name);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
