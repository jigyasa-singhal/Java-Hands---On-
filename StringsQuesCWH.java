public class StringsQuesCWH {
    //Code with Harry Practice set chapter- 03
    public static void main(String[] args) {
        

    // Ques - 1 Change the String into the lower case.

    String Name = "KRISHNA";
    System.out.println(Name.toLowerCase());

    // Ques - 2 Write a program to replace the space from the underscore.

     String str = "h e l l o";
     System.out.println(str.replace( " ", "_"));



    /*  Ques - 3  Escape Sequence Character
     print "Dear Harry , This java course is nice Thanks" */

    System.out.println(" \" Dear Harry , This java course is nice Thanks \" ");


    //Ques-- 4  replace the name from any other string
    
    String _name = "Yash";
    String _myname = "Dear name Thanks a lot";
    System.out.println(_myname.replace("name", _name));


    // Ques --5 Detect the triple and double space in string

    String detect = "H    e   llo";
    System.out.println(detect.indexOf(""));
    System.out.println(detect.indexOf(" "));
    System.out.println(detect.indexOf("   "));
    System.out.println(detect.indexOf("    "));


    
    }
    
}
