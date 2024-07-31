import java.util.Scanner;

public class excersise {
    // public static void average(int a){
    // //     int avg = (a+b+c)/3;
    // //     System.out.println(avg);
    // //   
    //      int sum =0;
    //      for(int i=1; i<=a; i++){
    //         if(i%2!=0){
    //             sum=sum+i;

    //         }
    //      }
    //      System.out.println(sum);
    // }
    // public static void greater(int a, int b){
    //     if(a>b){
    //         System.out.println(a + " is greater than " + b);
    //     }else{
    //         System.out.println(b + " is greater than " + a);
    //     }

    // }
    // public static void circum(int a){
      
    //     System.out.println(2*3.14*a);
    // }

    public static void adult(int a){
        if (a>=18) {
            System.out.println("You are eligible to vote!");

        }else{
            System.out.println("Sorry! You are not eligible to vote!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int m = sc.nextInt();
        int n = sc.nextInt();
        adult(n);
       
    }
}
