package J05081_ListItems;

public class Items {
	private String id, name, unit;
	private int purchasePrice, sellingPrice;

	public Items(int id, String name, String unit, int purchasePrice, int sellingPrice) {
		super();
		this.id = "MH" + String.format("%03d", id);
		this.name = name;
		this.unit = unit;
		this.purchasePrice = purchasePrice;
		this.sellingPrice = sellingPrice;
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

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public int getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public int getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public int getProfit() {
		return this.sellingPrice - this.purchasePrice;
	}

	public String toString() {
		return this.id + " " + this.name + " " + this.unit + " " + this.purchasePrice + " " + this.sellingPrice + " "
				+ getProfit();
	}

}
