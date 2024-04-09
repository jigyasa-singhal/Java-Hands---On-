public class LoopDoubt {
    

    public static void main(String[] args) {
     int i = 0;
     do{
         i++;
         if(i==2){
             System.out.println("Ending the loop");
             continue;
         }
       System.out.println(i);
       System.out.println(" java is great");
       }while(i<6);
        System.out.println(" loop ends here");

    
        int _i = 0;
        do{
        System.out.println(_i);
         i++;
        }while(i<6);         
         System.out.println(" loop ends here");
             
    
        }

}
