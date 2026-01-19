package J05048_J05049_BangTheoDoiNhapXuatHang;

public class Product implements IProduct {
	private String id;
	private int quantity;

	public String getId() {
		return this.id;
	}

	public Product(String id, int quantity) {
		super();
		this.id = id;
		this.quantity = quantity;
	}

	@Override
	public long SoLuongXuat() {
		if (this.id.charAt(0) == 'A')
			return Math.round((quantity * 0.6) * 10.0) / 10;
		else
			return Math.round((quantity * 0.7) * 10.0) / 10;
	}

	@Override
	public long unitPrice() {
		if (this.id.charAt(4) == 'Y')
			return 110000;
		else
			return 135000;
	}

	@Override
	public long Money() {
		return (long) SoLuongXuat() * unitPrice();
	}

	@Override
	public long Tax() {
		if (this.id.charAt(0) == 'A' && this.id.charAt(4) == 'Y')
			return Math.round(Money() * 0.08);
		else if (this.id.charAt(0) == 'A' && this.id.charAt(4) == 'N')
			return Math.round(Money() * 0.11);
		else if (this.id.charAt(0) == 'B' && this.id.charAt(4) == 'Y')
			return Math.round(Money() * 0.17);
		else
			return Math.round(Money() * 0.22);
	}

	@Override
	public String toString() {
		return this.id + " " + this.quantity + " " + SoLuongXuat() + " " + unitPrice() + " " + Money() + " " + Tax();
	}

	@Override
	public char getChar() {
		return this.id.charAt(0);
	}

}
