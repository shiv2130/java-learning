public class fibonacci {
    public static void main(String[] args) {
        int m = 1;
        int n = 0;
        int N = 10;
        for(int i=1; i<N; i++){
    
            System.out.println(m);
            int num = m + n;
            m = n ;
            n = num;

            
        }
        
    }
}
