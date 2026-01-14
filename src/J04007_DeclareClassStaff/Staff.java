package J04007_DeclareClassStaff;

public class Staff {
	private String id, name, gender, birth, address, tax, contract;

	public Staff(String id, String name, String gender, String birth, String address, String tax, String contract) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.birth = birth;
		this.address = address;
		this.tax = tax;
		this.contract = contract;
	}

	public String StandardBirth(String s) {
		StringBuilder sb = new StringBuilder(s);
		if (sb.charAt(1) == '/')
			sb.insert(0, "0");
		if (sb.charAt(4) == '/')
			sb.insert(3, "0");
		return sb.toString();
	}

	@Override
	public String toString() {
		return id + " " + name + " " + gender + " " + StandardBirth(birth) + " " + address + " " + tax + " "
				+ StandardBirth(contract);
	}
}
