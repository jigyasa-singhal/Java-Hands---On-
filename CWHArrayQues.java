import java.util.Scanner;
public class CWHArrayQues {
    
    public static void main(String[] args) {
        
        //Ques=1 Array for the floats and find their sum.

       // float [] value = new float [5];
       float [] value = { 20f,20.7f,50.4f,80.9f,45.6f};
       System.out.println(value.length);
       float sum=0;
       for (float i=0;i<value.length;i++){
       
        System.out.println(value[(int) i]);
         sum = sum+(value[(int) i]);
 
        //System.out.println(sum);
       }
       System.out.println(sum);
       System.out.println("The sum  of the value  is : " + sum );

       
        //Ques = 2 calculate avg marks 
        int [] marks = {56,45,55,63,84};
        int markssum  = 0;
        for (int element:marks){
          System.out.println(element);
          markssum = markssum+element; 
        }
        System.out.println(markssum); 
        System.out.println("The sum  of the marks is : " + markssum);

        float avg = markssum/marks.length;
        System.out.println("The average of the marks is : " + avg);
      }

        }
      
   
    

