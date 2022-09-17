import java.util.*;

class Pen{
    String type;
    String color;
    public static void write(){
        System.out.println("Writing Something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
}

public class Classes_and_Object {
    public static void main(String[] args) {
    Pen p1 = new Pen();
    p1.color = "red";
    p1.type = "gel";
    Pen p2 = new Pen();
    p2.type = "ball";
    p2.color = "black";
    p1.printType();
    p2.printType();
    p1.printColor();
    p2.printColor();
    p1.write();
    p2.write();

    
    }
}
