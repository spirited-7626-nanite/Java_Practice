// Static Instance Members Accessing

/*
How to call Static and Instance Members
Static to Static : 
1. Using Object name
2. Directy inside same class 
3. Using Class name                    ---------> (Recommended Way)

Instance to Static : 
1. Directly 
2. Class Name                         ----------> (Recommended Way)

Static to Instance : 
1. We have to create an Object

Instance to Instance : 
1. Directly                           ----------> (Recommended Way)
2. Using Object name
*/

class Test {

    // Static variable
    static int staticVar = 10;

    // Instance variable
    int instanceVar = 20;

    // Static method
    static void staticMethod() {
        System.out.println("Inside staticMethod");

        // Static to Static
        System.out.println("Static to Static:");
        
        // 1. Directly
        System.out.println(staticVar);

        // 2. Using class name (Recommended)
        System.out.println(Test.staticVar);

        // Static to Instance
        System.out.println("\nStatic to Instance:");

        // Need to create object
        Test obj = new Test();
        System.out.println(obj.instanceVar);
        obj.instanceMethod();
    }

    // Instance method
    void instanceMethod() {
        System.out.println("Inside instanceMethod");

        // Instance to Instance
        System.out.println("Instance to Instance:");

        // 1. Directly (Recommended)
        System.out.println(instanceVar);

        // 2. Using object
        Test obj = new Test();
        System.out.println(obj.instanceVar);

        // Instance to Static
        System.out.println("\nInstance to Static:");

        // 1. Directly
        System.out.println(staticVar);

        // 2. Using class name (Recommended)
        System.out.println(Test.staticVar);
    }

    public static void main(String[] args) {

        // Static to Static
        System.out.println("Main Method (Static to Static):");
        staticMethod();

        // Instance to Static & Instance
        System.out.println("\nMain Method (Instance access):");
        Test obj = new Test();
        obj.instanceMethod();
    }
}