package J05018_ScoreBoard;

public class Student {
	private String id, name, point;

	public Student(int id, String name, String point) {
		super();
		this.id = "HS" + String.format("%02d", id);
		this.name = name;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPoint() {
		String[] arr = point.split("\\s+");
		double score = 0;
		score += (double) 2 * Double.parseDouble(arr[0]);
		score += (double) 2 * Double.parseDouble(arr[1]);
		for (int i = 2; i < arr.length; i++) {
			score += Double.parseDouble(arr[i]);
		}
		score = score / 12;
		return Math.round(score * 10.0) / 10.0;
	}

	public String rating() {
		if (getPoint() >= 9)
			return "XUAT SAC";
		else if (getPoint() >= 8)
			return "GIOI";
		else if (getPoint() >= 7)
			return "KHA";
		else if (getPoint() >= 5)
			return "TB";
		else
			return "YEU";
	}

	@Override
	public String toString() {
		return this.id + " " + this.name + " " + String.format("%.1f", getPoint()) + " " + rating();
	}
}
