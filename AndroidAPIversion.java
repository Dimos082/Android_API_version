import java.util.Scanner;  // import the Scanner class 

public class AndroidAPIversion
{
    public static void main(String[] args) {
    
    
	// Enter API level or Android version or OS name
	    Scanner input = new Scanner(System.in);
        String userInput;

        // Type API level or Android version or OS code name and press Enter
		System.out.println("Type API level or Android version or OS code name and press Enter"); 
		userInput = input.nextLine();   
		
		if ( userInput.equalsIgnoreCase("1") || userInput.equalsIgnoreCase("1.0")) {
			  System.out.println("Android 1.0 (no codename) API:1");
	    } else if ( userInput.equalsIgnoreCase("2") || userInput.equalsIgnoreCase("2.0")) {
				System.out.println("Android 2.0 (no codename) API:2");
		} else if ( userInput.equalsIgnoreCase("3") || userInput.equalsIgnoreCase("1.5") || userInput.equalsIgnoreCase("cupcake")) {
			System.out.println("Cupcake	1.5	API level 3, NDK 1");
		} else if ( userInput.equalsIgnoreCase("Donut") || userInput.equalsIgnoreCase("1.6") || userInput.equalsIgnoreCase("4")) {
			System.out.println("Donut	1.6	API level 4, NDK 2");
		} else if ( userInput.equalsIgnoreCase("Eclair") || userInput.equalsIgnoreCase("2.0") || userInput.equalsIgnoreCase("5")) {
			System.out.println("Eclair	2.0	API level 5");	
		} else if ( userInput.equalsIgnoreCase("Eclair") || userInput.equalsIgnoreCase("2.0.1") || userInput.equalsIgnoreCase("6")) {
			System.out.println("Eclair	2.0.1	API level 6");
		} else if ( userInput.equalsIgnoreCase("Eclair") || userInput.equalsIgnoreCase("2.1") || userInput.equalsIgnoreCase("7")) {
			System.out.println("Eclair	2.1	API level 7, NDK 3");
		} else if ( userInput.equalsIgnoreCase("Froyo") || userInput.equalsIgnoreCase("2.2.x") || userInput.equalsIgnoreCase("8")) {
			System.out.println("Froyo	2.2.x	API level 8, NDK 4");
		} else if ( userInput.equalsIgnoreCase("Gingerbread") || userInput.equalsIgnoreCase("2.3") || userInput.equalsIgnoreCase("9")) {
			System.out.println("Gingerbread	2.3 - 2.3.2	API level 9, NDK 5");
		} else if ( userInput.equalsIgnoreCase("Gingerbread") || userInput.equalsIgnoreCase("2.3.7") || userInput.equalsIgnoreCase("10")) {
			System.out.println("Gingerbread	2.3.3 - 2.3.7	API level 10");
		} else if ( userInput.equalsIgnoreCase("Honeycomb") || userInput.equalsIgnoreCase("3.0") || userInput.equalsIgnoreCase("11")) {
			System.out.println("Honeycomb	3.0	API level 11");
		}
         
	}
}