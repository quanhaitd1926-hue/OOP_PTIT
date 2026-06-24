package String;

import java.util.Scanner;

public class J03008 {
    public static boolean isPrime(int n){
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }

    public static boolean check(String s){
        int l = 0, r = s.length() - 1;
        while(l <= r){
            int x = s.charAt(l) - '0';
            int y = s.charAt(r) - '0';
            if(!isPrime(x) && !isPrime(y)) return false;
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
