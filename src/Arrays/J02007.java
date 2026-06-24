package Arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            for(int k = 1; k <= t; k++){
                System.out.println("Test " + k + ":");
                int n = sc.nextInt();
                LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
                for(int i = 0; i < n; i++){
                    int x = sc.nextInt();
                    map.put(x, map.getOrDefault(x, 0) + 1);
                }
                for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                    System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
                }   
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
