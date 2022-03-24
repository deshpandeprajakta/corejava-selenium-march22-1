package org.matrix.lambda.nisha.blocks;

public class StaticBlocks2 {
    static {
        System.out.println("Im in Static Block 1");         // Static Block
    }

    static {
        System.out.println("Im in Static Block 2");         // Static Block
    }

    {
        System.out.println("I'm in Instance Block 1");      // Instance block
    }

    StaticBlocks2() {
        System.out.println("In Constructor");               // Constructor
    }

    public static void main(String[] args) {
        StaticBlocks2 obj = new StaticBlocks2();
        System.out.println("--------------------------");
        StaticBlocks2 obj1 = new StaticBlocks2();
    }

}
