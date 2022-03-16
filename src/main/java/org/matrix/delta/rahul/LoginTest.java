package org.matrix.delta.rahul;

public class LoginTest {
    public static void main(String[] args) {
        LoginWindow log=new LoginWindow();
        log.loginDetails();
        String str= log.login();
        System.out.println("User email id "+str);

    }
}
