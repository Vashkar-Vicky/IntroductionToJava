package AccessModifier;

public class Student {

    String Name;
    private int age;
    double psp;
    String batchName;

    Instructor i;

    Student(String Name, int age, double psp){
        this.Name = Name;
        this.age = age;
        this.psp = psp;
        this.i = new Instructor() ;
    }
    Student(Student oldStudent ){
        this.Name = oldStudent.Name;
        this.age = oldStudent.age;
        this.psp = oldStudent.psp;
        this.batchName = oldStudent.batchName;



    }



}
