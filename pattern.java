public class pattern {
    public static void main(String[] args) {
        int n=5;
        //int num=1;
    //  int m=5;
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=m; j++){
    //             System.out.print("*");
    //     }
    //        System.out.println("");
    // }
    // for(int i=1; i<=n; i++){
    //     for(int j=1; j<=m; j++){
    //         if(i==1 || j==1 || i==n || j==m){
    //             System.out.print("*");
    //         }else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }
    // for(int i=1; i<=n; i++){
    //     for(int j=1; j<=i; j++){

    //     }
    // }
    // for(int i=n; i>=1; i--){
    //     for(int j=1; j<=i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println("");
    // }

    // for(int i =5; i>=n; i--){
    //     for(int j=1; j<=i; j++){
    //         System.out.print(j+ " ");
    //     }
    //     System.out.println("");
    // } 

    // for(int i=1; i<=n; i++){
    //     for(int j=1; j<=i; j++){
    //         System.out.print(num+ " ");
    //         num++;
    //     }
    //     System.out.println(" ");
    // }
    
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            int sum =i+j;
           if(sum % 2==0){
             System.out.print("1 ");
           } else{
            System.out.print("0 " );
           }
        }
        System.out.println();
    }

}
}
