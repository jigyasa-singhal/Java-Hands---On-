// whether a given input is integer or not using if else.
import java.util.Scanner;
public class VectorIfElseQues2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
          

        if(   scan.hasNextInt()){

            System.out.println("It is a Integer Number");

        }
        
        else {
            System.out.println("It is not a Integer Number");
         }
    }
    
}