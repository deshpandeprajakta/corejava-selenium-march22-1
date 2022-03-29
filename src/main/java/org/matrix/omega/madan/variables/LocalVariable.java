package org.matrix.omega.madan.variables;

public class LocalVariable  {


    LocalVariable() {

        int i =10;
        double j=2.00;
        String str1 = "JavaPrograming";
        System.out.println(i);
        System.out.println(j);
        System.out.println(str1);
    }
     public static void  main (String [] args){

        LocalVariable l1 = new LocalVariable();
        l1.test();
        int i = 20;
        double d = 30.00;
        System.out.println(i);
        System.out.println(d);

     }

     public void test() {

        int k = 30;
        String str2 = "java";
        System.out.println(str2);

    }

}
