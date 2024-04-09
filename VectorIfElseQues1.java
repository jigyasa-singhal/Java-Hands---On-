// Leap year Ques with the help of if else.
import java.util.Scanner;
public class VectorIfElseQues1 {
    public static void main(String[] args) {
    
    Scanner scan  = new Scanner (System.in);
    int year = scan.nextInt();
    if (year%4==0){
        System.out.println("It is a Leap Year");
    }
   
    else {
        System.out.println("It is not a Leap Year");
    }

    }
}



