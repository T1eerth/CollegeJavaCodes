import java.util.Scanner;
public class Car{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("21BCE0383");
        System.out.println("Input the customer name");
        String name=in.nextLine();
        System.out.println("Input the car number");
        String car_num=in.next();
        System.out.println("Input the starting hour");
        int shour=in.nextInt();
        System.out.println("Input the starting minute");
        int smin=in.nextInt();
        System.out.println("Input the starting second");
        int ssec=in.nextInt();
        System.out.println("Input the ending hour");
        int ehour=in.nextInt();
        System.out.println("Input the ending minute");
        int emin=in.nextInt();
        System.out.println("Input the ending second");
        int esec=in.nextInt();
        int time_h=ehour-shour;
        int time_m=emin-smin;
        int time_s=esec-ssec;
        double money=time_h*500;
        
        System.out.println(name+"\t"+car_num+"\t"+time_h+"\t"+time_m+"\t"+time_s+"\t"+money);
    }
}
