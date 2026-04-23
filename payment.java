package Payment_Processing_System;

public interface payment {
	public abstract void payment_process(double amount);

}
class credit_card implements payment{

	@Override
	public void payment_process(double amount) {
		
		int card_No;
		String name;
		
		System.out.println("Card detailes entered..! bro");
		System.out.println("The amount is detected from your card..");
		
	}
	
}

class upi implements payment{

	@Override
	public void payment_process(double amount) {
		String upiid;
		
		System.out.println("The UpiID add successfully!...");
		System.out.println("Do u want to continue the process..");
		
		
	}
	
}

class processing{
	void process(payment ref,double a) {
		ref.payment_process(a);
		
	}
}
