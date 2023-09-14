// HouseSign.java - This program calculates prices for custom house signs.


public class HouseSign 
{
	public static void main(String args[])
	{
		// This is the work done in the housekeeping() method
		// Declare and initialize variables here.
        double minCharge = 35.00;
        double charge = 0.00;
        int numChars = 8;
        String color = "gold"; 
        String woodType = "oak";

		
        	 // Charge for this sign.
        charge = minCharge;
			 // Number of characters.
        if (numChars > 5)    
            charge +=  (4 * (numChars - 5)); 
			 // Color of characters.
        if (color.equalsIgnoreCase("gold"))
            charge +=15;     
			 // Type of wood.
        if (woodType.equalsIgnoreCase("oak"))     
			 charge +=20;
		// This is the work done in the detailLoop() method
		// Write assignment and if statements here as appropriate.
		


		
		// This is the work done in the endOfJob() method	
		// Output Charge for this sign.
		System.out.println("The charge for this sign is $" + charge);

		System.exit(0); 
	}
}