import java.util.*;
public class gcd {
    public static void gcd(int a, int b){
         //a%2 == 0 
         int hcf = a%b;
         System.out.println(hcf);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers you want the gcd for remember a should br greater than b: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        gcd(m, n);
    }
}
