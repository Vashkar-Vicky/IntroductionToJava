package Inheritance;

public class Main {
    public static void main(String[] args){
        Student s = new Student();
        s.doSomething();


        // Method Overloading
        D d = new D();
        d.doSomething();
        d.doSomething(" is going on");
    }
}
