package J04015_CaculatingTeacherIncome;

public class Teacher {
	private String id, name;
	private long salary;

	public Teacher(String id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getPosition(String id) {
		return id.substring(0, 2);
	}

	public long getSalaryLevel() {
		return Integer.parseInt(this.id.substring(2, 4));
	}

	public long getAllowance() {
		String position = getPosition(this.id);
		if (position.equals("HT"))
			return 2000000;
		else if (position.equals("HP"))
			return 900000;
		else
			return 500000;
	}

	public long getIncome() {
		return getAllowance() + getSalaryLevel() * this.salary;
	}

	public String toString() {
		return this.id + " " + this.name + " " + getSalaryLevel() + " " + getAllowance() + " " + this.getIncome();
	}

}
