package J04002_DeclareClassRectange;

public class Rectange {
	private double width, length;
	private String color;

	public Rectange(double width, double length, String color) {
		super();
		this.width = width;
		this.length = length;
		this.color = color;
	}

	public Rectange() {
		super();
		this.length = 1;
		this.width = 1;
	}

	public String ChuanHoa(String s) {
		String color = "";
		color += s.charAt(0);
		color = color.toUpperCase();
		for (int i = 1; i < s.length(); i++) {
			color += Character.toLowerCase(s.charAt(i));
		}
		return color;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double findArea() {
		return this.length * this.width;
	}

	public double findPerimeter() {
		return 2 * (this.length + this.width);
	}

	public String toString() {
		return (int) findPerimeter() + " " + (int) findArea() + " " + ChuanHoa(this.color);
	}

}
