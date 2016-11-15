package hw;

public class Student {

	private String Student_ID;
	private String Student_Name;
	private double[] marks = new double[3];
	
	
	public Student(String ID, String Student_Name, double[] marks) {
		
		this.set_ID(ID);
		this.set_Name(Student_Name);
		this.set_Marks(marks);
	}
	

	
	public void set_ID(String ID) {
		
		if (ID.length() == 5)
			this.Student_ID = ID;
		
	}
	
	public void set_Name(String name) {
		
		this.Student_Name = name;
		
	}
	
	public void set_Marks(double[] marks) {
		
		if (marks.length < 3)
			return;

		this.marks[0] = marks[0];
		this.marks[1] = marks[1];
		this.marks[2] = marks[2];
		
	}
	
	public double[] get_Marks() {
		
		return this.marks;
		
	}
	
	public String get_ID() {
		
		return this.Student_ID;
	}
	
	public String get_Name() {
		
		return this.Student_Name;
	}
	
	public double avg_mark() {
		
		
		double total = 0;
		
		for (double x: this.get_Marks()) {
			
			total = total + x;

		}
		
		return total/this.get_Marks().length;
		
	}
	
	public double highest_mark() {
		
		double highest = 0.0;
		
		for (double x : this.get_Marks()) {

			if (x > highest)
				highest = x;
			
		}
		
		return highest;
	}
	
	public String toString() {
		
		return "[StudentID = "+this.get_ID()+", StudentName = "+this.get_Name()+", Marks = "+this.get_Marks()[0]+" , "+this.get_Marks()[1]+" , "+this.get_Marks()[2]+"]";
		
	}
	

}
