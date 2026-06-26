package File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new BufferedReader(new FileReader("DATA.in")))) {
			HashMap<Integer, Integer> map = new HashMap<>();
			while(sc.hasNext()){
				int n = sc.nextInt();
				map.put(n, map.getOrDefault(n, 0) + 1);
			}
			map.forEach((key, value) -> System.out.println(key + " " + value));
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
