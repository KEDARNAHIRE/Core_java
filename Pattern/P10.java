package Pattern;

public class P10 {
    public static void main(String[] args) {
        /*
         
                * * * * *
              * * * * *  
            * * * * *
          * * * * *
        * * * * * 

         */
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" x");
            }
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
