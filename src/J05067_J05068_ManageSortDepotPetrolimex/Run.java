package J05067_J05068_ManageSortDepotPetrolimex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<Petrolimex> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			String[] temp = s.split("\\s+");
			String id = temp[0];
			long quantity = Long.parseLong(temp[1]);
			Petrolimex petro = new Petrolimex(id, quantity);
			arr.add(petro);
		}

		Collections.sort(arr, (o1, o2) -> Long.compare(o2.Money(), o1.Money()));

		arr.forEach((Petrolimex p) -> System.out.println(p));
	}
}
