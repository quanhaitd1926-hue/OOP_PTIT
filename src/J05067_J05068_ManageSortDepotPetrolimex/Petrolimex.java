package J05067_J05068_ManageSortDepotPetrolimex;

public class Petrolimex implements IPetrolimex {
	private String id;
	private long quantity;

	public Petrolimex(String id, long quantity) {
		super();
		this.id = id;
		this.quantity = quantity;
	}

	@Override
	public String getProductID() {
		return this.id.substring(0, 1);
	}

	@Override
	public String getManufactureID() {
		return this.id.substring(3, 5);
	}

	@Override
	public long unitPrice() {
		if (getProductID().equals("X"))
			return 128000;
		else if (getProductID().equals("D"))
			return 11200;
		else
			return 9700;
	}

	@Override
	public long Tax() {
		if ((getProductID().equals("X") || getProductID().equals("D") || getProductID().equals("N"))
				&& getManufactureID().equals("TN"))
			return 0;
		else if (getProductID().equals("X"))
			return Math.round(this.quantity * unitPrice() * 0.03);
		else if (getProductID().equals("D"))
			return Math.round(this.quantity * unitPrice() * 0.035);
		else
			return Math.round(this.quantity * unitPrice() * 0.02);
	}

	@Override
	public long Money() {
		return Tax() + unitPrice() * this.quantity;
	}

	@Override
	public String getManufactureName() {
		if (getManufactureID().equals("BP"))
			return "British Petro";
		else if (getManufactureID().equals("ES"))
			return "Esso";
		else if (getManufactureID().equals("SH"))
			return "Shell";
		else if (getManufactureID().equals("CA"))
			return "Castrol";
		else if (getManufactureID().equals("MO"))
			return "Mobil";
		else
			return "Trong Nuoc";
	}

	@Override
	public String toString() {
		return this.id + " " + getManufactureName() + " " + unitPrice() + " " + Tax() + " " + Money();
	}

}
