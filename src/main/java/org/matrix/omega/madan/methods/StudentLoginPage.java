package org.matrix.omega.madan.methods;
import javax.swing.*;
public class StudentLoginPage {


    public static void Login(){

        System.out.println("enter your ID:");
        System.out.println("enter your email ID:");

    }
    public static void main (String [] args) {

        JButton Button1 = new JButton("click here");
        Button1.setBounds(50,100,95,30);
        StudentLoginPage S1 = new StudentLoginPage();
    }

    public String getTitleOfPage(){

        String str1 = "loginpage";
        return str1;
    }
}
