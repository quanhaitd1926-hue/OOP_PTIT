package J05038_BangKeTienLuong;

public class Employee {
	private String id, name;
	private long salary;
	private int work;
	private String position;

	public Employee(int id, String name, long salary, int work, String position) {
		super();
		this.id = "NV" + String.format("%02d", id);
		this.name = name;
		this.salary = salary;
		this.work = work;
		this.position = position;
	}

	public long getSalary() {
		return salary * work;
	}

	public long getAward() {
		if (work >= 25)
			return (long) (getSalary() * 0.2);
		else if (work >= 22)
			return (long) (getSalary() * 0.1);
		else
			return 0;
	}

	public long getAllowance() {
		if (position.equals("GD"))
			return 250000;
		else if (position.equals("PGD"))
			return 200000;
		else if (position.equals("TP"))
			return 180000;
		else
			return 150000;
	}

	public long getSumFee() {
		return (long) (getSalary() + getAward() + getAllowance());
	}

	@Override
	public String toString() {
		return this.id + " " + this.name + " " + getSalary() + " " + getAward() + " " + getAllowance() + " "
				+ getSumFee();
	}

}
