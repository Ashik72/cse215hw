package hw;

public class Vehicle {

	
	protected double Mileage_Per_Hour;
	protected int No_Of_Passengers;
	protected String Type;
	
	protected void set_Mileage_Per_Hour(double Mileage_Per_Hour) {
		
		this.Mileage_Per_Hour = Mileage_Per_Hour;
		
	}

	protected void set_No_Of_Passengers(int No_Of_Passengers) {
		
		this.No_Of_Passengers = No_Of_Passengers;
		
	}
	
	protected void set_Type() {
		
		//this.Type = Type;
		this.Type = "Genereral Vehicle";
	
		
	}
	
	protected double get_Mileage_Per_Hour() {
		
		return this.Mileage_Per_Hour;
	}

	protected int get_No_Of_Passengers() {
		
		return this.No_Of_Passengers;
	}
	
	protected String get_Type() {
		
		return this.Type;
	}
	
	public String toString() {
		
		return "[Type = "+this.get_Type()+", Mileage per hour = "+this.get_Mileage_Per_Hour()+", No Of Passengers = "+this.get_No_Of_Passengers()+"]";
	}
	
	public Vehicle() {
		
		
	}
	
	public Vehicle(double Mileage_Per_Hour, int No_Of_Passengers) {
		
		this.set_Mileage_Per_Hour(Mileage_Per_Hour);
		this.set_No_Of_Passengers(No_Of_Passengers);
		this.set_Type();
	}
	
	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle(10.5, 5);
		System.out.println(v1.toString());
		Vehicle v2 = new Boat(5.5, 15);
		System.out.println(v2.toString());
		Vehicle v3 = new Car(15.5, 4);
		System.out.println(v3.toString());
		Vehicle v4 = new Hovercraft(1.2, 1);
		System.out.println(v4.toString());

	}
}

