import java.util.*;
public class demo {
 public static void main(String args[])
 {
	 System.out.println("                      WELCOME TO TAJ,DELHI               ");
	 System.out.println("");
	 System.out.println("		TAJ Hotel is one of the best 5-star resorts in DELHI.");
   
	 Scanner sc=new Scanner(System.in);
	 System.out.println("");
	 System.out.println("ENTER YOUR CHOICE:");
	 System.out.println("1.  DETAILS:");
	 System.out.println("2. BOOKING");
	 int choice=sc.nextInt();
	 if (choice==1)
	 {
		 System.out.println("ARRIVAL : 2:00 ON YOUR TIME OF ARRIVAL");
		 System.out.println("DEPARTURE : 12:00 ON THE DAY YOU WANT TO LEAVE");
		 		
	 }
	 else
		 {
		 System.out.println("DURATION:" );
		 Hotel h1=new Hotel();
	 h1.display();
	    System.out.println("ENTER YOUR CHOICE:");
	    System.out.println("1. BOOK A ROOM");
	    System.out.println("2. ACTIVITIES");
	    System.out.println("3. FEATURES OF THE HOTEL");
	    int choice2;
	    choice2=sc.nextInt();
	    String ch;
	    if(choice2==1)
	    {
	    	
	    	System.out.println("Three types of rooms are available:");
	    		System.out.println("Select one option");
	    		System.out.println("1. LAGOON VIEW 1");
	    		System.out.println("2. LAGOON VIEW 2");
	    		System.out.println("3. LAGOON VIEW 3");
	    		int choice3;
	    		
	    		choice3 = sc.nextInt();
	    		if (choice3==1)
	    		{
	    			Lagoon_View_King l1= new Lagoon_View_King();
	    			l1.details();
	    			l1.book();
	    		}
	    		else if (choice3==2)
	    		{
	    			Lagoon_View_Twin l2 = new Lagoon_View_Twin();
	    			l2.details();
	    			l2.book();
	    		}
	    		else 
	    		{
	    			Sea_View_King l3 = new Sea_View_King();
	    			l3.details();
	    			l3.book();
	    		}
	    		
	    		
	    	
	    }
	    else if(choice2==2)
	    {
	    	System.out.println("ACTIVITIES AVAILABLE");
	    	System.out.println("1. GOLF");
	    	System.out.println("2. CART RACING");
	    	System.out.println("3. RIVER RAFTING");
	    	System.out.println("4. SPA");
	    	
	    	
	    }
	    else
	    {
	    	System.out.println("1. POOL");
	    	System.out.println("2. GYMS");
	    	System.out.println("3. LAWNS");
	    	System.out.println("4. PLAY AREA FOR KIDS");
	    }
		 }
	 System.out.println("PRESS 1 IF YOU WANT TO CONTINUE ELSE PRESS 0");
	 int choice4;
	 choice4=sc.nextInt();
	 if(choice4==1)
	 {
		 System.out.println("PLEASE ENTER YOUR DETAILS:");
		 details d1=new details();
		 d1.input();
		 d1.output();
	 }
	 else
		 return;
	 
	
 }
}
