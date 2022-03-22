package org.matrix.alpha.kamlesh.constructor;

public class TestChild extends TestParent {

    TestChild(){
        System.out.println("I am Child Class");   //In constructor by default class will be super when you use
    }                                             // extends class.

    public static void main(String[] args) {
    new TestChild();
    }
}
