package JavaBasic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class HELLOFILE {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new BufferedReader(new FileReader("Hello.txt")))) {
			while (sc.hasNext()) {
				String s = sc.nextLine();
				System.out.println(s);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
