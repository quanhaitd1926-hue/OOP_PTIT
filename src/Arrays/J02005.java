package Arrays;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class J02005 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			TreeMap<Integer, Integer> map = new TreeMap<>();
			for(int i = 0; i < n; i++){
				int x = sc.nextInt();
				map.put(x, 1);
			}
			for(int i = 0; i < m; i++){
				int x = sc.nextInt();
				if(map.containsKey(x)){
					map.put(x, 2);
				}
			}
			for(Map.Entry<Integer, Integer> entry : map.entrySet()){
				if(entry.getValue() == 2){
					System.out.print(entry.getKey() + " ");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
