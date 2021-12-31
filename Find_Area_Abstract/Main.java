import java.io.*;
class Main{
	public static void main(String args[])throws IOException{
		int ch;
		DataInputStream d = new DataInputStream(System.in);
		while(true){
			System.out.println("1. Find Area of Rectangle.");
			System.out.println("2. Find Area of Triangle.");
			System.out.println("3. Find Area of Circle.");
			System.out.println("4. Exit.");
			System.out.print("Enter your choice: ");
			ch = Integer.parseInt(d.readLine());
			switch(ch){
				case 1: int a, b;
						System.out.print("\nEnter the Length of Rectangle: ");
						a = Integer.parseInt(d.readLine());
						System.out.print("Enter the Breath of Rectangle: ");
						b = Integer.parseInt(d.readLine());
						Rectangle rec = new Rectangle(a, b);
						System.out.println("Area of Rectangle: "+rec.Area()+"\n");
						break;

				case 2: int hei, bre;
						System.out.print("\nEnter the Height of Rectangle: ");
						hei = Integer.parseInt(d.readLine());
						System.out.print("Enter the Breath of Rectangle: ");
						bre = Integer.parseInt(d.readLine());
						Triangle tri = new Triangle(hei, bre);
						System.out.println("Area of Triangle: "+tri.Area()+"\n");
						break;

				case 3: int rad;
						System.out.print("\nEnter the Radius of Rectangle: ");
						rad = Integer.parseInt(d.readLine());
						Circle c = new Circle(rad);
						System.out.printf("Area of Circle: %.3f\n\n",c.Area());
						break;

				case 4: System.exit(0);

				default: System.out.println("\nYou entered invalid choice...");  System.exit(0);
			}
		}
	}
}