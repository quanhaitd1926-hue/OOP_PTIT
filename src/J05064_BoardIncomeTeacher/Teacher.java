package J05064_BoardIncomeTeacher;

public class Teacher implements ITeacher {
	private String id, name;
	private long salary;

	public Teacher(String id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int SalaryLevel() {
		return Integer.parseInt(id.substring(2, 4));
	}

	@Override
	public String getPositionID() {
		return id.substring(0, 2);
	}

	@Override
	public long Allowance() {
		if (getPositionID().equals("HT"))
			return 2000000;
		else if (getPositionID().equals("HP"))
			return 900000;
		else
			return 500000;
	}

	@Override
	public long Income() {
		return (long) (salary * SalaryLevel()) + Allowance();
	}

	@Override
	public String toString() {
		return this.id + " " + this.name + " " + SalaryLevel() + " " + Allowance() + " " + Income();
	}

}
