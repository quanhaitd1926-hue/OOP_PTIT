package JavaBasic;

import java.util.Scanner;

public class J01001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int width = sc.nextInt();
		if(length <= 0 || width <= 0){
			System.out.println(0);
		}
		else{
			System.out.print((length + width) * 2 + " " + length * width);
		}
	}
}
