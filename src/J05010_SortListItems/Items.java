package J05010_SortListItems;

public class Items {
	private String id, name, groupItem;
	private double purchersePrice, sellingPrice;

	public Items(int id, String name, String groupItem, double purchersePrice, double sellingPrice) {
		super();
		this.id = String.valueOf(id);
		this.name = name;
		this.groupItem = groupItem;
		this.purchersePrice = purchersePrice;
		this.sellingPrice = sellingPrice;
	}

	public double getProfit() {
		return (double) (this.sellingPrice - this.purchersePrice);
	}

	public String toString() {
		return id + " " + name + " " + groupItem + " " + String.format("%.2f", getProfit());
	}

}
