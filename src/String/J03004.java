package String;

import java.util.Scanner;

public class J03004 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			sc.nextLine();
			while(t-- > 0){
				String s = sc.nextLine();
				String[] arr = s.trim().split("\\s+");
				String name = "";
				for(String tmp : arr){
					name += Character.toUpperCase(tmp.charAt(0));
					for(int i = 1; i < tmp.length(); i++){
						name += Character.toLowerCase(tmp.charAt(i));
					}
					name += " ";
				}
				name = name.trim();
				System.out.println(name);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
