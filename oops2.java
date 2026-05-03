// Inheritance
// Keywords : implements and extends

class Parent{  // Parent Class
    int a = 12;
    void m1(){
        System.out.println("Method in Parent Class : ");
    }
}

class Child extends Parent{ // Child Class extended the properties of parent class

    double d =12.36; // Code Extensibility
    void m2(){
        System.out.println("Method in Child Class : ");
    }

    public static void main(String[] args) {
        Child c = new Child(); // Child Class Object made

        // Parent Class Members Accessed
        c.m1();
        System.out.println(c.a);

        // Child Class Members Accessed
        c.m2();
        System.out.println(c.d);

    }
}

// Instance Methods are copied for every object made
// Static Methods are made once and they are shared for every use