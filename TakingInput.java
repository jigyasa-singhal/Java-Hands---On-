import java.util.Scanner;
public class TakingInput {
 
    public static void main(String[] args) {

        /* Scanner is a class 
         * sc is a variable name
         * new is a keyword
         * Scanner again class 
         * System.in is taking the input from the keyboard
         * 
         */
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number 1");
     int a = sc.nextInt();
     System.out.println("Enter the number 2");
     int b = sc.nextInt();

     int sum = a+b;
     System.out.print("sum is ");
        System.out.println(sum);
    }
}