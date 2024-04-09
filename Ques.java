//Datatypes & Variables Questions
public class Ques {
    
    public static void main(String[] args) {
     //Ques -1
     
        int p,q,r,s;
        p=q=r=s=20;
        p+=q-=r*=s/=20;
        System.out.println(p+"" +q+"" +r+ ""+s);

    //Ques-2
    int x;
     x=5;
     {
        int y=9;
        System.out.println(x+" "+y);
     }
     
     //System.out.println(x+""+y);//Compile Error
     //varibale  y  defined only in a block so y is not a defined varible for the above statement
     System.out.println("/n------");
   // Ques-3

      byte by =50;
     // by = by*50;
     int bye  = (int)by*50;
     System.out.println(bye);

     //Ques- 4

     float f1 = 45.9f;
     char ch = (char)f1;
     System.out.println(ch);

     char ch1 = '-';
     int num1= (int)ch1;
     System.out.println(num1);
       
    }
       
    
}
