
public class Account {

	private double balance;
	private String name;
	private static int numAccounts = 0;
	
	public Account(){
		this.balance = 0;
		this.name = "Account";
		numAccounts++;
	}
	
	public Account(double b, String n){
		this.balance = b;
		this.name = n;
		numAccounts++;
	}
	
	public void adjust(double amt){
		this.balance += amt;
		
		if(amt > 0){
			System.out.println("Balance of " + this.name + " adjusted by +$" + Math.abs(amt) + ". Balance is now $" + this.balance + ".");
		}else if(amt == 0){
			System.out.println("Balance of " + this.name + "remains unadjusted.");
		}else{
			System.out.println("Balance of " + this.name + " adjusted by -$" + Math.abs(amt) + ". Balance is now $" + this.balance + ".");
		}
	}
	
	public static int getNumAccounts(){
		return numAccounts;
	}
	
	public String toString(){
		String output = name;
		output += String.format(" : %.2f", this.balance);
		return output;
	}
	
}
