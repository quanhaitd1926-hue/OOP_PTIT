package J06003_J06004_ManageGroupAssignment;

public class Student {
	private String id, name, phoneNumber;
	private int groupNumber;

	public Student(String id, String name, String phoneNumber, int groupNumber) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.groupNumber = groupNumber;
	}

	public int getGroupNumber() {
		return this.groupNumber;
	}

	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.phoneNumber;
	}

}
