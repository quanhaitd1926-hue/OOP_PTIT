package J05047_BangKeNhapKhoSapXepTheoChietKhau;

public class Product {
	private String id, name;
	private int quantity;
	private long unitPrice;

	public Product(String name, int quantity, long unitPrice, String id) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.id = id;
	}

	public long TienChietKhau() {
		long sumPrice = this.unitPrice * this.quantity;
		if (this.quantity > 10) {
			return Math.round(sumPrice * 0.05);
		} else if (this.quantity >= 8)
			return Math.round(sumPrice * 0.02);
		else if (this.quantity >= 5)
			return Math.round(sumPrice * 0.01);
		else
			return 0;
	}

	public long getFee() {
		return this.unitPrice * this.quantity - TienChietKhau();
	}

	@Override
	public String toString() {
		return this.id + " " + this.name + " " + TienChietKhau() + " " + getFee();
	}
}
