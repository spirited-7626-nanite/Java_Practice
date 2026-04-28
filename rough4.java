//Loops in Java
import java.util.Scanner;
class Test{
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();


        System.out.println("For Loop");
        for(int i=0; i<=n; i++){
            System.out.println(i);
        }


        System.out.println();


        System.out.println("While Loop");
        int j=0;
        while (j<=n) {
            System.out.println(j);
            j++;
        }

        // Other Loops : do While loop and For each loop.

        sc.close();
    }
}