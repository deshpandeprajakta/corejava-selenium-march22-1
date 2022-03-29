package org.matrix.delta.ganesh.Inheritance;

public class Child extends Parent {

    public void myChild(){
        System.out.println("In Child");
    }

    public static void main(String[] args) {
        Parent.myParent();

        Child child = new Child();
//        child.myParent();
        child.myChild();

    }


}
