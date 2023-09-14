/* Program Name: BadDate.java 
   Function: This program determines if a date entered by the user is valid.  
   Input:  Interactive
   Output: Valid date is printed or user is alerted that an invalid date was entered.
*/  

import java.util.Scanner;
public class BadDate
{
   public static void main(String args[])
   { 
     // Declare variables
     
     String yearString;
     String monthString;
     String dayString;
     
     boolean validDate = true;
     final int MIN_YEAR = 0, MIN_MONTH = 1, MAX_MONTH = 12, MIN_DAY = 1, MAX_DAY = 31; 

     // This is the work of the housekeeping() method
     // Get the year, then the month, then the day
     Scanner input = new Scanner(System.in);
     // variable = input.nextLine(); // Convert Strings to integers
     System.out.println("Year: ");
     yearString = input.nextLine();
     int year = Integer.parseInt(yearString);

     
     System.out.println("Month: ");
     monthString = input.nextLine();
     int month = Integer.parseInt(monthString);
     
     System.out.println("Day: ");
     dayString = input.nextLine();
     int day = Integer.parseInt(dayString);



     // This is the work of the detailLoop() method
     // Check to be sure date is valid
     if( year <= MIN_YEAR )  // invalid year
      validDate = false;
     else if ( month < MIN_MONTH || month > MAX_MONTH )  // invalid month
      validDate = false;
     else if ( day < MIN_DAY || day > MAX_DAY ) // invalid day
      validDate = false; 


     
     // This is the work of the endOfJob() method
     // Test to see if date is valid and output date and whether it is valid or not
     if( validDate == true )
     { 
   // Output statement 
    System.out.println("month/day/year is a valid date.");
     }
     else
     {
   // Output statement 
   System.out.println("month/day/year is an invalid date.");
     }
     
   } // end of main() method

} // end of BadDate class