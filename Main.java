package Payment_Processing_System;

import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		processing p1=new processing();
		System.out.println("Enter the amount that u need to pay ?");
		double a=sc.nextDouble();
		credit_card p=new credit_card();
		upi u=new upi();
		int choice;
		while(true) {
			 System.out.println();
			System.out.println("Credit_Card method:01");
			System.out.println("UPI method:02");
			choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.println("---Credit card detailes--- ");
				   System.out.println("Enter the card number:");
			       int card_no=sc.nextInt();
			       sc.nextLine();
			       System.out.println("Enter the HolderName: ");
			       String name=sc.nextLine();
			       System.out.println();
				   p1.process(p,a);
				   break;
				   
			case 2:System.out.println("---Upi detailes--- ");
			       sc.nextLine();
			       System.out.println("Enter the upi id:");
			       String upi=sc.nextLine();
			       p1.process(u,a);
			       break;
			       
			 default:System.out.println("Sorry Bro u entered wrong move..");      
			       
			}
			
		}
		
	
		
	}

}
