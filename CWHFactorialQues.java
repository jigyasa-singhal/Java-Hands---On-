import java.util.Scanner;

public class CWHFactorialQues {
    public static void main(String[] args) {
        
    
    // Ques = 5 factorial of a number = This method is only works till 6
        Scanner myscan = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int s = myscan.nextInt();
        
        int fact =1 ;
        
        for(int i=1;i<=s;i++){
            fact = fact*i;
        }
         System.out.println(fact);
            //Repetition of 5 using while loop
                    int i =1;
         while( i<=10) {
            System.out.println(5);
           i++;
         }
    }
}
            










































































































































        
  

