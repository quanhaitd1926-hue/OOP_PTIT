package Arrays;

import java.util.Scanner;

public class J02004 {
	public static boolean checkPalindrome(int a[], int n){
		int l = 0, r = n - 1;
		while(l <= r){
			if(a[r] != a[l]) return false;
			++l; --r;
		}
		return true;
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			while(t-- > 0){
				int n = sc.nextInt();
				int[] a = new int[n];
				for(int i = 0; i < n; i++){
					a[i] = sc.nextInt();
				}
				if(checkPalindrome(a, n)) System.out.println("YES");
				else System.out.println("NO");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
