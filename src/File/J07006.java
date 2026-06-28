package File;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

public class J07006 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA.in")))) {
            ArrayList<Integer> arr = (ArrayList<Integer>)ois.readObject();
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for(int x : arr){
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
            map.forEach((key, value) -> {
                System.out.println(key + " " + value);
            });
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
