package J04006_DeclareClassStudent;

public class Student {
	private String id, name, className, birth;
	private double gpa;

	public Student(String id, String name, String className, String birth, double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.className = className;
		this.birth = birth;
		this.gpa = gpa;
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
		return this.id + " " + this.name + " " + this.className + " " + StandardBirth(this.birth) + " "
				+ String.format("%.2f", this.gpa);
	}

}
