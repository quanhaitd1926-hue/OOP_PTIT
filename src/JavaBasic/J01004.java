package JavaBasic;

import java.util.Scanner;

public class J01004 {
	public static boolean checkPrime(int n){
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(n % i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			while(t-- > 0){
				int n = sc.nextInt();
				if(checkPrime(n)){
					System.out.println("YES");
				}
				else System.out.println("NO");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
