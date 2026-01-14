package J05003_ListObjectStudent_1;

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

	public String ChuanHoa(String s) {
		StringBuilder sb = new StringBuilder(s);
		if (sb.charAt(1) == '/')
			sb.insert(0, "0");
		if (sb.charAt(4) == '/')
			sb.insert(3, "0");
		return sb.toString();
	}

	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.className + " " + ChuanHoa(this.birth) + " "
				+ String.format("%.2f", this.gpa);
	}

}
