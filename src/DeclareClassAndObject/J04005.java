package DeclareClassAndObject;

import java.util.Scanner;

class Candidate{
	private String name;
	private String birth;
	private double point1, point2, point3;

	public Candidate(String name, String birth, double point1, double point2, double point3) {
		this.name = name;
		this.birth = birth;
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}
	public String fomatBirth(String s){
		StringBuilder sb = new StringBuilder(s);
		if(sb.charAt(1) == '/') sb.insert(0, '0');
		if(sb.charAt(4) == '/') sb.insert(3, '0');
		return sb.toString();
	}

	@Override
	public String toString(){
		return this.name + " " + fomatBirth(this.birth) + " " + String.format("%.1f", 
			this.point1 + this.point2 + this.point3);
	}
}

public class J04005 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String name = sc.nextLine();
			String birth = sc.nextLine();
			double p1 = sc.nextDouble();
			double p2 = sc.nextDouble();
			double p3 = sc.nextDouble();
			Candidate st = new Candidate(name, birth, p1, p2, p3);
			System.out.println(st);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
