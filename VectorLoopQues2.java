//Program for the sum of N natural  odd numbers till the number enter by the user
import java.util.Scanner;
public class VectorLoopQues2 {

    public static void main(String[] args) {
        
     Scanner scan =new Scanner (System.in);
     System.out.print("Enter the number:");
     int num = scan.nextInt();
     int sum=0;
     for ( int i=0; i<=num ; i++ ){
     
        if (i%2==0) continue;
    System.out.println(i);
        sum+=i;
     }

     System.out.println("sum of the odd number is :  " + sum );


     /* Another one method is --->

        for ( int i=0; i<=num ; i++ ){
        if (i%2==1){
        sum+=i;
        }
        }
         

      */
    }
    
}
