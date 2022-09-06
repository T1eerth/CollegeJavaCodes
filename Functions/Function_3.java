import java.util.*;

public class Function_3 {
    public static int product(int a,int b){
        int prod = a*b;
        return prod;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = product(a,b);
        System.out.println(prod);
    }
    
}
