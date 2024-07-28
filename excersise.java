import java.util.Scanner;

public class excersise {
    public static void average(int a, int b, int c){
        int avg = (a+b+c)/3;
        System.out.println(avg);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        average(d, e, f);
    }
}
