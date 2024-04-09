import java.util.Scanner;
public class InputQues2 {
 //Calculate CGPA using marks of 5 subjects out of 100 marks.
//(Code with Harry) Ch - 1 Practice Set
    public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the marks of Subject 1 out 0f 100 : ");
    int a = sc .nextInt();
    System.out.println("Enter the marks of Subject 2 out 0f 100 : ");
    int b = sc .nextInt();
    System.out.println("Enter the marks of Subject 3 out 0f 100 : ");
    int c = sc .nextInt();
    System.out.println("Enter the marks of Subject 4 out 0f 100 : ");
    int d = sc .nextInt();
    System.out.println("Enter the marks of Subject 5 out 0f 100 : ");
    int e = sc .nextInt();
 // for % into CGPA divide the % by 9.5
   int sum = (a+b+c+d+e);
   System.out.print("Total Sum of 5 Subjects Marks out 0f 500 is : ");
   System.out.println(sum);
   

   
   
    float percenatge = (sum/500f)*100;
    System.out.println("Percentage of 5 subject is : " + percenatge);
   // System.out.println(percenatge);
   
   float CGPA = (float)(percenatge / 9.5f);
   System.out.println("CGPA is : " + CGPA );
   //System.out.println(CGPA );




    }
}

