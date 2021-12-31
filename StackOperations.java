package My_Packages;
import java.io.*;
public class StackOperations{
	DataInputStream d = new DataInputStream(System.in);
	int size, top, a[];
	public StackOperations() throws IOException{
		top = -1;
		System.out.print("Enter the Stack Capacity: ");
		size = Integer.parseInt(d.readLine());
		a = new int[size];
	}
	public void push(int data){
		if(top >= size-1){
			System.out.println("Stack is Overflow.\n");
		}
		else{
			top++;
			a[top] = data;
			System.out.println(data+" is pushed");
		}
	}
	public int pop(){
		if(top == -1){
			//System.out.println("Stack is Underflow\n");
			return -1;
		}
		else{
			return a[top--];
		}
	}
	public void display(){
		for(int i=top; i>=0; i--){
			System.out.println("\t"+a[i]);
		}
	}
}