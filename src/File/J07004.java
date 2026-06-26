package File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.TreeMap;

public class J07004 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new FileReader("DATA.in"))) {
			TreeMap<Integer, Integer> map = new TreeMap<>();
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
