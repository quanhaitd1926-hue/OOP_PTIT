package File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Subject{
private String idSub;
private String nameSub;
private int creditNumber;

public Subject(String idSub, String nameSub, int creditNumber) {
	this.idSub = idSub;
	this.nameSub = nameSub;
	this.creditNumber = creditNumber;
} 
public String getNameSub() {
	return nameSub;
}

@Override
public String toString(){
	return this.idSub + " " + this.nameSub + " " + this.creditNumber;
}
}

public class J07034 {
public static void main(String[] args) {
	try (Scanner sc = new Scanner(new BufferedReader(new FileReader("MONHOC.in")))) {
		int t = Integer.valueOf(sc.nextLine());
		ArrayList<Subject> arr = new ArrayList<>();
		while(t-- > 0){
			String idSub = sc.nextLine();
			String nameSub = sc.nextLine();
			int creditNumber = Integer.valueOf(sc.nextLine());
			arr.add(new Subject(idSub, nameSub, creditNumber));
		}
		arr.sort(Comparator.comparing(Subject::getNameSub));
		arr.forEach(sub -> System.out.println(sub));
	} catch (FileNotFoundException e) {
		System.out.println(e);
	}
}
}
