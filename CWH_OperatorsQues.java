public class CWH_OperatorsQues {
//(Code with Harry) Ch - 2 Practice Set

    public static void main(String[] args) {
        // Ques - 1 
        float a = 7/4f*9/2; 
        /* Associativity (L---R)
           1*9/2
           9/2
         = 4
         
         */
        System.out.println(a) ;


        //Ques- 2

        int b = 7*49/7+35/7 ; 
        /*Associativity (L---R)
           343/7+35/7
           49+35/7
           49+5
          = 54
         */
        System.out.println(b) ;



        //Ques - 3
        // print v^2-u^2/2as
        int u = 1;
        int v = 1;
        int y = 1;
        int s = 1;
        int c = (u*u - v*v) / 2*y*s;
        System.out.println(c) ;

       

    
    }
}