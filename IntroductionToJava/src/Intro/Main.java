package Intro;

public class Main {
    public static void main(String []args){
        Student s1 = new Student();

        int age = s1.getAge();
        s1.Name  = "Vashkar";
        s1.setAge(24) ;
        s1.batchName = "A";

        Student s2 = new Student();
        s2.Name = "Asha";
        s2.setAge(27);
        s2.batchName = "B";

        System.out.println(s1.Name+" and age : "+s1.getAge());
        System.out.println(s2.Name);
        System.out.println(s2);

        Student s3 = s2;
        s3.Name = "vrushali";

        System.out.println(s2.Name);

        s1.giveMockInterview();

    }
}
