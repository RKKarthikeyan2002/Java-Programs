import java.util.*;
class currency
{
	double inr, usd, euro, yen;
	Scanner in = new Scanner(System.in);
	public void dollartorupee()
	{
		System.out.print("Enter dollars to convert into Rupees: ");
		usd = in.nextDouble();
		inr = usd*73.51;
		System.out.println(usd+" Doller " +"equal to "+inr+" Rupee");
	}
	public void rupeetodollar()
	{
		System.out.print("Enter Rupee to convert into Dollars: ");
		inr = in.nextDouble();
		usd = inr/73.51;
		System.out.println(inr+" Rupee " +"equal to "+usd+" Doller");
	}
	public void eurotorupee()
	{
		System.out.print("Enter euro to convert into Rupees: ");
		euro = in.nextDouble();
		inr = euro*86.76;
		System.out.println(euro+" Euro " +"equal to "+inr+" Rupee");
	}
	public void rupeetoeuro()
	{
		System.out.print("Enter Rupees to convert into Euro: ");
		inr = in.nextDouble();
		euro = inr/86.76;
		System.out.println(inr+" Rupee " +"equal to "+euro+" Euro");
	}
	public void yentorupee()
	{
		System.out.print("Enter yen to convert into Rupees: ");
		yen = in.nextDouble();
		inr = yen/1.50;
		System.out.println(yen+" Yen " +"equal to "+inr+" Rupee");
	}
	public void rupeetoyen()
	{
		System.out.print("Enter Rupees to convert into Yen: ");
		inr = in.nextDouble();
		yen = inr*1.50;
		System.out.println(inr+" Rupee " +"equal to "+yen+" Yen");
	}
}
//package distanceconversion;
class distance
{
	double km, m, miles;
	Scanner sc = new Scanner(System.in);
	public void kmtom()
	{
		System.out.print("Enter in km: ");
		km = sc.nextDouble();
		m = km*1000;
		System.out.print(km+" km equal to "+m+" metres");
	}
	public void mtokm()
	{
		System.out.print("Enter in meter: ");
		m = sc.nextDouble();
		km = m/1000;
		System.out.println(m+" m " +"equal to "+km+" kilometres");
	}
	public void milestokm()
	{
		System.out.print("Enter in miles: ");
		miles = sc.nextDouble();
		km = miles*0.621371;
		System.out.println(miles+" miles " +"equal to "+km+" kilometres");
	}
	public void kmtomiles()
	{
		System.out.print("Enter in km: ");
		km = sc.nextDouble();
		miles = km*0.621371;
		System.out.println(km+" km " +"equal to "+miles+" miles");
	}
}

//package timeconversion;
class timer
{
	int hours, seconds, minutes;
	Scanner sc = new Scanner(System.in);
	public void secondstohours()
	{
		System.out.print("Enter the number of seconds: ");
		seconds = sc.nextInt();
		hours = seconds/3600;
		System.out.println(seconds+" Seconds " +"equal to "+hours+" Hours");
	}
	public void minutestohours()
	{
		System.out.print("Enter the number of minutes: ");
		minutes = sc.nextInt();
		hours = minutes/60;
		System.out.println(minutes+" Minutes " +"equal to "+hours+" Hours");
	}
	public void hourstominutes()
	{
		System.out.print("enter the no of hours: ");
		hours = sc.nextInt();
		minutes = hours*60;
		System.out.println(hours+" Hours " +"equal to "+minutes+" Minutes");
	}
	public void hourstoseconds()
	{
		System.out.print("enter the no of hours: ");
		hours = sc.nextInt();
		seconds = hours*3600;
		System.out.println(hours+" Hours " +"equal to "+seconds+" Seconds");
	}
}

//import currencyconversion.*;
//import distanceconversion.*;
//import timeconversion.*;
class converter
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int choice;
		currency c = new currency();
		distance d = new distance();
		timer t = new timer();
		do
		{
			System.out.println("1. Currency Converter ");
			System.out.println("2. Distance Converter ");
			System.out.println("3. Time Converter ");
			System.out.println("4. Exit ");
			System.out.print("Enter your choice: ");
			choice = s.nextInt();
			System.out.println("");
			switch(choice){
				case 1:
					System.out.println("1. Dollar to Rupee ");
					System.out.println("2. Rupee to Dollar ");
					System.out.println("3. Euro to Rupee ");
					System.out.println("4. Rupee to Euro ");
					System.out.println("5. Yen to Rupee ");
					System.out.println("6. Rupee to Yen ");
					System.out.print("Enter your choice: ");
					choice = s.nextInt();
					switch(choice){
						case 1:
							c.dollartorupee();
							break;
						case 2:
							c.rupeetodollar();
							break;
						case 3:
							c.eurotorupee();
							break;
						case 4:
							c.rupeetoeuro();
							break;
						case 5:
							c.yentorupee();
							break;
						case 6:
							c.rupeetoyen();
							break;
						default:
							System.out.println("You entered invalid choice... ");
					}
					break;
				case 2:
					System.out.println("1. Meter to Kilometer ");
					System.out.println("2. Kilometer to Meter ");
					System.out.println("3. Miles to Kilometer ");
					System.out.println("4. Kilometer to Miles");
					System.out.print("Enter your choice: ");
					choice = s.nextInt();
					System.out.println("");
					switch(choice){
						case 1:
							d.mtokm();
							break;
						case 2:
							d.kmtom();
							break;
						case 3:
							d.milestokm();
							break;
						case 4 :
							d.kmtomiles();
							break;
						default:
							System.out.println("You entered invalid choice... ");
					}
					break;
				case 3:
					System.out.println("1. Hours to Minutes");
					System.out.println("2. Hours to Seconds");
					System.out.println("3. Seconds to Hours");
					System.out.println("4. Minutes to Hours");
					System.out.print("Enter your choice: ");
					choice = s.nextInt();
					System.out.println("");
					switch(choice)
					{
						case 1:
							t.hourstominutes();
							break;
						case 2:
							t.hourstoseconds();
							break;
						case 3:
							t.secondstohours();
							break;
						case 4:
							t.minutestohours();
							break;
						default:
							System.out.println("You entered invalid choice... ");
					}
					break;
				case 4:
					System.exit(0);
			}
			System.out.println("");
			System.out.print("Enter 0 to quit and 1 to continue ");
			choice = s.nextInt();
			System.out.println("");
		}while(choice == 1);
	}
}