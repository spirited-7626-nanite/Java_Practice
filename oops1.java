// Encapsulation : Related Properties, variables, fields, with it's methods in a single unit.

class Test {
    // private variable (hidden data)
    final private int value = 10;

    int b=12; // public instance variable

    // method inside same class accessing private data
    void show() {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Test d = new Test();
        d.show(); // accessing data via method
        System.out.println(d.b); // accessing variable 
    }
}