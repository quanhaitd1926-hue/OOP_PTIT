package File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class Count{
	private String name;
	private int frequency;

	public String getName() {
		return name;
	}

	public int getFrequency() {
		return frequency;
	}

	public Count(String name, int frequency) {
		this.name = name;
		this.frequency = frequency;
	}
	
	@Override
	public String toString(){
		return this.name + " " + this.frequency;
	}
}

public class J07011 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new BufferedReader(new FileReader("VANBAN.in")))) {
			int n = Integer.valueOf(sc.nextLine());
			ArrayList<Count> arr = new ArrayList<>();
			HashMap<String, Integer> map = new HashMap<>();
			for(int i = 0; i < n; i++){
				String s = sc.nextLine().toLowerCase();
				String[] word = s.trim().split("[^a-z0-9]+");
				for(String tmp : word){
					if(!tmp.isEmpty())
					    map.put(tmp, map.getOrDefault(tmp, 0) + 1);
				}
			}
			map.forEach((key, value) -> {
				arr.add(new Count(key, value));
			});
			arr.sort(Comparator.comparingInt(Count::getFrequency).reversed()
				.thenComparing(Count::getName));
			arr.forEach(cnt -> System.out.println(cnt));
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
