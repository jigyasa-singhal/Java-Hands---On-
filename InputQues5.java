import java.util.Scanner;
//(Code with Harry) Ch - 1 Practice Set

// Program to detect the no. enter by the user is integer or not.
public class InputQues5 {

    public static void main(String[] args) {
        

    Scanner scan = new Scanner (System . in);

    System.out.println("Enter the value -> ");
   
    boolean b1 = scan.hasNextInt();
    System.out.println(b1);
    }
    
}
