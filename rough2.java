class Test{
   int a = 2; // Instance Variable  for every new object new copy is made
   static int b = 22; // Static variable : loaded once in class and then it is called 
   void m1(){
    int c = 222; // Local variable : used just in methods 
    System.out.println(c);
   }

   public static void main(String[] args) {
    System.out.println(b);
    Test t = new Test();
    System.out.println(t.a);
    t.m1();
   }
}