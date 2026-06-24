package DeclareClassAndObject;

import java.util.Scanner;

class Student{
	private String name;
	private String className;
	private String birth;
	private double gpa;

	public Student(String name, String className, String birth, double gpa) {
		this.name = name;
		this.className = className;
		this.birth = birth;
		this.gpa = gpa;
	}
	public String fomatBirth(String s){
		StringBuilder sb = new StringBuilder(s);
		if(sb.charAt(1) == '/') sb.insert(0, '0');
		if(sb.charAt(4) == '/') sb.insert(3, '0');
		return sb.toString();
	}

	@Override
	public String toString(){
		return "B20DCCN001" + " " + this.name + " " + this.className + " " + 
			fomatBirth(this.birth) + " " + String.format("%.2f", this.gpa);
	}
}

public class J04006 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String name = sc.nextLine();
			String className = sc.nextLine();
			String birth = sc.nextLine();
			double gpa = sc.nextDouble();
			Student st = new Student(name, className, birth, gpa);
			System.out.println(st);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
