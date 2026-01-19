package J05047_BangKeNhapKhoSapXepTheoChietKhau;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Run {
	public static String getName(String s) {
		String[] arr = s.split("\\s+");
		String name = "";
		for (int i = 0; i < 2; i++) {
			name += Character.toUpperCase(arr[i].charAt(0));
		}
		return name;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Product> arr = new ArrayList<>();
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			map.put(getName(name), map.getOrDefault(getName(name), 0) + 1);
			int quantity = sc.nextInt();
			long unitPrice = sc.nextLong();
			Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
			String id = getName(name);
			for (Map.Entry<String, Integer> entry : entrySet) {
				if (entry.getKey().equals(id)) {
					id += String.format("%02d", entry.getValue());
				}
			}
			Product pro = new Product(name, quantity, unitPrice, id);
			arr.add(pro);
		}
		Collections.sort(arr, (o1, o2) -> {
			return Long.compare(o2.TienChietKhau(), o1.TienChietKhau());
		});

		arr.forEach((Product p) -> System.out.println(p));
	}
}
