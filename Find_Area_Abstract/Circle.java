import java.lang.Math.*;
public class Circle extends Shape{
	private double rad;
	private double area;
	public Circle(double a){
		rad = a;
	}
	public double Area(){
		area = Math.PI * rad * rad;
		return area;
	}
}