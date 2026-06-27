package File;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class LoaiPhong implements Comparable<LoaiPhong> {
	private String id;
	private String name;
	private long price;
	private double servicePrice;

	public LoaiPhong(String s) {
		String[] arr = s.trim().split("\\s+");
		this.id = arr[0];
		this.name = arr[1];
		this.price = Integer.valueOf(arr[2]);
		this.servicePrice = Double.valueOf(arr[3]);
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString(){
		return this.id + " " + this.name + " " + this.price + " " + this.servicePrice;
	}

	@Override
	public int compareTo(LoaiPhong other) {
		return this.name.compareTo(other.name);
	}
}

public class J07045{
	public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
		Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
		in.close();
    }
}
