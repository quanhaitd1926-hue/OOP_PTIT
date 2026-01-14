package J04013_BaiToanTuyenSinh;

public class Student {
	private String id, name;
	private double toan, li, hoa;

	public Student(String id, String name, double toan, double li, double hoa) {
		super();
		this.id = id;
		this.name = name;
		this.toan = toan;
		this.li = li;
		this.hoa = hoa;
	}

	public String getPlace() {
		return this.id.substring(0, 3);
	}

	public String fomat(double d) {
		if (d == (int) d)
			return Integer.toString((int) d);
//			return String.valueOf((int) d);
		else
			return String.format("%.1f", d);
	}

	public double getPriorityPoints() {
		if (getPlace().equals("KV1"))
			return 0.5;
		else if (getPlace().equals("KV2"))
			return 1;
		else
			return 2.5;
	}

	public double getSumPoints() {
		return (double) (toan * 2 + li + hoa);
	}

	public double getPoints() {
		return (double) (getSumPoints() + getPriorityPoints());
	}

	public String TrangThai() {
		if (getPoints() >= 24)
			return "TRUNG TUYEN";
		else
			return "TRUOT";
	}

	@Override
	public String toString() {
		return this.id + " " + this.name + " " + fomat(getPriorityPoints()) + " " + fomat(getSumPoints()) + " "
				+ TrangThai();
	}

}
