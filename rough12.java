// Use of this keyword : Distinguish between local and instance variable. 

class Student{
    // Instance Variables: 
    int id;
    String name;

    void data(int id, String name){
        this.id = id; 
        this.name = name;
    }

    public static void main(String[] args) {
        Student s1= new Student();
        s1.data(101,"A J");
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
