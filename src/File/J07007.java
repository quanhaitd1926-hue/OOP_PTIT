package File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.TreeSet;

public class J07007 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new BufferedReader(new FileReader("VANBAN.in")))) {
            TreeSet<String> set = new TreeSet<>();
            while(sc.hasNext()){
                String s = sc.next();
                set.add(s.toLowerCase());
            }
            set.forEach(s -> System.out.println(s));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
