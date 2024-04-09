
import java.util.Scanner;
public class CWHLoopQues{
    public static void main(String[] args) {
  //Ques =2 while loop
    Scanner yrscan = new Scanner(System.in);
    int n = yrscan.nextInt();
       int i =0;int sum =0;

       while(i<=n){ 
        i++;
        if(i%2==0){
        sum=sum+i;  } 
       }
    System.out.println(sum);


        // Ques = 3 A table 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int nn = scan.nextInt();
        
        for(int ki=1;ki<=10;ki++){
        System.out.println(n*ki);
        }

        // Ques = 4 A table in reverse form
        Scanner _scan = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int p = _scan.nextInt();
        
        for(int ri=10;ri>=1;ri--){
        System.out.println(p*ri);
        }
 
       //Ques = 6
             //Repetition of 5 using while loop

        int a = 5;
        while ((a<15)) {
            System.out.println(a);
            a++;
        }

        //Ques = 9 For the sum of the number occuring in the table of 8
         
        
        int r = 8;
        int nsum = 0;
        for(int zi=1;zi<=10;zi++){
         
         nsum+=zi*8;
        }

       System.out.println(nsum);


        
    }


}