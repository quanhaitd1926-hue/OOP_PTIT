package J05074_J05075_DiemDanh;

public class Student {
	private String id, name, className, pointAttend;
	private int point;

	public Student(String id, String name, String className, String pointAttend, int point) {
		super();
		this.id = id;
		this.name = name;
		this.className = className;
		this.pointAttend = pointAttend;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getPointAttend() {
		return pointAttend;
	}

	public void setPointAttend(String pointAttend) {
		this.pointAttend = pointAttend;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.className + " " + this.point;
	}

}
