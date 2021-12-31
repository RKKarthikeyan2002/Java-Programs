import My_Packages.*;
import java.io.*;

class Stack{
	public static void main(String a[]) throws IOException{
		StackOperations s = new StackOperations();
		DataInputStream d = new DataInputStream(System.in);
		int choice;
		while(true){
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.print("Enter your choice: ");
			choice = Integer.parseInt(d.readLine());
			switch(choice){
					case 1:
						int data;
						System.out.print("Enter the Data: ");
						data = Integer.parseInt(d.readLine());
						s.push(data);
						break;

					case 2:
						int item;
						item = s.pop();
						if(item == -1){
							System.out.println("Stack is Underflow\n");
						}
						else{
							System.out.println("Popped Item: "+item);
						}
						break;

					case 3:
						s.display();
						break;

					case 4:
						System.exit(0);
					default:
						System.exit(0);
			}
		}
	}
}