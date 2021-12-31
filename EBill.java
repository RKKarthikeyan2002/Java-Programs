import java.util.*;
class EBill{
	public static void main(String s[]){
		Scanner input=new Scanner(System.in);
		do{
			System.out.println("1. Calculate an Electric Bill. \n2. Exit.");
			System.out.print("Enter your choice: ");
			int c = input.nextInt();
			switch(c)
			{
				case 1:
					ElectricBill e = new ElectricBill();
					e.getdata();
					e.calculate();
					e.display();
				case 2:
					System.exit(0);
				default:
					System.out.println("You enter invalid choice...");
		    }
		}while(true);
	}
}

class ElectricBill{
	String customer_name, customer_no;
	int pmr, cmr, unit, ch;
	double amt = 0;
	Scanner input=new Scanner(System.in);
	void getdata(){
		System.out.print("Enter Person Name: ");
		customer_name=input.nextLine();
		System.out.print("Enter Customer Number: ");
		customer_no=input.nextLine();
		System.out.print("Enter Previous Month Reading: ");
		pmr = input.nextInt();
		System.out.print("Enter Current Month Reading: ");
		cmr = input.nextInt();
		unit = cmr - pmr;
	}
	void calculate(){
		int choice;
		System.out.println("1. Domestic. \n2. Commercial.");
		System.out.print("Enter your choice: ");
		choice = input.nextInt();
		if(choice == 1){
			if(unit > 0 && unit <= 100){
				amt = unit * 1;
			}
			else if(unit > 100 && unit <= 200){
				amt = (100*1);
				amt = amt + ((unit-100)*2.50);
			}
			else if(unit > 200 && unit <= 500){
				amt = (100*1) + (100*2.50) + (unit-200)*4;
			}
			else{
				amt = (100*1) + (100*2.50) + (300*4) + (unit-500)*6;
			}
		}
		else if(choice == 2){
			if(unit <= 100){
				amt = unit * 2;
			}
			else if(unit > 100 && unit <= 200){
				amt = (100*2) + (unit-100)*4.50;
			}
			else if(unit > 200 && unit <= 500){
				amt = (100*2) + (100*4.50) + (unit-200)*6;
			}
			else{
				amt = (100*2) + (100*4.50) + (300*6) + (unit-500)*7;
			}
		}
		else{
			System.out.println("You enter invalid choice...");
		}
	}
	void display(){
			System.out.print("Name \t\t Bill Number \t PMR \t CMR \t Total Reading \t Amount\n");
			System.out.println("-----------------------------------------------------------------------");
			System.out.println(customer_name+ " \t " +customer_no+ " \t\t " +pmr+ " \t " +cmr+ " \t " +unit+ " \t\t " +amt);
			System.out.println("-----------------------------------------------------------------------");
	}
}