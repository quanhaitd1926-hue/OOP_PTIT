package File;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;

class Count1{
	private String name;
	private int frequency;

	public String getName() {
		return name;
	}

	public int getFrequency() {
		return frequency;
	}

	public Count1(String name, int frequency) {
		this.name = name;
		this.frequency = frequency;
	}
	
	@Override
	public String toString(){
		return this.name + " " + this.frequency;
	}
}

public class J07012 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA.in")))) {
            ArrayList<String> arr = (ArrayList<String>)ois.readObject();
            TreeMap<String, Integer> map = new TreeMap<>();
            for(String s : arr){
                s = s.toLowerCase();
				String[] word = s.trim().split("[^a-z0-9]+");
				for(String tmp : word){
					if(!tmp.isEmpty())
					    map.put(tmp, map.getOrDefault(tmp, 0) + 1);
				}
            }
            ArrayList<Count1> cnt = new ArrayList<>();
            map.forEach((key, value) -> {
				cnt.add(new Count1(key, value));
			});
			cnt.sort(Comparator.comparingInt(Count1::getFrequency).reversed()
				.thenComparing(Count1::getName));
			cnt.forEach(count -> System.out.println(count));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
