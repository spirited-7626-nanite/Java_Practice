// Constructor and Constructor Chaining 
class Test{
    Test(int a){
        this(20.50);{
            System.out.println("Integer Constructor");
        }
    }

    Test(){
        this(47);{
            System.out.println("No arguement Constructor");
        }
    }

    Test(double a){
        {
            System.out.println("Double Constructor");
        }
    }

    void m1(){
        System.out.println("This is a method in this Class Test");
    }

    public static void main(String[] args) {
        Test t = new Test(); //----> No arguement constructor is called
        t.m1();
    }
}