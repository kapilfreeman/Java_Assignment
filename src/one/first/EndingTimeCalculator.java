package one.first;

import java.util.Scanner;

public class EndingTimeCalculator {
	public int startingTimeInHour;
	public int startingTimeInMinute;
	public int duration;
	public void startingTimeInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting time(in hours and minutes):");
		System.out.println("Enter starting time in hour");
		
		startingTimeInHour=sc.nextInt();
		System.out.println("Enter starting time in minute");
		startingTimeInMinute=sc.nextInt();
		   // Get the duration time in minutes
		System.out.println("Enter the duration (in minutes):");
		duration=sc.nextInt();
	}
	
	public void endingTime() {
	
	
		   // Calculate the ending time   
		   int endingtime=60*(startingTimeInHour)+startingTimeInMinute+duration;
		   int endinghour= endingtime/60;
		   int endingmin=endingtime%60;
		   System.out.println("The ending hour is "+endinghour);
		   System.out.println("The ending minute is "+endingmin);

		
	}

}
