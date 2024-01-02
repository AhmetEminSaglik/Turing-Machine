package org.aes.turingmachine.examples;

import org.aes.turingmachine.exception.QNodeException;
import org.aes.utils.abstracts.ReadableFormatTape;
import org.aes.utils.concretes.ConsoleReadableFormatForTape;
import org.aes.utils.concretes.HTMLReadableFormatForTape;

public class ExampleMain {
    public static void main(String[] args) {
//  1-)
//  new TuringMachine_Example_1__n__2n_Output(3);
//                System.out.println("=================================");
//  2-)

        ReadableFormatTape consoleFormat = new ConsoleReadableFormatForTape();
        ReadableFormatTape htmlFormat = new HTMLReadableFormatForTape();
        try {

//            new TuringMachine_Example_2__n__n_Plus_2_Output(consoleFormat, "aabbbb");
            new TuringMachine_Example_1__n__2n_Output(consoleFormat, 4);
        } catch (QNodeException e) {
            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
        }
//                System.out.println("=================================");
//        int a=3;
//  3-)       new TuringMachine_Example_2__n__n_Plus_2_Output(a,a+2);
//                System.out.println("=================================");
/*
    4-)     new TuringMachine_Example_3__First_Last_Different_Values_Exchange_Output(0, 1, 0);
        System.out.println("-------------------------");
        new TuringMachine_Example_3__First_Last_Different_Values_Exchange_Output(0, 1, 1);
        System.out.println("-------------------------");
        new TuringMachine_Example_3__First_Last_Different_Values_Exchange_Output(1, 1, 0);
        System.out.println("-------------------------");
        new TuringMachine_Example_3__First_Last_Different_Values_Exchange_Output(1, 1, 1);*/
//  5-)       new TuringMachine_Example_4__a_b_b_a__b_Equals_a_or_equalsAndlower_2a_Output(1,3,2,1);
//              System.out.println("-------------------------");
//  6-)       new TuringMachine_Example_4__a_b_b_a__b_Equals_a_or_equalsAndlower_2a_Output(1, 2, 2, 1);
//              System.out.println("-------------------------");
//  7-)       new TuringMachine_Example_4__abs__a_minus_b__Output(1,3);
    }
}
