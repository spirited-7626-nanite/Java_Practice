// Blocks in Java
@SuppressWarnings("InitializerMayBeStatic")
class Test{
    Test(){
        System.out.println("This is a constructor for objects");
    }
    {
        System.out.println("Instance Block 1");
    }

    static {
        System.out.println("This is a Static Block");
    }

    {
        System.out.println("Instance Block 2");
    }

    void m1(){
        System.out.println("This is a Method m1() in the Class");
    }

     void m2(){
        System.out.println("This is a Method m2() in the Class");
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        t1.m2();
        t2.m1();
    }
}