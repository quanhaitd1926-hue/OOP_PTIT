package DeclareClassAndObject;

import java.util.Scanner;

class Staff{
    private String id;
    private String name;
    private String gender;
    private String birth;
    private String address;
    private String idTax;
    private String contractDate;

    public Staff(String id, String name, String gender, String birth, String address, String idTax,
            String contractDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.address = address;
        this.idTax = idTax;
        this.contractDate = contractDate;
    }
    public String fomatBirth(String s){
		StringBuilder sb = new StringBuilder(s);
		if(sb.charAt(1) == '/') sb.insert(0, '0');
		if(sb.charAt(4) == '/') sb.insert(3, '0');
		return sb.toString();
	}

    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.gender + " " + fomatBirth(this.birth)
            + " " + this.address + " " + this.idTax + " " + fomatBirth(this.contractDate);
    }
}

public class J04007 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String id = "00001";
            String name = sc.nextLine();
            String gender = sc.nextLine();
            String birth = sc.nextLine();
            String address = sc.nextLine();
            String idTax = sc.nextLine();
            String contractDate = sc.nextLine();
            Staff s = new Staff(id, name, gender, birth, address, idTax, contractDate);
            System.out.println(s);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
