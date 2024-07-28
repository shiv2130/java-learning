
import java.util.Scanner;

public class func {
    // public static void printMyName(int a, int b){
    //     int sum =a + b;
    //     return sum;
    // }
    // public static void printFactorial(int n){
    //     if (n<0){
    //         System.out.println("Invalid number");
    //         return;
    //     }
    //     int factorial =1;
    //     for(int i=n; i>=1; i--){
    //         factorial = factorial*i;
    //     }
    //     System.out.println(factorial);
    //     return;
    // }
    public static void product(int a, int b){
        int prd = a*b;
        System.out.println(prd);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);//taken input
        int a= sc.nextInt();
        int b = sc.nextInt();
        product(a, b);
        // printMyName(a, b);//calling function
    }

    
}
