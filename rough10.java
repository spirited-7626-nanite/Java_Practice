// Class as a Returntype : Methods are not limited to returning primitive data types (like int or boolean). A method can also return a complex Object (an instance of a class). When a method returns an object, it is actually returning the memory reference (the address) of that object, allowing you to use it elsewhere in your program.

class Test {
    int a = 10;
    
    public void m1() {
        System.out.println("Test class m1()");
    }
}

class Sample {
    // Method returning an object of type 'Test'
    public Test m2() {
        Test t = new Test(); // Creates the object
        return t;            // Returns the object's reference
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        
        // Capturing the returned object in reference variable 't1'
        Test t1 = s.m2(); 
        
        // Accessing the returned object's variables and methods
        System.out.println(t1.a); 
        t1.m1(); 
    }
}



