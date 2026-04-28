// If else in Java
import java.util.Scanner;
class Test{
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println();
        System.out.println("Hello!  "+ name);

        System.out.print("Enter your age : " );
        int age = sc.nextInt();

        sc.close();

        if (age>=18) {
            System.out.println("You are eligible for voting");            
        }
        else{
            System.out.println("You cannot vote");
        }


        
        
    }
}