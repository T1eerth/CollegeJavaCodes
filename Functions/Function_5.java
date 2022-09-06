import java.util.*;

public class Function_5
{
    public static void Fibonacci(int n) 
    {
        int first = 0;
        int second = 1;
        for(int i=0;i<n;i++){
            System.out.println(first+" ");
            int next=first+second;
            first=second;
            second=next;
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The Fibonacci Series is:");
        Fibonacci(n);
    }

}
