package assignment_three;

public class StudentEmployee extends Employee {
	private double hours;
	private boolean workStudy;
	private double rate;

	public StudentEmployee(String name, String id, String employed, String hoursWorked, String isWorkStudy, String payRate) {
		super(name, id, employed);	
		hours=Double.parseDouble(hoursWorked);
		workStudy=Boolean.parseBoolean(isWorkStudy);
		rate=Double.parseDouble(payRate);
		
	}
	public String toString() {
		return super.toString()+"\t"+this.hours+"\t"+this.workStudy+"\t"+rate;
	}

	

	@Override
	public double getpay() {
		// TODO Auto-generated method stub
		return this.hours*this.rate;
	}

}
