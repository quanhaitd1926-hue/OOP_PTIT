package File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Customer{
	private String id;
	private String name;
	private String roomId;
	private String checkInDate;
	private String checkOutDate;

	public Customer(int id, String name, String roomId, String checkInDate, String checkOutDate) {
		this.id = "KH" + String.format("%02d", id);
		this.name = name;
		this.roomId = roomId;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
	}
	
	public String getCheckInDate() {
		return checkInDate;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public static int caculatorDate(String checkIn, String checkOut) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d1 = LocalDate.parse(checkIn, fmt);
		LocalDate d2 = LocalDate.parse(checkOut, fmt);
		return (int) ChronoUnit.DAYS.between(d1, d2);
	}

	@Override
	public String toString(){
		return String.format("%s %s %s %d", this.id, this.name, this.roomId,
			caculatorDate(this.checkInDate, this.checkOutDate));
	}
}

public class J07046 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new BufferedReader(new FileReader("KHACH.in")))) {
			int n = Integer.valueOf(sc.nextLine());
			ArrayList<Customer> arr = new ArrayList<>();
			for(int i = 1; i <= n; i++){
				String name = sc.nextLine();
				String roomId = sc.nextLine();
				String checkInDate = sc.nextLine();
				String checkOutDate = sc.nextLine();
				arr.add(new Customer(i, name, roomId, checkInDate, checkOutDate));
			}
			Collections.sort(arr, new Comparator<Customer>() {
				@Override
				public int compare(Customer o1, Customer o2) {
					return Integer.compare(Customer.caculatorDate(o2.getCheckInDate(), o2.getCheckOutDate()),
						Customer.caculatorDate(o1.getCheckInDate(), o1.getCheckOutDate()));
				}
			});
			arr.forEach(customers -> System.out.println(customers));
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
