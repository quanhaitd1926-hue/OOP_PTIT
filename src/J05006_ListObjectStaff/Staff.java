package J05006_ListObjectStaff;

public class Staff {
	private String id, name, gender, birth, address, tax, contract;

	public Staff(int id, String name, String gender, String birth, String address, String tax, String contract) {
		super();
		this.id = String.format("%05d", id);
		this.name = name;
		this.gender = gender;
		this.birth = birth;
		this.address = address;
		this.tax = tax;
		this.contract = contract;
	}

	public String ChuanHoaName(String s) {
		String[] arr = s.split("\\s+");
		String name = "";
		for (int i = 0; i < arr.length; i++) {
			name += Character.toUpperCase(arr[i].charAt(0));
			for (int j = 1; j < arr[i].length(); j++) {
				name += Character.toLowerCase(arr[i].charAt(j));
			}
			name += " ";
		}
		return name.trim();
	}

	public String ChuanHoaBirth(String s) {
		StringBuilder sb = new StringBuilder(s);
		if (sb.charAt(1) == '/')
			sb.insert(0, "0");
		if (sb.charAt(4) == '/')
			sb.insert(3, "0");
		return sb.toString();
	}

	public String toString() {
		return this.id + " " + ChuanHoaName(this.name) + " " + this.gender + " " + ChuanHoaBirth(this.birth) + " "
				+ this.address + " " + this.tax + " " + ChuanHoaBirth(this.contract);
	}
}
