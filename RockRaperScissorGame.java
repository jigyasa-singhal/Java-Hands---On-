//Rock Paper Scissor Game 

import java.util.Scanner;
import java.util.Random;
/* generate random numbers using java.util.Random.
1) For using this class to generate random numbers, we have to first create an instance of this 
class and then invoke methods such as nextInt(), nextDouble(), nextLong() etc using that 
instance.
2)  We can generate random numbers of types integers, float, double, long, booleans using this class.
3)  We can pass arguments to the methods for placing an upper bound on the range of the numbers to be
 generated. For example, nextInt(6) will generate numbers in the range 0 to 5 both inclusive.

// A Java program to demonst */
public class RockRaperScissorGame{
public static void main(String[] args) {
    
System.out.println("Enter the \"Start\" to start the game");
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
if(str.equalsIgnoreCase("Start")){
    System.out.println("Game Started");
    System.out.println(" 1 - Rock \n 2 - Paper \n 3 - Scissor ");
}
else {
    System.out.println("Enter the \"Start\" to start the game \"");

}

System.out.print("Enter your Choice : ");
int  x = scan.nextInt();

switch(x){
    case 1 : 
    System.out.println(" your Choice : 1 = Rock ");
          break;
    case 2 : 
    System.out.println(" your Choice : 2 = Paper ");
          break;

    case 3 : 
    System.out.println(" your Choice : 3 = scissor ");
          break;

     default :
    System.out.println(" Invalid choice ( Choose from 1-3) ");
}

  Random rand = new Random();
  int y = rand.nextInt(1,4);
     System.out.println("Computer choose  :" + y);

switch(y){
    case 1 : 
    System.out.println(" Computer Choice : 1 = Rock ");
                 break;

    case 2 : 
    System.out.println(" Computer Choice : 2 = Paper ");
              break;

    case 3 : 
    System.out.println(" Computer Choice : 3 = scissor ");
              break;

 
     default :
    System.out.println(" Invalid choice ( Choose from 1-3) ");
}


if (x==y){
    System.out.println("Match tie \n No one Win");
}
else if ( x==1 && y==2 || x==2 && y==3 || x==3 && y==1){
    System.out.println("Computer win \n Sorry!! You Lost");
}
else if ( x==2 && y==1 || x==3 && y==2 || x==1 && y==3){
    System.out.println(" Congratulation !! You win");
}

System.out.println("Thank You");
}
}