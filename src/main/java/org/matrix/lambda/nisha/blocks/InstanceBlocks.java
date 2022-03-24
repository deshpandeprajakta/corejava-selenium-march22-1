package org.matrix.lambda.nisha.blocks;

public class InstanceBlocks {

    // Instance Initializer block is used to initialize the instance data member.
    // It runs each time whenever an object of the class is created.

    {
        System.out.println("I'm in Instance Block 1");
    }

    public InstanceBlocks() {
        System.out.println("Constructor  block");
    }

    {
        System.out.println("I'm in Instance Block 2");
    }
}


