import java.util.Scanner;

public class statement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Choose which option to perform 1.SUM, 2.Diff, 3.Division, 4.Multiplication");
        int option =sc.nextInt();
        int sum = a+b;
        int div = a/b;
        int mult= a*b;
        int diff= a-b;
        if (option==1) {
            System.out.println(sum);}
        else if (option ==2) {
            System.out.println(diff);
        }else if (option==3){
            System.out.println(div);
        }else if  (option==4){
            System.out.println(mult);
        }else{
            System.out.println("Wrong choice");
        }
    }
    

}