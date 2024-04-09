public class CWHArraysQues {
    public static void main(String[] args) {

// Ques = Array in reverse form 
    /*int  [] arr = {12,45,69,35,74,02};
    System.out.println("array ");
    for(int i=0 ; i<arr.length ;i++){
        System.out.println(arr[i]);
    }
     System.out.println("array in reverse form ");
    for(int i=arr.length-1 ; i>=0 ;i--){
        System.out.println(arr[i]);
    }*/
    
//Ques = to find out whether a given integer is present in array ot not.

int [] value = {45,45,23,89,56};
int num = 89;
for(int i=0 ; i<value.length ;i++){
        System.out.println(value[i]);
        
        boolean bl = false;
        bl= value[i]==89; 


         //System.out.println(bl);
         if ( bl == true  ){
            System.out.println("number is present in array" );}
         else {
            System.out.println("number is not present in array");
                
            }
        }
    }

}
    

