import java.io.*;
import java.util.*;
import java.io.IOException;
class Employee
{
	int Emp_id;
	long Mobile_no;
	String Emp_name, Address, Mail_id;
	DataInputStream get = new DataInputStream(System.in);
	void getdetails() throws IOException
	{
		DataInputStream get = new DataInputStream(System.in);
		System.out.print("Enter Employee Name: ");
		Emp_name = get.readLine();
		System.out.print("Enter Mail ID: ");
		Mail_id = get.readLine();
		System.out.print("Enter Employee Address: ");
		Address = get.readLine();
		System.out.print("Enter employee ID: ");
		Emp_id = Integer.parseInt(get.readLine());
		System.out.print("Enter Mobile Number: ");
		Mobile_no = Long.parseLong(get.readLine());
	}
	void show()
	{
		System.out.println("Employee Name: "+Emp_name);
		System.out.println("Employee ID: "+Emp_id);
		System.out.println("Mail ID: "+Mail_id);
		System.out.println("Address: "+Address);
		System.out.println("Mobile Number: "+Mobile_no);
	}
}
class Programmer extends Employee
{
	double salary, BP, DA, HRA, PF, club, net, gross;
	void getprogrammer() throws IOException
	{
		System.out.print("Enter basic pay: ");
		BP = Double.parseDouble(get.readLine());
	}
	void calculateprog()
	{
		DA = (0.97 * BP);  HRA = (0.10 * BP);  PF = (0.12 * BP);
		club = (0.1 * BP);  gross = (BP + DA + HRA);  net = (gross - PF - club);
		//System.out.println("");
		System.out.println("\n============PAY SLIP FOR PROGRAMMER============\n");
		System.out.println("Basic Pay: Rs. "+BP);
		System.out.println("DA: Rs. "+DA);
		System.out.println("HRA: Rs. "+HRA);
		System.out.println("PF: Rs. "+PF);
		System.out.println("CLUB: Rs. "+club);
		System.out.println("GROSS PAY: Rs. "+gross);
		System.out.println("NET PAY: Rs. "+net);
	}
}
class AssistantProfessor extends Employee
{
	double salary, BP, DA, HRA, PF, club, net, gross;
	void getasst() throws IOException
	{
		System.out.println("Enter basic pay: ");
		BP = Double.parseDouble(get.readLine());
	}
	void calculateasst()
	{
		DA = (0.97 * BP);  HRA = (0.10 * BP);  PF = (0.12 * BP);
		club = (0.1 * BP);  gross = (BP + DA + HRA);  net = (gross - PF - club);
		System.out.println("\n============PAY SLIP FOR ASSISTANT PROFESSOR============\n");
		System.out.println("Basic Pay: Rs. "+BP);
		System.out.println("DA: Rs. "+DA);
		System.out.println("HRA: Rs. "+HRA);
		System.out.println("PF: Rs. "+PF);
		System.out.println("CLUB: Rs. "+club);
		System.out.println("GROSS PAY: Rs. "+gross);
		System.out.println("NET PAY: Rs. "+net);
	}
}
class AssociateProfessor extends Employee
{
	double salary, BP, DA, HRA, PF, club, net, gross;
	void getassociate() throws IOException
	{
		System.out.println("Enter basic pay: ");
		BP = Double.parseDouble(get.readLine());
	}
	void calculateassociate()
	{
		DA = (0.97 * BP);  HRA = (0.10 * BP);  PF = (0.12 * BP);
		club = (0.1 * BP);  gross = (BP + DA + HRA);  net = (gross - PF - club);
		System.out.println("\n============PAY SLIP FOR ASSOCIATE PROFESSOR============\n");
		System.out.println("Basic Pay: Rs. "+BP);
		System.out.println("DA: Rs. "+DA);
		System.out.println("HRA: Rs. "+HRA);
		System.out.println("PF: Rs. "+PF);
		System.out.println("CLUB: Rs. "+club);
		System.out.println("GROSS PAY: Rs. "+gross);
		System.out.println("NET PAY: Rs. "+net);
	}
}
class Professor extends Employee
{
	double salary, BP, DA, HRA, PF, club, net, gross;
	void getprofessor() throws IOException
	{
		System.out.println("Enter basic pay: ");
		BP = Double.parseDouble(get.readLine());
	}
	void calculateprofessor()
	{
		DA = (0.97 * BP);  HRA = (0.10 * BP);  PF = (0.12 * BP);
		club = (0.1 * BP);  gross = (BP + DA + HRA);  net = (gross - PF - club);
		System.out.println("\n============PAY SLIP FOR PROFESSOR============\n");
		System.out.println("Basic Pay: Rs. "+BP);
		System.out.println("DA: Rs. "+DA);
		System.out.println("HRA: Rs. "+HRA);
		System.out.println("PF: Rs. "+PF);
		System.out.println("CLUB: Rs. "+club);
		System.out.println("GROSS PAY: Rs. "+gross);
		System.out.println("NET PAY: Rs. "+net);
	}
}
class Amount
{
	public static void main(String args[]) throws IOException
	{
		int choice,cont;
		do
		{
			System.out.println("1. Programmer");
			System.out.println("2. Assistant Professor");
			System.out.println("3. Associate Professor");
			System.out.println("4. Professor");
			System.out.println("5. Exit");
			DataInputStream c = new DataInputStream(System.in);
			System.out.print("Enter Your Choice: ");
			choice=Integer.parseInt(c.readLine());
			switch(choice)
			{
				case 1:
					Programmer p = new Programmer();
					p.getdetails();
					p.getprogrammer();
					p.show();
					p.calculateprog();
					break;

				case 2:
					AssistantProfessor at = new AssistantProfessor();
					at.getdetails();
					at.getasst();
					at.show();
					at.calculateasst();
					break;

				case 3:
					AssociateProfessor ao = new AssociateProfessor();
					ao.getdetails();
					ao.getassociate();
					ao.show();
					ao.calculateassociate();
					break;

				case 4:
					Professor prof = new Professor();
					prof.getdetails();
					prof.getprofessor();
					prof.show();
					prof.calculateprofessor();
					break;

				case 5:
					System.exit(0);

				default:
					System.out.println("You entered invalid choice.......");
			}
			System.out.print("\nPlease enter 0 to quit and 1 to continue: ");
			choice=Integer.parseInt(c.readLine());
		}while(choice==1);
	}
}