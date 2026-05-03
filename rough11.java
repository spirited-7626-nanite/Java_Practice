/* 
Anatomy of a Class : Variables, Methods, Block, Constructor, enum, annotations : 

3 Types of Variables (Local, Instance, Static)
2 Types of Methods (Static, Instance)
2 Types of Block (Static, Instance)
3 Types of Constructors (Default, Parametrized, Non Parametrized)
Enums :- No. of constants in a single block
annotations :- written with @
*/ 

class Test{

    // Variables : 
    int a = 12; // instance variable
    static int b = 13; // static variable
    void m3(){
        int c = 14; // Local Variable
        System.out.println("Local Variable : "+c);
        }


    // Methods : 
    void m1(){
        System.out.println("Instance Method");
    }

    static void m2(){
        System.out.println("Static Method");
    }

    
    // Constructor : 
    Test(){
        System.out.println("This is a constructor for objects");
    }


    // Blocks : 
    {
        System.out.println("Instance Block "); // Instance Block
    }


    static {
        System.out.println("This is a Static Block"); // Static Block
    }

    
    public static void main(String[] args) {
        Test t =new Test(); // Object Created

        // Methods Called
        t.m1();
        Test.m2();

        // Variables Called
        System.out.println("Instance Variable : "+t.a);
        System.out.println("Static Variable : "+Test.b);
        t.m3();

    }
}