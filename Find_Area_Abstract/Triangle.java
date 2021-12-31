public class Triangle extends Shape{
	private double len, breath;
	private double area;
	public Triangle(double a, double b){
		len = a;
		breath = b;
	}
	public double Area(){
		area = 0.5 * len * breath;
		return area;
	}
}