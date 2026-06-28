import java.util.LinkedHashMap;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		for(int i = 0; i < n; i++){
			int x = sc.nextInt();
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		map.forEach((key, value) -> System.out.println(key + " " + value));
		sc.close();
	}
}
