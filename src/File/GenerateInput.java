package File;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;

public class GenerateInput {
	public static void main(String[] args) throws IOException {
		Random rand = new Random();
		int size = 100000;

		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			arr1.add(rand.nextInt(1000000) + 1);
			arr2.add(rand.nextInt(1000000) + 1);
		}	

		try (ObjectOutputStream oos1 = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("DATA1.in")));
			ObjectOutputStream oos2 = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("DATA2.in")))) {
			oos1.writeObject(arr1);
			oos2.writeObject(arr2);
		}

		System.out.println("Done! Generated DATA1.in and DATA2.in");
	}
}
