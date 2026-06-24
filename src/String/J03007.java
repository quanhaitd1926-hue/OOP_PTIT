package String;

import java.util.Scanner;

public class J03007 {
    public static int sum(String s){
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += s.charAt(i) - '0';
        }
        return sum;
    }

    public static boolean check(String s){
		int l = 0, r = s.length() - 1;
        if(s.charAt(l) != '8' && s.charAt(r) != '8') return false;
		while(l <= r){
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
				if(check(s) && sum(s) % 10 == 0) System.out.println("YES");
				else System.out.println("NO");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
