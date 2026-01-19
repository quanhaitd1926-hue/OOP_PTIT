package J05043_CaculationIncomeToEmployee;

public class Employee {
	private String id, name, position;
	private long salary;
	private int workDay;

	public Employee(int id, String name, String position, long salary, int workDay) {
		super();
		this.id = "NV" + String.format("%02d", id);
		this.name = name;
		this.position = position;
		this.salary = salary;
		this.workDay = workDay;
	}

	public long getAllowance() {
		if (this.position.equals("GD"))
			return 500;
		else if (this.position.equals("PGD"))
			return 400;
		else if (this.position.equals("TP"))
			return 300;
		else if (this.position.equals("KT"))
			return 250;
		else
			return 100;
	}

	public long getSalary() {
		return this.salary * this.workDay;
	}

	public long getTemp() {
		double temp = (getAllowance() + getSalary() * (2.0 / 3));
		if (temp < 25000)
			return Math.round(temp / 1000.0) * 1000;
		else
			return 25000;
	}

	public long getBalance() {
		return (getSalary() - getTemp() + getAllowance());
	}

	@Override
	public String toString() {
		return this.id + " " + this.name + " " + getAllowance() + " " + getSalary() + " " + getTemp() + " "
				+ getBalance();
	}

}
