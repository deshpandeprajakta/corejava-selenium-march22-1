package org.matrix.lambda.nisha.blocks;

public class StaticBlocks1 {

    static {
        System.out.println("Im in Static Block 1");
    }

    StaticBlocks1() {
        System.out.println("In Constructor");
    }

    static {
        System.out.println("Im in Static Block 2");
    }
}


