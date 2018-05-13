package test1;

public class Calculate {
public double getArea(double x) {
	return x*x;
	
}
public double getArea(double x,double y) {
	return x*y;
}
public void draw(int num) {
	System.out.println("画"+num+"个任意形状的图形");
}
public void draw(String shape) {	
	System.out.println("画一个"+shape);
}
public static void main(String[] args) {
	Calculate calculate = new Calculate();
	double x=20.2;
	double y=1.11;
	System.out.println(calculate.getArea(x));
	System.out.println(calculate.getArea(x, y));
	calculate.draw(2);
	calculate.draw("其孤傲熊");
}
}
