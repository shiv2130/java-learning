import java.util.Scanner;

public class homework {
    // public static void primeNumbers(int a){
    //     if(a % 2!=0){
    //         System.out.println("Prime Number");
    //     }else {
    //         System.out.println("Not a prime number");
    //     }
    // }
    public static void evenNumber(int a){
       for(int i=1; i<=10; i++){
         int b=i*a;
         System.out.println(b);
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenNumber(n);
    }
}
