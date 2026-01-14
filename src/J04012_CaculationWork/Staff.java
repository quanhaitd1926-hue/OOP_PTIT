package J04012_CaculationWork;

public class Staff {
	private String id, name;
	private int salary, numberWoking;
	private String position;

	public Staff(String id, String name, int salary, int numberWoking, String position) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.numberWoking = numberWoking;
		this.position = position;
	}

	public long getSalary() {
		return (long) salary * numberWoking;
	}

	public long getReward() {
		if (numberWoking >= 25)
			return (long) (getSalary() * 0.2);
		else if (numberWoking > 22 && numberWoking < 25)
			return (long) (getSalary() * 0.1);
		else
			return 0;
	}

	public long getAllowance() {
		if (this.position.equals("GD"))
			return 250000;
		else if (this.position.equals("PGD"))
			return 200000;
		else if (this.position.equals("TP"))
			return 180000;
		else
			return 150000;
	}

	public long getIncome() {
		return (getSalary() + getReward() + getAllowance());
	}

	@Override
	public String toString() {
		return this.id + " " + this.name + " " + getSalary() + " " + getReward() + " " + getAllowance() + " "
				+ getIncome();
	}
}
