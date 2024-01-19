package Intro;

public class Student {
    String Name;
    private int age;
    double psp;
    String batchName;

    void changeBatchName(String newBatchName){
        newBatchName = batchName;
    }

    void giveMockInterview(){
        System.out.println(Name +" Giving Mock Interview");
    }

    int getAge(){
        return age;
    }
    void setAge(int newAge){
        age = newAge;
    }
}
