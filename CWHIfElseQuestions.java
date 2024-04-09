import java.util.Scanner;
public class CWHIfElseQuestions{

    public static void main(String[] args) {
        
    //Ques =1

      int a = 10;
      if(a>10){
        System.out.println("I am 11");
      }

      else{
        System.out.println("I am not 11");
      }


      //Ques = 2 Take the marks from the user and tell he is fail or not
       
      Scanner  scan = new Scanner (System.in);
      System.out.println("Enter the Marks 1 ");
      int Marks1 = scan.nextInt();
      System.out.println("Enter the Marks 2 ");
      int Marks2 = scan.nextInt();  
      System.out.println("Enter the Marks 3 ");
      int Marks3 = scan.nextInt();

      float  percentage = (((Marks1 + Marks2 + Marks3)/300f)*100f);
      System.out.println("Your Percentage is " + percentage);

       if (percentage > 33 && Marks1>33 && Marks2>33 && Marks3>33){
        System.out.println("Congratulation!! \n You passed ");
       }
       else{
        System.out.println("Sorry!! \n You fail");
       }
       

      // Ques = 3 Calculate income tak accorsing to the income ranges .
      
        Scanner myscan = new Scanner (System.in);
        System.out.println("Enter your Income");
        int income = scan.nextInt();

        if (income>250000 && income<500000){
          float mytax = (5/100f )* income ;
          System.out.println("Your Tax is : " + mytax );
        }
        else if (income>500000 && income <100000){
          float mytax1 = (20/100f)*income;
          System.out.println("Your Tax is : " + mytax1 );
        }
        else if ( income >100000){
          float mytax2 = (30/100f)*income;
          System.out.println("Your Tax is : " + mytax2 );
        }
        else{
          System.out.println("No Tax");
        }
        System.out.println("Thank You !!");

     

      //Ques = 4 To enter the number what is the day

      Scanner _scan= new Scanner (System.in);
      System.out.println("Enter the number (1-7)");
      int number = _scan.nextInt();

      switch (number) {
        case 1:
         System.out.println("It's Monday");
          break;
        case 2:
         System.out.println("It's Tuesday");
          break;
        case 3:
         System.out.println("It's Wednesday");
          break;
        case 4:
         System.out.println("It's Thursday");
          break;      
        case 5:
         System.out.println("It's Friday");
          break;
        case 6:
         System.out.println("It's Saturday");
          break;
        case 7:
         System.out.println("It's Sunday");
          break;
        default:
        System.out.println("Invalid");
          
      }
      System.out.println("Have a Nice Day \n Thank You");

     // Ques =4 Enter year is leap year or not

     Scanner _myscan = new  Scanner (System.in);
     System.out.println("Enter the Year");
     int year = _myscan.nextInt();

     if (year%4==0){
      System.out.println("It's Leap Year");
     }
     else{
      System.out.println("It's not Leap Year");
     }

    // Ques = 5 program to find out the type of website.

    Scanner scann = new Scanner (System.in);
    System.out.println("Enter the url ");
    String str = scann.next();
  
    if (str.endsWith(".com") ){
      System.out.println("This is a Commercial Website");
    }
    if (str.endsWith(".org") ){
      System.out.println("This is a organization website");
    }
    if (str.endsWith(".in") ){
      System.out.println("This is a Indian Website");
    }
    else{
      System.out.println("No Source of Informtion");
    }
    }
    
}