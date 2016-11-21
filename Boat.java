package hw;

public class Boat extends Vehicle {

	public Boat(double Mileage_Per_Hour, int No_Of_Passengers) {

		this.set_Mileage_Per_Hour(Mileage_Per_Hour);
		this.set_No_Of_Passengers(No_Of_Passengers);
		this.set_Type();
	}

	protected void set_Type() {
		
		//this.Type = Type;
		this.Type = "Boat";
	
		
	}
	
}
