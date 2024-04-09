public class CWHElementInArrayQues  {
    public static void main(String[] args) {

// For the maximum element in array.
    int [] array = {56,78,89,65,23};
    //initalise max with the first element of array.
    int max = array[0];
    //System.out.println(max);
    for(int i=0;i<array.length;i++){
        System.out.println(array[i]);
        //compare element of array with max
         if(array[i]>max){
         max=array[i];     
    }
    }
        System.out.println("max element of array is :" + max);


// For the minimum element in array.
     int[] myarray ={74,89,110,156,999,58};
     int min = myarray[0];
     for(int i=0;i<myarray.length;i++){
        System.out.println(myarray[i]);
         if(myarray[i]<min){
         min=myarray[i];
    }
    }
        System.out.println("min element of array is :" + min);
 }
    
}
