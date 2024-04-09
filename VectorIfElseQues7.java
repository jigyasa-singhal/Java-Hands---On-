// Check ka divisions according to percentage
import java.util.Scanner;
public class VectorIfElseQues7 {
    public static void main(String[] args) {
     
    Scanner scan = new Scanner(System.in);
    int percentage = scan.nextInt();

     if (percentage>=60){
        System.out.println("You have 1st divison");
     }
     else if(percentage>=45) {
         System.out.println("You have 2nd divison");
     }
     else if (percentage>=30){
         System.out.println("You have 3rd divison");
     }
     else if (percentage<30){
          System.out.println("You have 4th divison");

     }
             System.out.println("Thank You");

    }
    
}
