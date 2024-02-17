package SeleniAuto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.WebDriver;

public class Gatedatetime {
	 
	 public static String datetimes(){
		
	
		
	
	 LocalDateTime date =  LocalDateTime.now();
	 // Create object of SimpleDateFormat class and decide the format
	// DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	 DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-a");
	 
	 //get current date time with Date()
	// Date date = new Date();
	 
	 // Now format the date
	 String date1= date.format(dateFormat);
	 
	 // Print the Date
	// System.out.println("Current date and time is " +date1);
	 return date1; 
	 
	 }
//	 public static void main(String[] args) {
//		Gatedatetime.datetimes();
//	}
//	 
	


}
