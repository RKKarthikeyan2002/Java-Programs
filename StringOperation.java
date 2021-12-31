import java.io.*;
import java.util.*;

class Operations{
	String str1;
	ArrayList<String> str = new ArrayList<String>();
	DataInputStream in = new DataInputStream(System.in);
	void Append()throws IOException{
		System.out.print("Enter a String: ");
		str1 = in.readLine();
		str.add(str1);
		System.out.println("String added\n");
	}
	void Insert()throws IOException{
		int n;
		System.out.print("Enter a String: ");
		str1 = in.readLine();
		System.out.print("Enter the position to Insert (greater than 0): ");
		n = Integer.parseInt(in.readLine());
		str.add(n-1, str1);
		System.out.println("String added\n");
	}
	void search()throws IOException{
		int n;
		System.out.print("Enter a String: ");
		str1 = in.readLine();
		n = str.indexOf(str1);
		System.out.println(str1+" is placed in "+n+"th Index.\n");
	}
	void findstr()throws IOException{
		String str2;
		System.out.print("Enter a character: ");
		str2 = in.readLine();
		System.out.println("List all string starts with given letter");
		for(int i=0; i<str.size(); i++){
			str1 = str.get(i);
			if(str1.startsWith(str2))
				System.out.print(str1+" ");
		}
	}
	void display(){
		System.out.println(str);
	}
}
class StringOperation{
	public static void main(String args[])throws IOException{
		int choice;
		DataInputStream input = new DataInputStream(System.in);
		Operations strop = new Operations();
		while(true){
			System.out.println("\n1. Append.");
			System.out.println("2. Insert.");
			System.out.println("3. Search.");
			System.out.println("4. List all string starts with given letter");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = Integer.parseInt(input.readLine());
			switch(choice){
				case 1: strop.Append();  strop.display();
					    break;

				case 2: strop.Insert();  strop.display();
					    break;

				case 3: strop.search();
					    break;

				case 4: strop.findstr();
					    break;

				case 5: System.exit(0);

				default: System.out.println("You entered invalid choice......");
						 System.exit(0);
			}
		}
	}
}