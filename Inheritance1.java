// Parent and Child Reference Variable in Inheritance while Resolution
class Parent {
    void m1(){
        System.out.println("Parent method m1()");
    }
}
class Child extends Parent{
    void m2(){
        System.out.println("Child method m2()");
    }
}

class Test{
    public static void main(String[] args) {

        System.out.println("Object Created with Child class reference variable  'C' and Child Constructor");

        Child C =new Child();
        C.m1();
        C.m2();


        System.out.println("Object Created with Parent class reference variable 'P' and Child Constructor");

        Parent P =new Child();
        P.m1(); // -----> Recommended when we have to use parent members with child class.

        // P.m2(); -----> Not allowed because method reolution at compile time and it saw the parent ref var. and understood the usage of parent class meanwhile child class made later in run time till then it was not considered.

    }
}