public class operators {


public static void main(String[] args) {
    
    System.out.println(2<=3);
    System.out.println(4>=3);
    System.out.println(4>3  );
    System.out.println((8%2)==0 ); // use of modulus*/



    // Ternary Operators
    int a = 2;
    int b = 2;
    boolean bl = (a>b)? true  :false;
    //isme right side hamesha true define hoga and right side false chaiye hmm kuch bhi string daal de.
    System.out.println(bl);
    
    

   //True:False 
   String st = (3>2)? "I am greater " : "I am smaller"; //dead code
   System.out.println(st);

   String st1  = (3>2)? "77" : "78"; //78=dead code
   System.out.println(st1);

   boolean bl1 = (1>3)? ((2<3)?true:false) : ((2<3)? true:false);
   boolean bl2 = (1>3)? (true ) : (false);
   System.out.println(bl1);
/*(1>3) ke liye flase statement run hogi and then false mein bhi condition given hai then
wo check hogi (2<3) true statement hai to true will be the output.
and these yellow line showing the dead code now.
*/
   
   boolean bl3 = (5>=3)? ((1==2)? true : false) : ((2>3)?true:false);
   System.out.println(bl2);

//a=2 , b=2
// a++ means  pehle a use hoga(2<3 = true)  and then value increment  hogi.
   System.out.println(5>4 && a++<3);//true
   System.out.println(a);//3 , increased hui
   //below statement mein a = 3 use hua hai then increment hokr value a=4 aayi hai
   System.out.println(5>4 & (a++)<3);
   System.out.println(a);//4;
   System.out.println(3<3);//false
   

   int p=6;
   System.out.println(4>5 && 2<3);//false
   System.out.println(4>5 && (p++)<3);//false
   System.out.println(p);//6 value increment nhi hui hai kyoki p++ wali statement execute ni hui.

   System.out.println(4>5 & 2<3);//false
   System.out.println(4>5 & (p++)<3);//false
   System.out.println(p);//7
   /* 
---> && mein agar pehli statement false hui to next statement check/execute nhi hogi kyoki logical operator 
     mein ek false aane pr false hi output aata hai agr pehli statement true hui to wo tb second statement 
     check/execute krega ki true hai ya false.

 ---> & mein dono statement execute hogi chaye pehli statement true ho ya false.
    */
}
}