import java.util.*;

class Student{
    String name;
    int age;                //if the user do not define any constructor then a default constructor gets assign by the computer itself                
    public void getInfo(){      //that is called the default constructor or the parametrized constructor..
        System.out.println(this.name);
        System.out.println(this.age);  
    }                                  
    Student(String name,int age){      //not paramaterized constructor
        this.name = name;
        this.age = age;
    }

    Student(Student s2){        //copy constructor
        this.name = s2.name;
        this.age = s2.age;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Tirth Vanparia",19);
        s1.getInfo();
        Student s2 = new Student(s1);
        s2.getInfo();
    }
    
}
