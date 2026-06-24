package DeclareClassAndObject;

import java.util.Scanner;

class Fraction {
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

public class J04004 {
    public static long ucln(long a, long b) {
		if (b == 0)
			return a;
		else
			return ucln(b, a % b);
	}

	public static long bcnn(long a, long b) {
		return a * b / ucln(a, b);
	}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		Fraction a = new Fraction(scanner.nextLong(), scanner.nextLong());
		Fraction b = new Fraction(scanner.nextLong(), scanner.nextLong());
		long bc = bcnn(a.getMau(), b.getMau());
		a.setTu(a.getTu() * (bc / a.getMau()));
		b.setTu(b.getTu() * (bc / b.getMau()));
		Fraction ans = new Fraction();
		ans.setTu(a.getTu() + b.getTu());
		ans.setMau(bc);
		long uc = ucln(ans.getTu(), ans.getMau());
		ans.setTu(ans.getTu() / uc);
		ans.setMau(ans.getMau() / uc);
		System.out.println(ans);
        scanner.close();
    }
}
