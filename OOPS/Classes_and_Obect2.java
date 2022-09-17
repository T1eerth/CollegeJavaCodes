import java.util.*;

class Student{
    String name;
    int age;

    public void returnInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Classes_and_Obect2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Lord Tirth";
        s1.age = 19;
        s1.returnInfo();
    }
    
}
