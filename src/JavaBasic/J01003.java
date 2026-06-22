package JavaBasic;

import java.util.Scanner;

public class J01003 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a != 0){
				if(b == 0) System.out.println(0);
				else{
					System.out.printf("%.2f", (double)-b / a);
				}
			}
			else{
				if(b == 0) System.out.println("VSN");
				else System.out.println("VN");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
