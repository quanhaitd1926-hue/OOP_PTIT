package J04005_DeclareClassCandidate;

public class Candidate {
	private String name, birth;
	private double point1, point2, point3;

	public Candidate(String name, String birth, double point1, double point2, double point3) {
		this.name = name;
		this.birth = birth;
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}

	@Override
	public String toString() {
		return this.name + " " + this.birth + " "
				+ String.format("%.1f", (double) (this.point1 + this.point2 + this.point3));
	}
}
