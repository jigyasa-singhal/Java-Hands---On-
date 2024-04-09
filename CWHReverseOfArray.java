public class CWHReverseOfArray {
    public static void main(String[] args) {
        int [] number= new int[3];
        int j=0;
        int[] array = {45,85,96};
        for(int i = array.length-1 ;i>=0;i--){
         System.out.println(array[i]);
        
         number[j]=array[i]; j++;
        }
        System.out.println("The reversed array :");
        for(int i = 0;i<number.length;i++){
         System.out.println(number[i]);
        }  
    }
    
}
