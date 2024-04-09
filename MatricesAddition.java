public class MatricesAddition {
    public static void main(String[] args) {
        
   // [2] [3] = 2 rows and three coulmns .
   // outer loop for the coulmns 
   // inner loops for the rows.
   // row = matrices length
   // coulmn = matrices[i].length
    int [] []  mat2 ;
    int [] [] mat1 = new int  [2] [3];
    mat1 [0] [0] = 1;
    mat1 [0] [1] = 7;
    mat1 [0] [2] = 8;
    mat1 [1] [0] = 9;
    mat1 [1] [1] = 6;
    mat1 [1] [2] = 3;


    mat2 = new int  [2] [3];
    mat2 [0] [0] = 1;
    mat2 [0] [1] = 7;
    mat2 [0] [2] = 8;
    mat2 [1] [0] = 9;
    mat2 [1] [1] = 6;
    mat2 [1] [2] = 3;

 // [2] [3] = 2 rows and three coulmns .
   // outer loop for the coulmns 
   // inner loops for the rows.
 // System.out.println(mat1.length);
      System.out.println("MATRICES = 1");
      
        for(int i=0 ; i<mat1.length ; i++){//row
        for ( int j=0;j<mat1[i].length;j++){//coulmn in each row
         System.out.print(mat1[i][j]);
      //  System.out.println(mat1[ i].length);
       // System.out.print(mat1[i][j] + " ");
         System.out.print(" ");
     }     
      System.out.println(" ");

     }
     System.out.println("MATRICES = 2");

     for (int i=0 ; i<mat2.length; i++){
        for (int j = 0 ; j<mat2 [i].length ; j++){
            System.out.print( mat2 [i][j]);
            System.out.print(" ");
        }
        System.out.println();
     }



    System.out.println("FINAL MATRICES = MATRICES 1 + MATRICES 2 ");
    
            

      for (int i=0 ; i<mat2.length; i++){
        for (int j = 0 ; j<mat2 [i].length ; j++){
            System.out.print( mat1[i] [j] + mat2 [i][j]);
            System.out.print(" ");
        }
        System.out.println();
     }
     }  
    }


