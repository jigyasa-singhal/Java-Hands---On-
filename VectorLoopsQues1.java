//Sum of the natural number taking input from user.

import java. util.Scanner;
public class VectorLoopsQues1 {
    public static void main(String[] args) {
        
     Scanner scan = new Scanner(System.in);
     int num = scan.nextInt();
     
     int sum = 0;
     for (int i=0 ; i<=num ; i++){
       sum +=i ;

     }
      System.out.println(sum);

    }   
     

}