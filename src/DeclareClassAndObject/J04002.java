package DeclareClassAndObject;

import java.util.Scanner;

class Rectange{
	private int length;
	private int width;
	private String color;

	Rectange(){
		this.length = 1;
		this.width = 1;
	}
	Rectange(int length, int width, String color){
		this.length = length;
		this.width = width;
		this.color = color;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public int findArea(){
		return this.length * this.width;
	}

	public int findPerimeter(){
		return (this.length + this.width) * 2;
	}

	public String ChuanHoa(String s){
		String res = "";
		char[] colorTmp = s.toCharArray();
		res += Character.toUpperCase(colorTmp[0]);
		for(int i = 1; i < colorTmp.length; i++){
			res += Character.toLowerCase(colorTmp[i]);
		}
		return res;
	}
	
	@Override
	public String toString(){
		return findPerimeter() + " " + findArea() + " " + ChuanHoa(this.color);
	}
}

public class J04002 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int length = sc.nextInt();
			int width = sc.nextInt();
			String color = sc.next();
			if(length <= 0 || width <= 0) System.out.println("INVALID");
			else{
				Rectange rec = new Rectange(length, width, color);
				System.out.println(rec);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
