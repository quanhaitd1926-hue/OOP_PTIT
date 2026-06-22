package JavaBasic;

import java.util.Scanner;

public class J01006 {
	static long[] F = new long[100];
	public static void init(){
		F[0] = 0;
		F[1] = 1;
		for(int i = 2; i <= 92; i++){
			F[i] = F[i - 1] + F[i - 2];
		}
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			init();
			int t = sc.nextInt();
			while(t-- > 0){
				int n = sc.nextInt();
				System.out.println(F[n]);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
