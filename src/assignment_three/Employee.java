package assignment_three;

//Abstract Class
public abstract class Employee {
	//public String EmployeeId;
	//public
	public int employeeId;
	public String employeeName;
	public boolean isWorking;
	
	public Employee(String name, String id, String employed) {
		employeeName=name;
		employeeId=Integer.parseInt(id);
		isWorking=Boolean.parseBoolean(employed);
	}
	
	public String getName() {
		return employeeName;
	}
	
	public void setName(String name) {
		employeeName=name;
		
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int id) {
		employeeId=id;
	}
	
	public boolean isWorking() {
		return isWorking;
	}
	
	public void setIsWorking(boolean employed) {
		isWorking=employed;
	}
	
	public String toString() {
		return this.employeeName+"\t"+this.employeeId+"\t"+this.isWorking;
	}
	
	public abstract double getpay();
	

	public static void main(String[] args) {
		Employee[] workers=new Employee[11];
		
		//for student
		workers[0]=new StudentEmployee("Kapil","121","True","19","False","20");
		System.out.println(workers[0]);
		System.out.println(workers[0].getEmployeeId());
		
		//
		
		
	}
}
