package one.first;

import java.util.Scanner;

public class Pay {
	
	public double hoursWorked;
	public double hourlyPayRate;
	public double grossPay;
	
	public void inputInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many hours did you work? ");
		hoursWorked=sc.nextDouble();
		System.out.println("How much did you get paid per hour? ");
		hourlyPayRate=sc.nextDouble();
		sc.close();
		
	}
	
	public void grossPay() {
		if (hoursWorked<=40){
			grossPay=hoursWorked*hourlyPayRate;
			}
			else {
			    grossPay=1.5*hoursWorked*hourlyPayRate;
			}
			// Display the results
			 System.out.println("You earned $" + grossPay);
			    
			double taxes = 0.33*grossPay;  
			double netPay = grossPay-taxes;
			System.out.println("Taxes are $"+taxes);
			System.out.println("Your net pay $" + netPay);

	}
	
	

}
