package org.aes.turingmachine.examples;

import java.util.Random;

public class ExampleMain {
    public static void main(String[] args) {
//        new Example1_n__2n_Output(3);

//        new Example_1__n__n_Plus_2_Output("abbb");


//        int a=3;
//        new Example_2__n__n_Plus_2_Output(a,a+2);

        new Example_3__First_Last_Different_Values_Exchange_Output(0, 1, 0);
        System.out.println("-------------------------");
        new Example_3__First_Last_Different_Values_Exchange_Output(0, 1, 1);
        System.out.println("-------------------------");
        new Example_3__First_Last_Different_Values_Exchange_Output(1, 1, 0);
        System.out.println("-------------------------");
        new Example_3__First_Last_Different_Values_Exchange_Output(1, 1, 1);
    }
}
