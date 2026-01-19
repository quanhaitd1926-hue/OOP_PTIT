package J05052_J05053_SearchSortOrder;

public class Order implements IOrder {
	private String name, id;
	private long unitPrice, quantity;

	public Order(String name, String id, long unitPrice, long quantity) {
		super();
		this.name = name;
		this.id = id;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	@Override
	public int getId() {
		return Integer.parseInt(id.substring(4));
	}

	@Override
	public long discount() {
		if (getId() == 1)
			return Math.round(0.5 * unitPrice * quantity);
		else
			return Math.round(0.3 * unitPrice * quantity);
	}

	@Override
	public long Money() {
		return unitPrice * quantity - discount();
	}

	@Override
	public String getSTT() {
		return id.substring(1, 4);
	}

	@Override
	public String toString() {
		return this.name + " " + this.id + " " + getSTT() + " " + discount() + " " + Money();
	}

}
