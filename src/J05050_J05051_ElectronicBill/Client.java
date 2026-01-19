package J05050_J05051_ElectronicBill;

public class Client implements IClient {
	private String id, typeUse;
	private int iOld, iNew;

	public Client(int id, String typeUse, int iOld, int iNew) {
		super();
		this.id = "KH" + String.format("%02d", id);
		this.typeUse = typeUse;
		this.iOld = iOld;
		this.iNew = iNew;
	}

	@Override
	public int getCoefficient() {
		if (this.typeUse.equals("KD"))
			return 3;
		else if (this.typeUse.equals("NN"))
			return 5;
		else if (this.typeUse.equals("TT"))
			return 4;
		else
			return 2;
	}

	@Override
	public long Money() {
		return (long) ((iNew - iOld) * getCoefficient() * 550);
	}

	@Override
	public long PhuTroi() {
		long idx = iNew - iOld;
		if (idx < 50)
			return 0;
		else if (idx >= 50 && idx <= 100)
			return Math.round((Money() * 0.35) / 10.0) * 10;
		else
			return Money();
	}

	@Override
	public long sumMoney() {
		return PhuTroi() + Money();
	}

	@Override
	public String toString() {
		return this.id + " " + getCoefficient() + " " + Money() + " " + PhuTroi() + " " + sumMoney();
	}

}
