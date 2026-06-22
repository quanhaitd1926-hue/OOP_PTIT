package JavaBasic;

import java.util.Scanner;

public class J01009 {
	public static long gt(int n){
		long tich = 1;
		for(int i = 1; i <= n; i++){
			tich *= i;
		}
		return tich;
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long sum = 0;
			for(int i = 1; i <= n; i++){
				sum += gt(i);
			}
			System.out.println(sum);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
