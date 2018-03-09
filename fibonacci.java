package fibonacci;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int alinan;
        Scanner sc = new Scanner(System.in);
        System.out.print("fibonacci serisi kaçlı olsun : ");
        alinan = sc.nextInt();
        int fib[] = new int[alinan];
        fib[0]=1;
        fib[1]=1;
        for(int a = 2;a<alinan;a++){
            fib[a] = fib[a-1] + fib[a-2];
           }
        System.out.println("Fibonacci Serisi " + alinan);
        for(int i=0; i < alinan; i++){
            System.out.print(fib[i] + " ");
        }
                
    }
    
}
