import java.util.Scanner;  // import the Scanner class 

public class AndroidAPIversion
{
    public static void main(String[] args) {

		// User input scanner
		Scanner input = new Scanner(System.in);
        String userInput;

        // Message for the user and input handling
		System.out.println("Type API level (1-29) or Android version (1.0-10) or OS code name (Pie) and press Enter"); 
		userInput = input.nextLine();   
		
		// Conditions
		if (userInput.equals("1") || userInput.equals("1.0")) {
			  System.out.println("Android 1.0 (no codename) API:1");
	    } else if (userInput.equals("2") || userInput.equals("2.0")) {
				System.out.println("Android 2.0 (no codename) API:2");
		} else if (userInput.equalsIgnoreCase("cupcake") || userInput.equals("3") || userInput.equals("1.5")) {
			System.out.println("Cupcake	1.5	API level 3, NDK 1");
		} else if (userInput.equalsIgnoreCase("Donut") || userInput.equals("1.6") || userInput.equals("4")) {
			System.out.println("Donut	1.6	API level 4, NDK 2");
		} if (userInput.equalsIgnoreCase("Eclair") || userInput.equals("2.0") || userInput.equals("5")) {
			System.out.println("Eclair	2.0	API level 5");	
		} if (userInput.equalsIgnoreCase("Eclair") || userInput.equals("2.0.1") || userInput.equals("6")) {
			System.out.println("Eclair	2.0.1	API level 6");
		} if (userInput.equalsIgnoreCase("Eclair") || userInput.equals("2.1") || userInput.equals("7")) {
			System.out.println("Eclair	2.1	API level 7, NDK 3");
		// } else if ( userInput.equalsIgnoreCase("Eclair")) {          //for one string output
		// 	System.out.println("Eclair	2.0-2.1	API level 5,6,7");  
		} else if (userInput.equalsIgnoreCase("Froyo") || userInput.equals("2.2.x") || userInput.equals("8")) {
			System.out.println("Froyo	2.2.x	API level 8, NDK 4");
		} else if (userInput.equalsIgnoreCase("Gingerbread") || userInput.equals("2.3") || userInput.equals("9")) {
			System.out.println("Gingerbread	2.3 - 2.3.2	API level 9, NDK 5");
		} else if (userInput.equalsIgnoreCase("Gingerbread") || userInput.equals("2.3.7") || userInput.equals("10")) {
			System.out.println("Gingerbread	2.3.3 - 2.3.7	API level 10");
		// } else if ( userInput.equalsIgnoreCase("Gingerbread")) {          //for one string output
		// 	System.out.println("Gingerbread	2.3.2 - 2.3.7	API level 9-10");
		} if (userInput.equalsIgnoreCase("Honeycomb") || userInput.equals("3.0") || userInput.equals("11")) {
			System.out.println("Honeycomb	3.0	API level 11");
		} if (userInput.equalsIgnoreCase("Honeycomb") || userInput.equals("3.1") || userInput.equals("12")) {
			System.out.println("Honeycomb	3.1	API level 12, NDK 6");
		} if (userInput.equalsIgnoreCase("Honeycomb") || userInput.equals("3.2") || userInput.equals("13")) {
			System.out.println("Honeycomb	3.2.x	API level 13");
		// } else if ( userInput.equalsIgnoreCase("Honeycomb")){          //for one string output
		// 	System.out.println("Honeycomb	3.0-3.2.x	API level 11,12,13");
		} if (userInput.equalsIgnoreCase("Ice Cream Sandwich") || userInput.equals("4.0.1") || userInput.equals("14")) {
			System.out.println("Ice Cream Sandwich	4.0.1 - 4.0.2	API level 14, NDK 7");
		} if (userInput.equalsIgnoreCase("Ice Cream Sandwich") || userInput.equals("4.0.3") || userInput.equals("15")) {
			System.out.println("Ice Cream Sandwich	4.0.3 - 4.0.4	API level 15, NDK 8");
		// } else if (userInput.equalsIgnoreCase("Ice Cream Sandwich")) {          //for one string output
		// 	System.out.println("Ice Cream Sandwich	4.0.3 - 4.0.4	API level 14,15");
		} if (userInput.equalsIgnoreCase("Jelly Bean") || userInput.equals("4.1") || userInput.equals("16")) {
			System.out.println("Jelly Bean	4.1.x	API level 16");
		} if (userInput.equalsIgnoreCase("Jelly Bean") || userInput.equals("4.2") || userInput.equals("17")) {
			System.out.println("Jelly Bean	4.2.x	API level 17");
		} if (userInput.equalsIgnoreCase("Jelly Bean") || userInput.equals("4.3") || userInput.equals("18")) {
			System.out.println("Jelly Bean	4.3.x	API level 18");
		// } else if ( userInput.equalsIgnoreCase("Jelly Bean")) {          //for one string output
		// 	System.out.println("Jelly Bean	4.1-4.3.x	API level 16,17,18");
		} else if (userInput.equalsIgnoreCase("KitKat") || userInput.equals("4.4") || userInput.equals("19")) {
			System.out.println("KitKat	4.4 - 4.4.4	API level 19");
		} if (userInput.equalsIgnoreCase("Lollipop") || userInput.equals("5.0") || userInput.equals("21")) {
			System.out.println("Lollipop	5.0	API level 21");
		} if (userInput.equalsIgnoreCase("Lollipop") || userInput.equals("5.1") || userInput.equals("22")) {
			System.out.println("Lollipop	5.1	API level 22");
		} else if (userInput.equalsIgnoreCase("Marshmallow") || userInput.equals("6") || userInput.equals("23")) {
			System.out.println("Marshmallow	6.0	API level 23");
		} if (userInput.equalsIgnoreCase("Nougat") || userInput.equals("7") || userInput.equals("24")) {
			System.out.println("Nougat	7.0	API level 24");
		} if (userInput.equalsIgnoreCase("Nougat") || userInput.equals("7.1") || userInput.equals("25")) {
			System.out.println("Nougat	7.1	API level 25");
		} if (userInput.equalsIgnoreCase("Oreo") || userInput.equals("8.0") || userInput.equals("26")) {
			System.out.println("Oreo	8.0.0	API level 26");
		} if (userInput.equalsIgnoreCase("Oreo") || userInput.equals("8.1") || userInput.equals("27")) {
			System.out.println("Oreo	8.1.0	API level 27");
		} else if (userInput.equalsIgnoreCase("Pie") || userInput.equals("9") || userInput.equals("28")) {
			System.out.println("Pie	9	API level 28");
		} else if (userInput.equalsIgnoreCase("Android10") || userInput.equals("10") || userInput.equals("29")) {
			System.out.println("Android10	10	API level 29");
		// } else System.out.println("Can't find " + "'" + userInput + "'" + " :-(");          //If userInput returned nothing
		
			input.close();
        }

    }
}