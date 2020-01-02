package idm_techTest_HULIN;
import java.util.Scanner;

public class TimeDuration {
	
private static Scanner keyboard;



TimeDuration(int seconds) throws BadBadValueException {
	if(seconds<0) {
		throw new BadBadValueException("negative value");
	}
	
	int hours = seconds / 3600;
	int minutes = (seconds % 3600) / 60;
	seconds = seconds % 60;
	
	if(hours == 0) {
			System.out.println(minutes+"m "+seconds+"s");
			if(minutes == 0)
					System.out.println(seconds+"s");
	}
	
	else
		System.out.println(hours+"h "+minutes+"m "+seconds+"s");
	}



public static void main(String[] args) {
	keyboard = new Scanner(System.in);
	System.out.println("enter an integer");
	
	int myint = keyboard.nextInt();
	
	try {
		new TimeDuration(myint).toString();
	} catch (BadBadValueException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
