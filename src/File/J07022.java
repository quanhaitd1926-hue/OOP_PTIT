package File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class J07022 {
	public static boolean isString(String s){
		if(s.length() > 9) return false;
		for(int i = 0; i < s.length(); i++){
			if(Character.isAlphabetic(s.charAt(i))) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new BufferedReader(new FileReader("DATA.in")))) {
			ArrayList<String> arr = new ArrayList<>();
			while(sc.hasNext()){
				String s = sc.next();
				if(isString(s) == false) arr.add(s);
			}
			arr.sort((String s1, String s2) -> s1.compareTo(s2));
			arr.forEach(s -> System.out.print(s + " "));
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
