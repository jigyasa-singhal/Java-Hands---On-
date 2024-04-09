import java.util.Scanner;
public class LoopQuesn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int i =0;int sum =0;
        while(i<=n){ 
            i++;
            if(i%2==0){
           
            sum=sum+i;}
            //System.out.println(sum);
        }
  System.out.println(sum);

  
  
    }
    
}
