public class StringsMethodinJava  {
    public static void main(String[] args) {

        /* name = Harry
         * H = 0
         * a = 1
         * r = 2
         * r = 3
         * y = 4 
         */
    
          String name = "Harry";
          System.out.println(name);

        //    ====String into Lower Case
         String lstring = name.toLowerCase();
         System.out.println(lstring);
        
        //    ==== String into Upper Case
        String UString = name.toUpperCase();
        System.out.println(UString);
        
        //    ====Remove all the unwanted space from the string
        String untrimmeredString = "    Harry ";
        System.out.println(untrimmeredString);

        System.out.println(untrimmeredString.trim());

        // Return a substring from the previous string with the help of index.
        // name = Harry

  
        //   ====Substring from the string with only begin index.
        String substring = name. substring(4);
        System.out.println(substring);
        /* y is the output because y is the remaining part of the string "name" after the index
        after the given index remaining part consider as a substring .
         */

         String _substring = name. substring(1);
         System.out.println(_substring);//arry

         
        
        //   ====Substring from the string with the begin and end index.
        // begin index included but end index excluded

        String substrings = name. substring(1, 3);//ar
        System.out.println(substrings);


        String _substrings = name. substring(0, 5);//Harry
        System.out.println(_substrings);


        // ==== Replacing the character with another character

        String replace = name. replace('r', 'p');
        System.out.println(replace);

        String _replace = name. replace('H', 'J' );
        System.out.println(_replace);
     
        // ==== String starts with the given charatcer and not returns the boolean value
        Boolean startswith = name.startsWith("Har");
        System.out.println(startswith);
         // OR      System.out.println(name.startsWith("Har"));
     
        // ==== String ends with the given charatcer and not returns the boolean value
        Boolean endswith = name.endsWith("Har");
        System.out.println(endswith); 

        // OR      System.out.println(name.endsWith("Har")); 

        
        Boolean _endswith = name.endsWith("ry");
        System.out.println(_endswith);

         // OR      System.out.println(name.endsWith("ry")); 


        // ==== Return the character of the string according to the given index

       
         System.out.println(name.charAt(4));
         System.out.println(name.charAt(3));
         System.out.println(name.charAt(2));


        // ==== Returns the index of the given string
          // Harry = 0 1 2 3 4

          System.out.println(name.indexOf ("ar"));//1
          System.out.println(name.indexOf ("ry"));//3

        // ==== Returns the index of the given string starting with the given index.
       
        System.out.println(name.indexOf("s",3));//-1
        System.out.println(name.indexOf("ar",3));//-1
        System.out.println(name.indexOf("ar",2)); //-1
        System.out.println(name.indexOf("ar",0)); //1
        System.out.println(name.indexOf("ar",1)); //1
        System.out.println(name.indexOf("ry",3)); //3



       // ==== returns the last index of the given char

          System.out.println(name.indexOf("s")); // -1
          System.out.println(name.indexOf("r"));// 2
          System.out.println(name.indexOf("H"));// 0
          System.out.println(name.indexOf("h"));// -1

        // ==== returns the last index of the given char before the given index.

          System.out.println(name.indexOf("s" , 2));// -1
          System.out.println(name.indexOf("r" ,2 )); // 2
          System.out.println(name.indexOf("r",3)); // 3
          System.out.println(name.indexOf("H", 0));// 0
          System.out.println(name.indexOf("h", 0));// -1


        // ====Returns true if string are equal

          System.out.println(name.equals("Harry"));//  true
          System.out.println(name.equals("harry"));//  false

         

          // ==== in this only string matter irrespective of the case return true if case is same otherwise returns false.
          System.out.println(name.equalsIgnoreCase("hArry"));//  true




        


         
        }
    
}
