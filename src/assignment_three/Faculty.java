package assignment_three;

public class Faculty extends Employee {

	private double annualSalary;
	private int weeksPerYear;
	private String department;

	public Faculty(String name, String id, String employed, String annualSal, String totalWeeks, String dept) {
		super(name, id, employed);	
		annualSalary=Double.parseDouble(annualSal);
		weeksPerYear=Integer.parseInt(totalWeeks);
		department=dept;
		
	}
	public String toString() {
		return super.toString()+"\t"+this.annualSalary+"\t"+this.weeksPerYear+"\t"+this.department;
	}

	

	@Override
	public double getpay() {
		// TODO Auto-generated method stub
		return 2*(annualSalary/weeksPerYear);
	}

}
