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
		} else if ( userInput.equalsIgnoreCase("Honeycomb") || userInput.equalsIgnoreCase("3.1") || userInput.equalsIgnoreCase("12")) {
			System.out.println("Honeycomb	3.1	API level 12, NDK 6");
		} else if ( userInput.equalsIgnoreCase("Honeycomb") || userInput.equalsIgnoreCase("3.2") || userInput.equalsIgnoreCase("13")) {
			System.out.println("Honeycomb	3.2.x	API level 13");
		} else if ( userInput.equalsIgnoreCase("Ice Cream Sandwich") || userInput.equalsIgnoreCase("4.0.1") || userInput.equalsIgnoreCase("14")) {
			System.out.println("Ice Cream Sandwich	4.0.1 - 4.0.2	API level 14, NDK 7");
		} else if ( userInput.equalsIgnoreCase("Ice Cream Sandwich") || userInput.equalsIgnoreCase("4.0.3") || userInput.equalsIgnoreCase("15")) {
			System.out.println("Ice Cream Sandwich	4.0.3 - 4.0.4	API level 15, NDK 8");
		} else if ( userInput.equalsIgnoreCase("Jelly Bean") || userInput.equalsIgnoreCase("4.1") || userInput.equalsIgnoreCase("16")) {
			System.out.println("Jelly Bean	4.1.x	API level 16");
		} else if ( userInput.equalsIgnoreCase("Jelly Bean") || userInput.equalsIgnoreCase("4.2") || userInput.equalsIgnoreCase("17")) {
			System.out.println("Jelly Bean	4.2.x	API level 17");
		} else if ( userInput.equalsIgnoreCase("Jelly Bean") || userInput.equalsIgnoreCase("4.3") || userInput.equalsIgnoreCase("18")) {
			System.out.println("Jelly Bean	4.3.x	API level 18");
		} else if ( userInput.equalsIgnoreCase("KitKat") || userInput.equalsIgnoreCase("4.4") || userInput.equalsIgnoreCase("19")) {
			System.out.println("KitKat	4.4 - 4.4.4	API level 19");
		} else if ( userInput.equalsIgnoreCase("Lollipop") || userInput.equalsIgnoreCase("5.0") || userInput.equalsIgnoreCase("21")) {
			System.out.println("Lollipop	5.0	API level 21");
		} else if ( userInput.equalsIgnoreCase("Lollipop") || userInput.equalsIgnoreCase("5.1") || userInput.equalsIgnoreCase("22")) {
			System.out.println("Lollipop	5.1	API level 22");
		} else if ( userInput.equalsIgnoreCase("Marshmallow") || userInput.equalsIgnoreCase("6") || userInput.equalsIgnoreCase("23")) {
			System.out.println("Marshmallow	6.0	API level 23");
		} else if ( userInput.equalsIgnoreCase("Nougat") || userInput.equalsIgnoreCase("7") || userInput.equalsIgnoreCase("24")) {
			System.out.println("Nougat	7.0	API level 24");
		} else if ( userInput.equalsIgnoreCase("Nougat") || userInput.equalsIgnoreCase("7.1") || userInput.equalsIgnoreCase("25")) {
			System.out.println("Nougat	7.1	API level 25");
		} else if ( userInput.equalsIgnoreCase("Oreo") || userInput.equalsIgnoreCase("8.0") || userInput.equalsIgnoreCase("26")) {
			System.out.println("Oreo	8.0.0	API level 26");
		} else if ( userInput.equalsIgnoreCase("Oreo") || userInput.equalsIgnoreCase("8.1") || userInput.equalsIgnoreCase("27")) {
			System.out.println("Oreo	8.1.0	API level 27");
		} else if ( userInput.equalsIgnoreCase("Pie") || userInput.equalsIgnoreCase("9") || userInput.equalsIgnoreCase("28")) {
			System.out.println("Pie	9	API level 28");
		} else if ( userInput.equalsIgnoreCase("Android10") || userInput.equalsIgnoreCase("10") || userInput.equalsIgnoreCase("29")) {
			System.out.println("Android10	10	API level 29");
		}
	
			input.close();
    }

}
