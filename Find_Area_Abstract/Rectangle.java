public class Rectangle extends Shape{
	private double len, breath;
	private double area;
	public Rectangle(double a, double b){
		len = a;
		breath = b;
	}
	public double Area(){
		area = len * breath;
		return area;
	}
}
