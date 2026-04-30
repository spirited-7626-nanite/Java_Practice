// Class as an Arguement in Java
class Sample{

    int a = 10;

    void m1(){
        System.out.println("This is m1 of Sample class");
    }
}

class Test{

    void m2(Sample x){
        System.out.println("value of a is " + x.a);
        x.m1();
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        Test t = new Test();
        t.m2(s);
        System.out.println("we are back in main method of Test class");
    }
}
/*
here we used Sample as a datatype and x as the variable and when in main class we made a object named s we put in the method m2 as the arguement 


Flow of Execution
1. main() starts.
2. Object s is created.
3. Object t is created.
4. t.m2(s) is called.
5. Control goes to m2().
6. Value of a is printed.
7. m1() method is called.
8. Control returns to main().
9. Final message is printed.

*/