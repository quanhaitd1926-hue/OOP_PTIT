package J05005_ListObjectStudent_3;

public class Student {
	private String id, name, birth, className;
	private double gpa;

	public Student(int id, String name, String className, String birth, double gpa) {
		super();
		this.id = "B20DCCN" + String.format("%03d", id);
		this.name = name;
		this.birth = birth;
		this.className = className;
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
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

	@Override
	public String toString() {
		return this.id + " " + ChuanHoaName(this.name) + " " + this.className + " " + ChuanHoaBirth(this.birth) + " "
				+ String.format("%.2f", this.gpa);
	}
}
