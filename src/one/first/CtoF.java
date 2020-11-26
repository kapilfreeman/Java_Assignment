package one.first;

import java.util.Scanner;

public class CtoF {
	public double celcius;
	public void inputCelcius() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature in celcius ");
		celcius=sc.nextDouble();
		sc.close();
		
	}
	
	public void convertCtoF() {
		System.out.println("The converted temperature in Fahrenheit is "+ ((9/5)*celcius+32));
	}

}
