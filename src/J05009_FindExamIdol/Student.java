package J05009_FindExamIdol;

public class Student {
	private String id, name, birth;
	private double point1, point2, point3;

	public Student(int id, String name, String birth, double point1, double point2, double point3) {
		super();
		this.id = String.valueOf(id);
		this.name = name;
		this.birth = birth;
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}

	public double getSumPoints() {
		return (double) (this.point1 + this.point2 + this.point3);
	}

	public String toString() {
		return id + " " + name + " " + this.birth + " " + getSumPoints();
	}

}
