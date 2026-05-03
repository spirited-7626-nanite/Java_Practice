//Types of Inheritance (Simple; Multilevel, Hierarchial)


// Simple Inheritance:
class Parent1{
    void m1(){
        System.out.println("Parent1 method");
    }
}
class Child1 extends Parent1{
    void m2 (){
        System.out.println("Child1 extending Parent1");
    }
}


// MultiLevel Inheritance: 
class GrandParent{
    void gp (){
        System.out.println("This is the grandparent class");
    }
}
class Parent extends GrandParent{
    void p (){
        System.out.println("This is the Parent class extends Grandparent Class");
    }
}

class Child extends Parent {
    void c (){
        System.out.println("This is the child class that extends the parent class that have inherited the grandparent class");
    }
}


// Hierarchial Inheritance
class Parent_A{
    void PA() {
        System.out.println("This is Parent A");
    }
}
class Child_A extends Parent_A{
    void CA(){
        System.out.println("Child A extended Parent A");
    }
}
class Child_B extends Parent_A{
    void CB(){
        System.out.println("Child B also extended Parent A");
    }
} 
class Main{
    public static void main(String[] args) {

        System.out.println("Simple Inheritance : ");
        Child1 C1 = new Child1();
        C1.m1();
        C1.m2();

        System.out.println("Multilevel Inheritance : ");
        Child C2 = new Child();
        C2.gp();
        C2.p();
        C2.c();

        System.out.println("Hierarchial Inheritance : ");
        Child_A C3 = new Child_A();
        C3.PA();
        C3.CA();
        Child_B C4 = new Child_B();
        C4.PA();
        C4.CB();
    }
}