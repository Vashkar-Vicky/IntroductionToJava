package Inheritance;

public class Student extends User{
    int rollNo;

    void doSomething(){
        rollNo = 25;
        email = "vashkarvm@gmail.com";
        setPassword ("vicky");
        System.out.println(getPassword());

    }

}
