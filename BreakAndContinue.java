public class BreakAndContinue {

;

    public static void main(String[] args) {
   
         /*  Break ===
          if use break before the sout so it excluded
          the value in which we have to stop the code Ex=5 in below code.
         */
        for(int i=1 ; i<10;i++){ 
        if (i==5) break;
        System.out.println(i);
        }

          /* If use break after the sout so it included the value in which we
          have to stop the code.
          */
        for(int y=1 ; y<10;y++){ 
        System.out.println(y);
          if (y==5) break;
        }



         // Continue = 8 excluded from the below code. 
         for(float s = 5 ; s <10; s++){
         if ( s==8) continue;
         System.out.println(s);
        }

  
        for (float d= 4 ; d<10 ; d++){
          System.out.println(d);
          if (d==6) continue;
          // when continue after the sout so it can't work.
        }
        


    }
  }

