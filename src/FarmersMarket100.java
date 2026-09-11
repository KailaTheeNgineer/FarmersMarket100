// Importing class for user input
import java.util.*;

public class FarmersMarket100 {
    public static void main(String[] args) {

        // Creating a loop for the program to run continuously until the user decides to exit
        boolean isRunning = true;
        while (isRunning) {
        // Assignment Details
        System.out.println("\n\nDeveloper: Kaila McAlpine | Class: COP-2800/Java Programming | Date: 09/13/2026\n");
        // Prints welcome screen and options
        System.out.println("========================================");
        System.out.println("       Welcome to Farmers Market 100!");
        System.out.println("========================================");
        System.out.println("| Please select an option:             |");
        System.out.println("|                                      |");
        System.out.println("| 1. Begin Auction                     |");
        System.out.println("| 0. Exit                              |");
        System.out.println("========================================");

        // Collecting user input
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();

        // Processing user input
        if (option.equals("1")) {
            // begins auction screen
            System.out.println("========================================");
            System.out.println("          FLORIDA CHICKEN AUCTION");
            System.out.println("========================================");
              System.out.println("                      ");
            System.out.println(" Pivot quality code: \n     ");
            // Creating int value for the pivot quality code
            int pivotQualityCode = scanner.nextInt();
            
            // Creating int value for the chicken quality code
            System.out.println("Enter a chicken quality code (0 to stop): ");
            int qualityCode = scanner.nextInt();

            // Values to be used for the acceptable chicken quality codes
            int acceptableCount = 0;
            // Values to be used for the acceptable chicken quality codes
            String acceptable = "";
            // Values to be used for the unacceptable chicken quality codes
             String unacceptable = "";
            // Loops the question until the user enters 0 to stop
            while (qualityCode != 0) {
                // Compares the chicken quality code to the pivot quality code
                if (qualityCode > pivotQualityCode) {
                // Filtering and adding a count to the number of accepted chickens
                 acceptableCount++;
                // Creating a string to hold the acceptable chicken quality codes
                acceptable += qualityCode + ", ";

                }     
             
                else {
                // Creating a string for rejected values in the loop
                unacceptable += qualityCode + ", ";
                    }
                // Loops the question until the user enters 0 to stop
                System.out.print("Enter a chicken quality code (0 to stop): ");
                qualityCode = scanner.nextInt();

            } 
            // Prints the auction report with the pivot quality code, acceptable and unacceptable chicken quality codes, and the number of acceptable codes
            System.out.println("\n========================================");
            System.out.println("           AUCTION REPORT");
            System.out.println("========================================");
            System.out.println("Pivot Quality Code: " + pivotQualityCode);
            System.out.println("----------------------------------------\n");
            System.out.println("ACCEPTABLE QUALITY CODES:");
            System.out.println(acceptable);
            System.out.println("\nNumber of Acceptable Codes: " + acceptableCount);
            System.out.println("----------------------------------------");
            System.out.println("\nUNACCEPTABLE QUALITY CODES:");
            System.out.println(unacceptable);
            System.out.println("\n========================================");
                    }  
                
            // stops program
            else if (option.equals("0")) {
            System.out.println("Thank you for visiting Farmers Market 100! Goodbye!");
            isRunning = false;
            
            } else {

    System.out.println("\u001B[31mInvalid option. Please try again.\u001B[0m");

}
    }

    
    
    
    }
    
}
