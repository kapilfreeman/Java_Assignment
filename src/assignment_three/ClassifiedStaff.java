package assignment_three;

public class ClassifiedStaff extends Employee {

	private double weeklySalary;
	private String division;
	//private void aaaaa
	

	public ClassifiedStaff(String name, String id, String employed, String salary, String div) {
		super(name, id, employed);	
		weeklySalary=Double.parseDouble(salary);
		division=div;
		//aaaaa
		
	}
	public String toString() {
		return super.toString()+"\t"+this.weeklySalary+"\t"+this.division;
		//return super.getName()+"\t"+super.employeeId+"\t"+ super.isWorking()+"\t"+this.weeklySalary+"\t"+this.division;
	}

	

	@Override
	public double getpay() {
		// TODO Auto-generated method stub
		return 2*this.weeklySalary;
	}
}
