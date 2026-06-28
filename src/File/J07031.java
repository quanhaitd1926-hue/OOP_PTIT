package File;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class J07031 {
    @SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		int[] p = new int[1000005];
		for(int i = 0; i <= 1000001; i++){
			p[i] = 1;
		}
		for(int i = 2; i <= Math.sqrt(1000001); i++){
			if(p[i] == 1){
				for(int j = i * i; j <= 1000001; j += i){
					p[j] = 0;
				}
			}
		}
		final int n = 1000000;
		try (ObjectInputStream dis1 = new ObjectInputStream(
			new BufferedInputStream(new FileInputStream("DATA1.in")));
			ObjectInputStream dis2 = new ObjectInputStream(
			new BufferedInputStream(new FileInputStream("DATA2.in")))) {
			ArrayList<Integer> arr1 = (ArrayList<Integer>)dis1.readObject();
			ArrayList<Integer> arr2 = (ArrayList<Integer>)dis2.readObject();
			TreeSet<Integer> set = new TreeSet<>(arr1);
			set.forEach(e1 -> {
                int e2 = n - e1;
                if(e2 > e1 && p[e1] == 1 && p[e2] == 1 && arr1.contains(e2) && !arr2.contains(e1) && !arr2.contains(e2)){
                    System.out.println(e1 + " " + e2);
                }
            });
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
