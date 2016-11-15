package hw;
import java.util.*;

public class TesterProgram {

	private static Scanner in;
	
	public static void main(String[] args) {

		//TesterProgram.StudentCheck();
		
		//TesterProgram.BankAccountTest();
		TesterProgram.MyStackTest();

	}
	
	public static void MyStackTest() {
		
		MyStack ins_1 = new MyStack();
		
		ins_1.push(1);
		ins_1.push(2);
		ins_1.push("dfgfdgd");
		ins_1.push(new Student("34563", "test name", new double[]{23, 78, 53}));

		System.out.println(ins_1.toString());
		System.out.println(ins_1.getSize());

	}
	
	public TesterProgram() {
		
		
	}

	public static void StudentCheck() {

	
		
		Student s1 = new Student("34563", "test name", new double[]{23, 78, 53});
		System.out.println(s1.toString());
		System.out.printf("%.2f", s1.avg_mark());
		System.out.println();
		System.out.println(s1.highest_mark());


		Student s2 = new Student("34563", "test name 2", new double[]{85, 12, 45});
		System.out.println(s2.toString());
		System.out.printf("%.2f", s2.avg_mark());
		System.out.println();
		System.out.println(s2.highest_mark());
		
		Student s3 = new Student("34573", "test name 3", new double[]{20, 58, 36});
		System.out.println(s3.toString());
		System.out.printf("%.2f", s3.avg_mark());
		System.out.println();
		System.out.println(s3.highest_mark());

	}
	
	public static void BankAccountTest() {

		in = new Scanner(System.in);

		int stat = 1;
	
		System.out.println("Name:");
		String name = in.nextLine();
		

		System.out.println("Number:");
		long number = in.nextLong();
		in.nextLine();
		
		System.out.println("Balance:");
		double balance = in.nextDouble();
		in.nextLine();
		
		BankAccount account = new BankAccount(name, number, balance);

		account.generalPrompt(account);		

		
	}
}
