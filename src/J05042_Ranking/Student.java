package J05042_Ranking;

public class Student {
	private String name;
	private int[] assignment;

	public Student(String name, int[] assignment) {
		super();
		this.name = name;
		this.assignment = new int[2];
		for (int i = 0; i < 2; i++) {
			this.assignment[i] = assignment[i];
		}
	}

	public int getAssignmentCorect() {
		return assignment[0];
	}

	public int getSubmit() {
		return assignment[1];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name + " " + this.assignment[0] + " " + this.assignment[1];
	}

}
