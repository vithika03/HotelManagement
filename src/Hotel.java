import java.util.*;
class arrival
{
	int date;
	int month;
	int year;
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ARRIVAL");
		System.out.println("Date:");
		date=sc.nextInt();
		System.out.println("Month:");
		month=sc.nextInt();
		System.out.println("Year:");
		year=sc.nextInt();
	}
		
		void display()
		{
			System.out.println("date/"+date+"month/"+month+"year/"+year);
		}
	}
		class departure
		{
			int date;
			int month;
			int year;
			
			void input()
			{
				
				Scanner sc=new Scanner(System.in);
		System.out.println("DEPARTURE");
		System.out.println("Date:");
		date=sc.nextInt();
		System.out.println("Month:");
		month=sc.nextInt();
		System.out.println("Year:");
		year=sc.nextInt();
		
		
	}
			void display()
			{
				System.out.println("date/"+date+"month/"+month+"year/"+year);
			}
}
public class Hotel {
	arrival a1=new arrival();
	departure d1=new departure();
	
	int depart;
	int rooms;
	int adults;
	int children;
	void display()
	{
	a1.input();
	d1.input();
	System.out.println("Number of rooms required:");
	Scanner sc=new Scanner(System.in);
	rooms=sc.nextInt();
	System.out.println("People with age above 25+?:");
	adults=sc.nextInt();
	System.out.println("Number of kids age less than 18:");
	children=sc.nextInt();
	System.out.println("			You have requested to book "+rooms+" room/s for "+adults+" adults and "+children+" children");
	
	
	}
	
	
 }
	
 class rooms
 {
	 int cost;
	 int rooms;
 }
	class Lagoon_View_King extends rooms
 {
	 void details()
	 {
		System.out.println("Come home to soothing views of the sparkling lagoons with the Lagoon ");
		System.out.println("View King rooms at Taj.");
		System.out.println("The aesthetically designed room showcases authentic..");
		System.out.println("");
		System.out.println("The cost of the room is 45,000 INR/per night");
	 }
	 void book()
	 {
		int cost;
		
		System.out.println("Enter number of room required:");
		Scanner sc=new Scanner(System.in);
		rooms=sc.nextInt();
		cost=(22300*rooms);
		System.out.println("The room would cost you "+cost);
		
	 }
 }
	 class Lagoon_View_Twin extends rooms
	 {
		 void details()
		 {
			System.out.println("Relax in our spacious 41-sq.-metre room in tranquil surroundings with a ");
			System.out.println(" view of sparkling lagoons with the Lagoon View Twin rooms in Delhi.");
			
			System.out.println("");
			System.out.println("The cost of the room is 45,000 INR/per night");
		 }
		 void book()
		 {
			int cost;
			System.out.println("Please enter the no of rooms your want to book:");
			Scanner sc=new Scanner(System.in);
			rooms=sc.nextInt();
			cost=(23300*rooms);
			System.out.println("The room would cost you "+cost);
			
		 }
	 }
 
		 class Sea_View_King extends rooms
		 {
			 void details()
			 {
				System.out.println("Gorgeous views of the pristine Arossim Beach and the Arabian Sea welcome you from your private balcony, ");
				System.out.println("where the comfortable sit-out is perfect for a delightful breakfast or an evening with loved ones over Goan food.");
				System.out.println(" Enjoy traditional architectural glimpses of Delhi with a comfortable king-size bed, large marble bathroom with spa-inspired sunken bathtub and ergonomic desk.");
				System.out.println("");
				System.out.println("The cost of the room is 24,000 INR/per night");
			 }
			 void book()
			 {
				int cost;
				System.out.println("Please enter the no of rooms your want to book:");
				Scanner sc=new Scanner(System.in);
				rooms=sc.nextInt();
				cost=(23300*rooms);
				System.out.println("The room would cost you "+cost);
				
			 }
		 }
 	 class details
		 {
			 String name;
			 String country;
			 int address;
			 String city;
			 int phone_no;
			 int id;
			 static int count;
			 details()
			 {
				 id=count;
				 id++;
			 }
			 void input()
			 {
				 Scanner sc= new Scanner(System.in);
			System.out.println("Please input the following details");
			System.out.println(" ENTER YOUR NAME:");
			name=sc.next();
			System.out.println("ENTER YOUR COUNTRY:");
			country=sc.next();
			System.out.println("ENTER YOUR ADDRESS:");
			address=sc.nextInt();
			System.out.println("ENTER CITY:");
			city=sc.next();
			System.out.println("ENTER YOUR PHONE NUMBER:");
			phone_no=sc.nextInt();
			}
			 void output()
			 {
				 System.out.println("THE COMPLETE DETAILS OF THE GUEST:");
				 System.out.println("NAME:"+name);
				 System.out.println("BOOKING ID:"+id);
				 System.out.println("COUNTRY:"+country);
				 System.out.println("ADDRESS:"+address);
				 System.out.println("CITY:"+city);
				 System.out.println("PHONE NUMBER:"+phone_no);
				 
				
				 
			 }
			 
			
		 }
		 
