package Arrays;

import java.util.Scanner;
import java.util.TreeSet;

public class J02006 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            TreeSet<Integer> set = new TreeSet<>();
            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                set.add(x);
            }
            for(int i = 0; i < m; i++){
                int x = sc.nextInt();
                set.add(x);
            }
            for(int x : set) System.out.print(x + " ");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
