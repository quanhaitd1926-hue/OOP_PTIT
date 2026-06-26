package File;

import java.io.FileReader;
import java.util.Scanner;

public class J07002 {
	public static boolean isDigit(String s){
		if(s.length() > 9) return false;
		for(int i = 0; i < s.length(); i++){
			if(Character.isAlphabetic(s.charAt(i))) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new FileReader("DATA.in"))) {
			long sum = 0;
			while(sc.hasNext()){
				String s = sc.next();
				if(isDigit(s)){
					sum += Integer.valueOf(s);
				}
			}
			System.out.println(sum);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
