import java.util.Scanner;
//(Code with Harry) Ch - 1 Practice Set

//Program to convert kilometers into miles 

public class InputQues4 {
  public static void main(String[] args) {

    Scanner scan = new Scanner (System.in);
    System.out.print( "Enter the Kilometers : ");
    
    float km = scan . nextFloat();

    //1km =0.621371 miles 
       
    float miles =  km * 0.621371f;

    System.out.println( " Enter value in miles is -> " + miles);
  }
    


}
