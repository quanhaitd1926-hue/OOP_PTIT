package J05054_StudentRanking;

public class Student {
	private String id, name;
	private double gpa;
	private int ranking;

	public Student(int id, String name, double gpa, int ranking) {
		super();
		this.id = "HS" + String.format("%02d", id);
		this.name = name;
		this.gpa = gpa;
		this.ranking = ranking;
	}

	public String rating() {
		if (gpa >= 9)
			return "Gioi";
		else if (gpa >= 7)
			return "Kha";
		else if (gpa >= 5)
			return "Trung Binh";
		else
			return "Yeu";
	}

	public double getGpa() {
		return this.gpa;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public String getId() {
		return id;
	}

	public int getRanking() {
		return this.ranking;
	}

	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.gpa + " " + rating() + " " + this.ranking;
	}

}
