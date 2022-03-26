package org.matrix.sigma.ashish.Stringmethod;

public class StringMethods {
    public static void main(String[] args) {

        String str = "AshishThopate";
        System.out.println("Length of String :" + str.length());

        System.out.println("Length of Array String  :" + args.length);

        String str1 = "ASHISHTHOPATE";
        String str2 = "ashishthopate";
        System.out.println("To Lower Case  : " + str1.toLowerCase());
        System.out.println("To Upper Case  : " + str2.toUpperCase());

        String str3 = "         AshishThopate      ";
        System.out.println("Remove Spaces  " + str3.trim());

        String str4 = "ASHISH";
        String str5 = "ashish";
        System.out.println("Equals Method ASHISH and ashish " + str4.equals(str5));
        System.out.println("EqualIgnorecase ASHISH and ashish" + str4.equalsIgnoreCase(str5));

        System.out.println("Cha  at 0   " + str4.charAt(0));
        System.out.println("Char at 1   " + str4.charAt(1));
        System.out.println("Char at 1   " + str4.charAt(2));
        System.out.println("Char at 1   " + str4.charAt(3));
        System.out.println("Char at 1   " + str4.charAt(4));
        System.out.println("Char at 1   " + str4.charAt(5));

        System.out.println("Replace Method " + str4.replace('s', 'm'));

        System.out.println("Replace all Method   " + str5.replaceAll("ish", "vini"));

        System.out.println("Indexof Method  A " + str4.indexOf('A'));
        System.out.println("Indexof Method S  " + str4.indexOf('S'));
        System.out.println("Last Index of S   " + str4.lastIndexOf('S'));

        System.out.println("Substring Method   (0,3)" + str5.substring(0, 3));
        System.out.println("Substring method   (0,6)" + str5.substring(0, 6));
        System.out.println("Substring Method  (0)" + str5.substring(0));
        System.out.println("Substring Method (6)  " + str5.substring(6));
        System.out.println("substring Method (0,0)  " + str5.substring(0, 0));



        System.out.println("Concat Method      " + str4.concat("Thopate"));
        System.out.println("Contains Method Ashish   " + str5.contains("ish"));


    }

}
