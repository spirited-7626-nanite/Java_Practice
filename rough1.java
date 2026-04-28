// This is the code to take input and give output 
import java.util.Scanner;

class Test{
    public static void main(String[] args) {

         Scanner sc =new Scanner(System.in); // scanner class called with syste.in means input from user

        // String type
        System.out.print("Enter your name:  ");
        String Name = sc.nextLine();
        System.out.println("hello! "+Name);        


        // Int type
        System.out.print("Enter a integer number: ");
        int a = sc.nextInt();
        System.out.print("The number you entered is: ");
        System.out.println(a);
        sc.nextLine();   // to clear leftover new line i.e it clears buffer  


        // Float Type
        System.out.print("Enter a float number: ");
        float b = sc.nextFloat();
        System.out.print("The number you entered is: ");
        System.out.println(b);
        sc.nextLine();
        

        // Double type
        System.out.print("Enter a double number: ");
        double c = sc.nextDouble();
        System.out.print("The number you entered is: ");
        System.out.println(c);
        sc.nextLine();

        
        sc.close(); // at the end of all the inputs to make sure all the data don't get leaked

        





    }
}