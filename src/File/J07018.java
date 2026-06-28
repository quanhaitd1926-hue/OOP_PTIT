package File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

class Student1{
	private String id;
	private String name;
	private String className;
	private String birth;
	private double gpa;

	public Student1(int id, String name, String className, String birth, double gpa) {
		this.id = "B20DCCN" + String.format("%03d", id);
		this.name = name;
		this.className = className;
		this.birth = birth;
		this.gpa = gpa;
	}
	
	public String formatName(String s){
		String[] arr = s.trim().split("\\s+");
		String formattedName = "";
		for(String t : arr){
			formattedName += Character.toUpperCase(t.charAt(0));
			for(int i = 1; i < t.length(); i++){
				formattedName += Character.toLowerCase(t.charAt(i));
			}
			formattedName += " ";
		}
		return formattedName.trim();
	}
	public String formatBirth(String s){
		StringBuilder sb = new StringBuilder(s);
		if(sb.charAt(1) == '/') sb.insert(0, "0");
		if(sb.charAt(4) == '/') sb.insert(3, "0");
		return sb.toString();
	}

	@Override
	public String toString(){
		return String.format("%s %s %s %s %.2f", this.id, formatName(this.name), this.className,
			formatBirth(this.birth), this.gpa);
	}
}

public class J07018 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new BufferedReader(new FileReader("SINHVIEN.in")))) {
			int n = Integer.valueOf(sc.nextLine());
			ArrayList<Student1> arr = new ArrayList<>();
			for(int i = 1; i <= n; i++){
				String name = sc.nextLine();
				String className = sc.nextLine();
				String birth = sc.nextLine();
				double gpa = Double.valueOf(sc.nextLine());
				arr.add(new Student1(i, name, className, birth, gpa));
			}
			arr.forEach(stu -> System.out.println(stu));
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
