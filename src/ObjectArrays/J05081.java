package ObjectArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Items{
	private String idItem;
	private String nameItem;
	private String unitPrice;
	private int purchasePrice;
	private int sellingPrice;

	public Items(int idItem, String nameItem, String unitPrice, int purchasePrice, int sellingPrice) {
		this.idItem = "MH" + String.format("%03d", idItem);
		this.nameItem = nameItem;
		this.unitPrice = unitPrice;
		this.purchasePrice = purchasePrice;
		this.sellingPrice = sellingPrice;
	}
	public int profit(){
		return this.sellingPrice - this.purchasePrice;
	}

	@Override
	public String toString(){
		return String.format("%s %s %s %d %d %d", this.idItem, this.nameItem, this.unitPrice, 
			this.purchasePrice, this.sellingPrice, profit()
		);
	}
}

public class J05081 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			ArrayList<Items> arr = new ArrayList<>();
			for(int i = 1; i <= n; i++){
				sc.nextLine();
				String nameItem = sc.nextLine();
				String unitPrice = sc.nextLine();
				int purchasePrice = sc.nextInt();
				int sellingPrice = sc.nextInt();
				Items item = new Items(i, nameItem, unitPrice, purchasePrice, sellingPrice);
				arr.add(item);
			}
			Collections.sort(arr, new Comparator<Items>() {
				@Override
				public int compare(Items o1, Items o2){
					if(o1.profit() > o2.profit()) return -1;
					else return 1;
				}
			});
			for(Items item : arr){
				System.out.println(item);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
