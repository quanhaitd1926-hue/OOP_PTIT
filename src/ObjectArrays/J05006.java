package ObjectArrays;

import java.util.ArrayList;
import java.util.Scanner;

class Staff{
	private String id;
	private String name;
	private String gender;
	private String birth;
	private String address;
	private String idTax;
	private String contractDate;

	public Staff(int id, String name, String gender, String birth, String address, String idTax,
			String contractDate) {
		this.id = String.format("%05d", id);
		this.name = name;
		this.gender = gender;
		this.birth = birth;
		this.address = address;
		this.idTax = idTax;
		this.contractDate = contractDate;
	}
	public String formatBirth(String s){
		StringBuilder sb = new StringBuilder(s);
		if(sb.charAt(1) == '/') sb.insert(0, '0');
		if(sb.charAt(4) == '/') sb.insert(3, '0');
		return sb.toString();
	}

	@Override
	public String toString(){
		return String.format("%s %s %s %s %s %s %s", this.id, this.name, this.gender,
			formatBirth(this.birth), this.address, this.idTax, formatBirth(this.contractDate));
	}
}

public class J05006 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			sc.nextLine();
			ArrayList<Staff> arr = new ArrayList<>();
			for(int i = 1; i <= n; i++){
				String name = sc.nextLine();
				String gender = sc.nextLine();
				String birth = sc.nextLine();
				String address = sc.nextLine();
				String idTax = sc.nextLine();
				String contractDate = sc.nextLine();
				Staff st = new Staff(i, name, gender, birth, address, idTax, contractDate);
				arr.add(st);
			}
			arr.forEach(st -> System.out.println(st));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
