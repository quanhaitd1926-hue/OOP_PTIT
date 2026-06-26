package File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

class Student{
	private String id;
	private String name;
	private String className;
	private String birth;
	private double gpa;

	public Student(int id, String name, String className, String birth, double gpa) {
		this.id = "B20DCCN" + String.format("%03d", id);
		this.name = name;
		this.className = className;
		this.birth = birth;
		this.gpa = gpa;
	}
	public String formatBirth(String s){
		StringBuilder sb = new StringBuilder(s);
		if(sb.charAt(1) == '/') sb.insert(0, "0");
		if(sb.charAt(4) == '/') sb.insert(3, "0");
		return sb.toString();
	}

	@Override
	public String toString(){
		return String.format("%s %s %s %s %.2f", this.id, this.name, this.className,
			formatBirth(this.birth), this.gpa);
	}
}

public class J07010 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new BufferedReader(new FileReader("SV.in")))) {
			int n = Integer.parseInt(sc.nextLine());
			ArrayList<Student> arr = new ArrayList<>();
			for(int i = 1; i <= n; i++){
				String name = sc.nextLine();
				String className = sc.nextLine();
				String birth = sc.nextLine();
				double gpa = Double.parseDouble(sc.nextLine());
				Student st = new Student(i, name, className, birth, gpa);
				arr.add(st);
			}
			arr.forEach(student -> System.out.println(student));
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
