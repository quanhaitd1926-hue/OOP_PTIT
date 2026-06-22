package JavaBasic;

import java.util.Scanner;

public class J01007 {
	static long[] F = new long[100];
	public static void init(){
		F[0] = 0;
		F[1] = 1;
		for(int i = 2; i <= 92; i++){
			F[i] = F[i - 1] + F[i - 2];
		}
	}

	public static boolean checkFibo(long n){
		boolean check = false;
		for(int i = 0; i <= 92; i++){
			if(F[i] == n){
				check = true;
				break;
			}
		}
		return check;
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			init();
			int t = sc.nextInt();
			while(t-- > 0){
				long n = sc.nextLong();
				if(checkFibo(n)) System.out.println("YES");
				else System.out.println("NO");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}