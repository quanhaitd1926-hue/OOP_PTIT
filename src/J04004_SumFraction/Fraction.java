package J04004_SumFraction;

public class Fraction {
	private long tu, mau;

	public Fraction(long tu, long mau) {
		super();
		this.tu = tu;
		this.mau = mau;
	}

	public Fraction() {
		super();
	}

	public long getTu() {
		return tu;
	}

	public void setTu(long tu) {
		this.tu = tu;
	}

	public long getMau() {
		return mau;
	}

	public void setMau(long mau) {
		this.mau = mau;
	}

	public String toString() {
		return tu + "/" + mau;
	}

}
