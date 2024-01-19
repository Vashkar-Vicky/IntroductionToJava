package Inheritance;

public class D extends C {


    D(){


        super("My parent is C");
        System.out.println("D");
    }

    //Method OverLoading

    public void doSomething(){
        System.out.println("Something");
    }
    void doSomething(String abc){
        System.out.println("something"+abc);
    }
}
