class variableanddatatypes {
    static int n2 = 5;
    int n3 = 25;

    public static void main(String[] args) {
         int n1 = 5;//local varibales
         int n3 = 22;

         System.out.println(n1);
         System.out.println(n2);
         // yaha n3 ki value 22 print hogi local varibale ko prefrence milegi.
         System.out.println(n3);
         //Boolean gives result in True & False.
        boolean bl = true;
        
        long lg = -1435444444l;
        //hmme L/l lgana pdta hai ki long recognise ho ske. 
        short sh = 4456;
        // byte ranges -128 to 128 but also show error in 128.
        byte bt = 127;
        // we have to mentioned f to denote that it is flot value.
        float f1 = 45.6f;

        // [up typecasting]
        double d = 45.6;
        double d1 = 235648;
        /*
          it gives output 235648.0 , mention .0 becoz it store flaot value &
          it don't need f because float value can easily store in double due to up
          casting
         */
        float f2 = 1;
        char ch = 'a';//97
        char ch1 = 'z';//122
        char ch2 = 'A';//65
        char ch3 = 'Z';//90
        int _num1 = 91;
        
       // System.out.println(ch2+"");
        System.out.println((char)(ch2+32));//a

        // [down typecasting]
        int Num1 = (int)lg;
        System.out.println(Num1);//1435444444
        int Num2 = (int)_num1;
        System.out.println(Num2);//91
        int Num3 = (int) f1;
        System.out.println(Num3);//45
        int Num4 = (int) d;
        System.out.println(Num4);//45
        int Num5 = (int) f2;
        System.out.println(Num5);//1
         int Num6 = (int) ch;
        System.out.println(Num6);//97
        int Num7 = (int) ch1;
        System.out.println(Num7);//112
        int Num8 = (int) ch2 ;
        System.out.println(Num8);//65
        int Num9 = (int) ch3 ;
        System.out.println(Num9);//90
        char Num10 = (char) _num1;
        System.out.println(Num10);//[


        
          System.out.println(bl);
          System.out.println(lg);
          System.out.println(_num1);
          System.out.println(sh);
          System.out.println(bt);
          System.out.println(f1);
          System.out.println(d);
          System.out.println(d1);
          System.out.println(f2);
          System.out.println(ch);
          System.out.println(ch1);

         

    }

}