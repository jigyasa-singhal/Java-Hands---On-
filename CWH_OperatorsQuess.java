import java.util.Scanner;
    //(Code with Harry) Ch - 2 Practice Set

public class CWH_OperatorsQuess {


    //Ques -- 4
    //Use Comparison opeartors to find out the number eneterd by the user is greater than the given number or not.
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       int a = scan. nextInt();
       int b = 4;

        System.out.println(a>b);



        //Ques -- 5 
        // To Encrypt a grade by adding 8 to it and decrypt it to show the correct grade
         char ch = 'A';
         char grade = (char) (ch +8);
         System.out.println(grade);

         //Decrypt the Grade 
         grade = (char) (grade-8);
        
     System.out.println(grade);



    }
    
}
