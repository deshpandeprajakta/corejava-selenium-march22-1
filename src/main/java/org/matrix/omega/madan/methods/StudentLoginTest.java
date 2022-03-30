package org.matrix.omega.madan.methods;

public class StudentLoginTest {

    public static void main (String [] args){

     StudentLoginPage Sp = new StudentLoginPage();
     Sp.Login();
     String Title = Sp.getTitleOfPage();
     System.out.println("Title of page: " +Title);
    }


}
