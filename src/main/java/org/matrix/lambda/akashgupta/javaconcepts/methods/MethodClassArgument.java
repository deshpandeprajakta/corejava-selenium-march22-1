package org.matrix.lambda.akashgupta.javaconcepts.methods;

import org.matrix.lambda.akashgupta.javaconcepts.classes.Employee;

public class MethodClassArgument {

    public static void diplay(Employee x){
        x.getData();
    }

    public static void main(String[] args) {
        diplay(new Employee());
    }
}
