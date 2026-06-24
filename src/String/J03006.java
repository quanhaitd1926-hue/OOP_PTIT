package String;

import java.util.Scanner;

public class J03006 {
	public static boolean check(String s){
		int l = 0, r = s.length() - 1;
		while(l <= r){
			int x = s.charAt(l) - '0';
			int y = s.charAt(r) - '0';
			if(x % 2 != 0 || y % 2 != 0) return false;
			if(s.charAt(l) != s.charAt(r)) return false;
			++l; --r;
		}
		return true;
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			sc.nextLine();
			while(t-- > 0){
				String s = sc.nextLine();
				if(check(s)) System.out.println("YES");
				else System.out.println("NO");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
