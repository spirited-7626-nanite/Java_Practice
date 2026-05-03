// do while and for each loop : 

import java.util.Scanner;

class Experiment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Do While Loop
        // This loop will run at least once, even if the condition is false
        int number;

        do {
            System.out.print("Enter a number (enter 0 to stop): ");
            number = sc.nextInt();

            // Display the entered number
            System.out.println("You entered: " + number);

        } while (number != 0);  // Loop continues until user enters 0


        // for each loop
        // For-each loop is used to iterate through arrays or collections

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Using for-each loop to print array elements:");

        // 'element' will take each value from the array one by one
        for (int element : arr) {
            System.out.println(element);
        }

        sc.close(); // Closing scanner
    }
}