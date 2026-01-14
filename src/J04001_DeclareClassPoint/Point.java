package J04001_DeclareClassPoint;

public class Point {
	private double x, y;

	public Point() {
		super();
	}

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point(Point p) {

	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

//	public double distance(Point secondPoint) {
//
//	}
//
//	public double distance(Point a, Point b) {
//
//	}
}
