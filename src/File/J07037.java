package File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Enterprise{
    private String id;
    private String name;
    private int studentsNumber;

    public Enterprise(String id, String name, int studentsNumber) {
        this.id = id;
        this.name = name;
        this.studentsNumber = studentsNumber;
    }
    
    public String getId() {
        return id;
    }

    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.studentsNumber;
    }
}

public class J07037 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new BufferedReader(new FileReader("DN.in")))) {
            int t = Integer.valueOf(sc.nextLine());
            ArrayList<Enterprise> arr = new ArrayList<>();
            while(t-- > 0){
                String id = sc.nextLine();
                String name = sc.nextLine();
                int studentsNumber = Integer.valueOf(sc.nextLine());
                arr.add(new Enterprise(id, name, studentsNumber));
            }
            arr.sort(Comparator.comparing(Enterprise::getId));
            arr.forEach(ent -> System.out.println(ent));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
