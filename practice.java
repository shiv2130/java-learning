import java.util.*;
public class practice {
    public static void main(String[] args) {
        int positive = 0; int negative = 0; int zero  =  0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to continue or 0 to stop");
        int input = sc.nextInt();
        while(input == 1){
            System.out.println("Enter your number: ");
            int number = sc.nextInt();
            if (number>0) {
                positive++;

            }else if(number<0){
                negative++;

            }else{
                zero++;
            }
            System.out.println("Press 1 to continue or 0 to exit");
            input = sc.nextInt();

        }
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);
    }
}
