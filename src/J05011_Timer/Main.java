package J05011_Timer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		ArrayList<Player> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Player p = new Player(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
			arr.add(p);
		}

		Collections.sort(arr, new Comparator<Player>() {

			@Override
			public int compare(Player o1, Player o2) {
				if (o1.sortTime(o1.getTimeEnter(), o1.getTimeOut()) > o2.sortTime(o2.getTimeEnter(), o2.getTimeOut())) {
					return -1;
				} else
					return 1;
			}

		});

		arr.forEach((Player p) -> System.out.println(p));
	}
}
