package hw;

import java.util.*;


public class BankAccount {
	
	private String Account_holder;
	private long Number;
	private double Balance;
	private static Scanner in;

	public void set_Account_holder(String name) {
		
		this.Account_holder = name;
		
	}

	public void set_Number(long number) {
		
		this.Number = number;
		
	}
	
	public void set_Balance(double balance) {
		
		this.Balance = balance;
		
	}
	
	public String get_Account_holder() {
		
		return this.Account_holder;
		
	}
	
	public long get_Number() {
		
		return this.Number;
		
	}
	
	public double get_balance() {
		
		return this.Balance;
		
	}
	
	public void depositAmount(double amount) {
		
		this.set_Balance(this.get_balance()+amount);
	}
	
	public void withdrawAmount(double amount) {
		
		if (this.get_balance() <= 500.00)
			return;
		
		if ((this.get_balance() - amount) <= 500.00)
			return;
		
		this.set_Balance(this.get_balance()-amount);
		
	}
	
	public String infoAccountHolder() {
		
		return "Account holder: "+this.get_Account_holder()+", Balance: "+this.get_balance();
	}
	
	public BankAccount(String name, long number, double balance) {
		
		this.set_Account_holder(name);
		this.set_Number(number);
		this.set_Balance(balance);
	}
	
	public void generalPrompt(BankAccount account) {
		
		int stat = 0;
		in = new Scanner(System.in);

		//account.promtTxt();

		while (stat != -1) {
			
			
			
			switch (stat) {
				
			case 1:
				System.out.println("New name:");
				String name = in.nextLine();
				account.set_Account_holder(name);
				System.out.println("Press Enter to show menu");
				in.nextLine();
				account.promtTxt();
				break;
			case 2:
				System.out.println("Name: "+account.get_Account_holder());
				System.out.println("Press Enter to show menu");
				in.nextLine();
				account.promtTxt();
				break;
				
			case 3:
				System.out.println("New number:");
				long number = in.nextLong();
				in.nextLine();
				account.set_Number(number);
				System.out.println("Press Enter to show menu");
				in.nextLine();
				account.promtTxt();
				break;
				
			case 4:
				System.out.println("Number: "+account.get_Number());
				System.out.println("Press Enter to show menu");
				in.nextLine();
				account.promtTxt();
				break;

			case 5:
				System.out.println("Change balance:");
				double balance = in.nextDouble();
				in.nextLine();
				account.set_Balance(balance);
				System.out.println("Press Enter to show menu");
				in.nextLine();
				account.promtTxt();
				break;
				
			case 6:
				System.out.println("Balance: "+account.get_balance());
				System.out.println("Press Enter to show menu");
				in.nextLine();
				account.promtTxt();
				break;
				
			case 7:
				System.out.println("Withdraw:");
				double balanceW = in.nextDouble();
				in.nextLine();
				account.withdrawAmount(balanceW);
				System.out.println("Press Enter to show menu");
				in.nextLine();
				account.promtTxt();
				break;

			case 8:
				System.out.println("Deposit:");
				double balanceD = in.nextDouble();
				in.nextLine();
				account.depositAmount(balanceD);
				System.out.println("Press Enter to show menu");
				in.nextLine();
				account.promtTxt();
				break;
				
			case 9:
				System.out.println(account.infoAccountHolder());
				System.out.println("Press Enter to show menu");
				in.nextLine();
				account.promtTxt();
				break;
				
				default:
					account.promtTxt();
					break;
			
			}
	
			
			stat = in.nextInt();
			in.nextLine();
		}
	}
	
	private void promtTxt() {
		
		System.out.println("1. Change name");
		System.out.println("2. Show current name");
		System.out.println("3. Change number");
		System.out.println("4. Show current number");
		System.out.println("5. Change balance");
		System.out.println("6. Show current balance");
		System.out.println("7. Withdraw");
		System.out.println("8. Deposit");
		System.out.println("7. Show account holder info");
		System.out.println("-1 Exit");

		
	} 

}
