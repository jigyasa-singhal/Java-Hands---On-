// input of 5 subject find percnetge then grade
import java.util.Scanner;
public class VectorIfElseQues8 {
    public static void main(String[] args) {
        
    Scanner scan= new Scanner (System.in);
     System.out.println("Enter the Marks 1");
     int num1  = scan.nextInt();
     System.out.println("Enter the Marks 2");
     int num2 = scan.nextInt();

     System.out.println("Enter the Marks 3");
     int num3  = scan.nextInt();

     System.out.println("Enter the Marks 4");
     int num4  = scan.nextInt();

     System.out.println("Enter the Marks 5");
     int num5  = scan.nextInt();


     float sum = ((num1+num2+num3+num4+num5)/500f);
     float percentage = sum*100f;
     System.out.println(percentage);

     if (percentage>=90){
      System.out.println("Your Grade is : A");
     }
     else if (percentage >= 80){
      System.out.println("Your Grade is : B");
     }
     else if (percentage >=70){
      System.out.println("Your Grade is : C");
     }
     else if (percentage>=60){
     System.out.println("Your Grade is : D");
     }
     else if (percentage>=50){
     System.out.println("Your Grade is : E");
     }   
     else if (percentage>=40){
     System.out.println("Your Grade is : E");
     }  
     else if (percentage<=30){
     System.out.println("Your Grade is too low");
     }      

      System.out.println("Thank You");
    }
    
}
