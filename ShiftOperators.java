public class ShiftOperators {

    public static void main(String[] args) {
       /* int p,q,r,s;
        p=q=r=s=20;
        p+=q-=r*=s/=20;
        System.out.println(p+""+q+""+r+""+s);*/
        
        //Right Shift operator = number/2^ shift (shift means right side wala like 0,1,2 etc)
         System.out.println(10>>0);//10/2^0 = 10  (2^0=1)
         System.out.println(10>>1);//5
         System.out.println(10>>2);//2
         System.out.println(10>>3);//1
         System.out.println(10>>4);//0
 
        System.out.println(-10>>0);//-10
        System.out.println(-10>>1);//-5
        System.out.println(-10>>2);//-3
        System.out.println(-10>>3);//-2
        System.out.println(-10>>4);//-1
        System.out.println(-10>>5);//-1
        System.out.println(-10>>6);//-1
         

        //Left Shift Operator = number*2^shift (shift means right side wala like 0,1,2 etc)
         System.out.println(10<<0);// 10*2^0=10
         System.out.println(10<<1);//20
         System.out.println(10<<2);//40
         System.out.println(10<<3);//180
         System.out.println(10<<4);//160

        System.out.println(-10<<0);//-10
        System.out.println(-10<<1);//-20
        System.out.println(-10<<2);//-40
        System.out.println(-10<<3);//-80
        System.out.println(-10<<4);//-160
        System.out.println(-10<<5);//-320
        System.out.println(-10<<6);//-640 
         
    }
    
}