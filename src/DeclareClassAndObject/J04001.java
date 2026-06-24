package DeclareClassAndObject;

import java.util.Scanner;

class Point{
    private double x;
    private double y;

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public static double distance(Point p1, Point p2){
        double res;
        double x = p1.x - p2.x;
        double y = p1.y - p2.y;
        res = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return res;
    }
}

public class J04001 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-- > 0){
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                double d = sc.nextDouble();
                Point p1 = new Point(a, b);
                Point p2 = new Point(c, d);
                System.out.printf("%.4f\n", Point.distance(p1, p2));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
