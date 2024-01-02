package org.aes.turingmachine.examples;

import org.aes.turingmachine.exception.QNodeException;
import org.aes.utils.abstracts.ReadableFormatTape;
import org.aes.utils.concretes.ConsoleReadableFormatForTape;
import org.aes.utils.concretes.HTMLReadableFormatForTape;

public class ExampleConsoleMain {
    public static void main(String[] args) {
        ReadableFormatTape consoleFormat = new ConsoleReadableFormatForTape();
        ReadableFormatTape htmlFormat = new HTMLReadableFormatForTape();
        try {

//            new TuringMachine_Example_2__n__n_Plus_2_Output(consoleFormat, "abbb");
//            new TuringMachine_Example_1__n__2n_Output(consoleFormat, 4);
//            new TuringMachine_Example_2__n__n_Plus_2_Output(consoleFormat, 2,4);
//            new TuringMachine_Example_3__First_Last_Different_Values_Exchange_Output(consoleFormat, 1,1,0);
//            new TuringMachine_Example_3__First_Last_Different_Values_Exchange_Output(consoleFormat, "10");
//            new TuringMachine_Example_4__a_b_b_a__b_Equals_a_or_equalsAndlower_2a_Output(consoleFormat,1,1,1,12);
            new TuringMachine_Example_5__abs__a_minus_b__Output(consoleFormat,2,5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
