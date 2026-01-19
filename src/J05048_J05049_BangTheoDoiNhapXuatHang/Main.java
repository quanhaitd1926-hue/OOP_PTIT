package J05048_J05049_BangTheoDoiNhapXuatHang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Product> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			Product pro = new Product(sc.nextLine(), sc.nextInt());
			arr.add(pro);
		}
//		Collections.sort(arr, (o1, o2) -> Long.compare(o2.Tax(), o1.Tax()));
//
//		sc.nextLine();
//		char c = sc.nextLine().charAt(0);
//		for (int i = 0; i < n; i++) {
//			if (arr.get(i).getChar() == c) {
//				System.out.println(arr.get(i));
//			}
//		}
		arr.forEach((Product p) -> System.out.println(p));
	}
}
