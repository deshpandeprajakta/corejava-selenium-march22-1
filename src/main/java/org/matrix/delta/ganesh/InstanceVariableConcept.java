package org.matrix.delta.ganesh;

public class InstanceVariableConcept {

    int p = 200;

    {
        System.out.println("Instance variable in blocks - " + p);
    }

    InstanceVariableConcept() {
        System.out.println("Instance variable in Constructor - " + p);
    }

    public void display() {
        System.out.println("Instance variable in method - " + p);
    }

    public static void main(String[] args) {
//        System.out.println("Instance variable in static main method - "+p);
        InstanceVariableConcept instanceVariableConcept = new InstanceVariableConcept();
        instanceVariableConcept.display();

    }
}
