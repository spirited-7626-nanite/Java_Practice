// Anatomy of a Java Class
class Test {

    // Static Variable (Class Variable)
    static String Institute_Name = "Orchid Island";

    // Instance Variables (Fields / Properties)
    int rollNo;
    String name;

    // Static Block
    static {
        System.out.println("Static Block Executed");
    }

    // Instance Block
    {
        System.out.println("Instance Block Executed");
    }

    // Constructor
    Test(int r, String n) {
        rollNo = r;
        name = n;
    }

    // Method (Behavior)
    void display() {

        int marks = 85;   // Local Variable

        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Institute: " + Institute_Name);
    }

    // Main Method (Entry Point)
    public static void main(String[] args) {

        int year = 2026;   // Local Variable

        Test t1 = new Test(8, "Virat");
        t1.display();

        System.out.println("Year: " + year);
    }
}

/*
Order of Execution in Java:
1. Class is laoded in JVM
2. Static Variables and Method loading
3. Static Block loading
4. Main Method starts
5. Object is created 
6. Instance Block executed
7. Constructor executed
8. Methods execution 

*/
