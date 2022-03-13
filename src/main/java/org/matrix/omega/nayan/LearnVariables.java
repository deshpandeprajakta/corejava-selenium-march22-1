package org.matrix.omega.nayan;

public class LearnVariables {
    static String a = "BOSS";
    int b = 99;
    int c = 20;

    LearnVariables() {
        System.out.println(a);
    }

    public void display() {
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        System.out.println(a);
        LearnVariables e = new LearnVariables();
        e.display();
    }
}