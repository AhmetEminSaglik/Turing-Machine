package org.aes.turingmachine.examples;

import org.aes.turingmachine.EnumTuringMoveDirection;
import org.aes.turingmachine.QNode;
import org.aes.turingmachine.QNodeFundamentals;
import org.aes.turingmachine.TuringMacine;

import java.util.Random;

public class Example_3__First_Last_Different_Values_Exchange_Output {
    StringBuilder tape = new StringBuilder();

    public Example_3__First_Last_Different_Values_Exchange_Output(int firstIndexValue, int middleDataSize, int lastIndexValue) {

        tape.append(firstIndexValue);

        for (int i = 0; i < middleDataSize; i++) {
            Random random = new Random();
            tape.append(random.nextInt(2));
        }
        tape.append(lastIndexValue);
        solve();
    }

    public Example_3__First_Last_Different_Values_Exchange_Output(String text) {
        tape = new StringBuilder(text);
        solve();
    }

    private void solve() {

        QNode q0 = new QNode("q0");
        QNode q1 = new QNode("q1");
        QNode q2 = new QNode("q2");
        QNode q3 = new QNode("q3");
        QNode q4 = new QNode("q4");
        q4.setAsFinalSituation();

        QNode q5 = new QNode("q5");
        QNode q6 = new QNode("q6");
        QNode q7 = new QNode("q6");
        QNode q8 = new QNode("q6");
        QNode q9 = new QNode("q6");


//        q0.setAsFinalSituation();
        QNodeFundamentals q0NF1 = new QNodeFundamentals('1', 'X', EnumTuringMoveDirection.R, q1);
        QNodeFundamentals q0NF2 = new QNodeFundamentals('0', 'X', EnumTuringMoveDirection.R, q6);
        q0.addNodeFund(q0NF1);
        q0.addNodeFund(q0NF2);


        //        q0.setAsFinalSituation();
        QNodeFundamentals q1NF1 = new QNodeFundamentals('1', '1', EnumTuringMoveDirection.R, q1);
        QNodeFundamentals q1NF2 = new QNodeFundamentals('0', '0', EnumTuringMoveDirection.R, q1);
        QNodeFundamentals q1NF3 = new QNodeFundamentals('B', 'B', EnumTuringMoveDirection.L, q2);
        q1.addNodeFund(q1NF1);
        q1.addNodeFund(q1NF2);
        q1.addNodeFund(q1NF3);

        QNodeFundamentals q2NF1 = new QNodeFundamentals('0', '1', EnumTuringMoveDirection.L, q3);
        QNodeFundamentals q2NF2 = new QNodeFundamentals('1', '1', EnumTuringMoveDirection.L, q5);
        q2.addNodeFund(q2NF1);
        q2.addNodeFund(q2NF2);

        QNodeFundamentals q3NF1 = new QNodeFundamentals('0', '0', EnumTuringMoveDirection.L, q3);
        QNodeFundamentals q3NF2 = new QNodeFundamentals('1', '1', EnumTuringMoveDirection.L, q3);
        QNodeFundamentals q3NF3 = new QNodeFundamentals('X', '0', EnumTuringMoveDirection.L, q4);

        q3.addNodeFund(q3NF1);
        q3.addNodeFund(q3NF2);
        q3.addNodeFund(q3NF3);


//        QNodeFundamentals q4NF1 = new QNodeFundamentals('b', 'Y', EnumTuringMoveDirection.R, q5);
//
//        q4.addNodeFund(q4NF1);


        QNodeFundamentals q5NF1 = new QNodeFundamentals('1', '1', EnumTuringMoveDirection.L, q5);
        QNodeFundamentals q5NF2 = new QNodeFundamentals('0', '0', EnumTuringMoveDirection.L, q5);
        QNodeFundamentals q5NF3 = new QNodeFundamentals('X', '1', EnumTuringMoveDirection.L, q4);

        q5.addNodeFund(q5NF1);
        q5.addNodeFund(q5NF2);
        q5.addNodeFund(q5NF3);


        QNodeFundamentals q6NF1 = new QNodeFundamentals('1', '1', EnumTuringMoveDirection.R, q6);
        QNodeFundamentals q6NF2 = new QNodeFundamentals('0', '0', EnumTuringMoveDirection.R, q6);
        QNodeFundamentals q6NF3 = new QNodeFundamentals('B', 'B', EnumTuringMoveDirection.L, q7);

        q6.addNodeFund(q6NF1);
        q6.addNodeFund(q6NF2);
        q6.addNodeFund(q6NF3);


        QNodeFundamentals q7NF1 = new QNodeFundamentals('1', '0', EnumTuringMoveDirection.L, q8);
        QNodeFundamentals q7NF2 = new QNodeFundamentals('0', '0', EnumTuringMoveDirection.L, q9);
        q7.addNodeFund(q7NF1);
        q7.addNodeFund(q7NF2);


        QNodeFundamentals q8NF1 = new QNodeFundamentals('0', '0', EnumTuringMoveDirection.L, q8);
        QNodeFundamentals q8NF2 = new QNodeFundamentals('1', '1', EnumTuringMoveDirection.L, q8);
        QNodeFundamentals q8NF3 = new QNodeFundamentals('X', '1', EnumTuringMoveDirection.L, q4);
        q8.addNodeFund(q8NF1);
        q8.addNodeFund(q8NF2);
        q8.addNodeFund(q8NF3);


        QNodeFundamentals q9NF1 = new QNodeFundamentals('0', '0', EnumTuringMoveDirection.L, q9);
        QNodeFundamentals q9NF2 = new QNodeFundamentals('1', '1', EnumTuringMoveDirection.L, q9);
        QNodeFundamentals q9NF3 = new QNodeFundamentals('X', '0', EnumTuringMoveDirection.L, q4);
        q9.addNodeFund(q9NF1);
        q9.addNodeFund(q9NF2);
        q9.addNodeFund(q9NF3);


        TuringMacine turingMacine = new TuringMacine();
        turingMacine.start(tape, q0);

//        QNode q1 = new QNode();

        // aaa -->bbbbbb ornegini yapan q'leri yazicam sonra calistiracam


    }
}
