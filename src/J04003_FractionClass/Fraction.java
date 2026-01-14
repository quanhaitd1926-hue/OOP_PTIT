package J04003_FractionClass;

public class Fraction {
	private long tu, mau;

	public Fraction(long tu, long mau) {
		super();
		this.tu = tu;
		this.mau = mau;
	}

	public long gcd(long a, long b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	public String toString() {
		return tu / gcd(tu, mau) + "/" + mau / gcd(tu, mau);
	}
}
