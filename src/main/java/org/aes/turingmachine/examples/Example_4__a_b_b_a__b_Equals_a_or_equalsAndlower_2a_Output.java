package org.aes.turingmachine.examples;

import org.aes.turingmachine.EnumTuringMoveDirection;
import org.aes.turingmachine.QNode;
import org.aes.turingmachine.QNodeFundamentals;
import org.aes.turingmachine.TuringMacine;

import java.util.Random;

public class Example_4__a_b_b_a__b_Equals_a_or_equalsAndlower_2a_Output {
    StringBuilder tape = new StringBuilder();

    public Example_4__a_b_b_a__b_Equals_a_or_equalsAndlower_2a_Output(int aVal1, int bVal1, int bVal2, int aVal2) {
        for (int i = 0; i < aVal1; i++) {
            tape.append("a");
        }
        for (int i = 0; i < bVal1 + bVal2; i++) {
            tape.append("b");
        }
        for (int i = 0; i < aVal2; i++) {
            tape.append("a");
        }
        solve();
    }

    public Example_4__a_b_b_a__b_Equals_a_or_equalsAndlower_2a_Output(String text) {
        tape = new StringBuilder(text);
        solve();
    }

    private void solve() {

        QNode q0 = new QNode("q0");
        QNode q1 = new QNode("q1");
        QNode q2 = new QNode("q2");
        QNode q3 = new QNode("q3");
        QNode q4 = new QNode("q4");
        QNode q5 = new QNode("q5");
        QNode q6 = new QNode("q6");
        QNode q7 = new QNode("q7");
        QNode q8 = new QNode("q8");
        QNode q9 = new QNode("q9");
        QNode q10 = new QNode("q10");
        QNode q11 = new QNode("q11");
        QNode q12 = new QNode("q12");
        QNode q13 = new QNode("q13");
        q13.setAsFinalSituation();


//        q0.setAsFinalSituation();
        QNodeFundamentals q0NF1 = new QNodeFundamentals('a', 'X', EnumTuringMoveDirection.R, q1);
        q0.addNodeFund(q0NF1);


        //        q0.setAsFinalSituation();
        QNodeFundamentals q1NF1 = new QNodeFundamentals('a', 'a', EnumTuringMoveDirection.R, q1);
        QNodeFundamentals q1NF2 = new QNodeFundamentals('Y', 'Y', EnumTuringMoveDirection.R, q1);
        QNodeFundamentals q1NF3 = new QNodeFundamentals('b', 'Y', EnumTuringMoveDirection.R, q2);
        q1.addNodeFund(q1NF1);
        q1.addNodeFund(q1NF2);
        q1.addNodeFund(q1NF3);

        QNodeFundamentals q2NF1 = new QNodeFundamentals('b', 'b', EnumTuringMoveDirection.R, q2);
        QNodeFundamentals q2NF2 = new QNodeFundamentals('Z', 'Z', EnumTuringMoveDirection.L, q3);
        QNodeFundamentals q2NF3 = new QNodeFundamentals('a', 'a', EnumTuringMoveDirection.L, q3);
        q2.addNodeFund(q2NF1);
        q2.addNodeFund(q2NF2);
        q2.addNodeFund(q2NF3);

        QNodeFundamentals q3NF1 = new QNodeFundamentals('b', 'Z', EnumTuringMoveDirection.L, q4);
        q3.addNodeFund(q3NF1);

        QNodeFundamentals q4NF1 = new QNodeFundamentals('b', 'b', EnumTuringMoveDirection.L, q4);
        QNodeFundamentals q4NF2 = new QNodeFundamentals('Y', 'Y', EnumTuringMoveDirection.L, q4);
        QNodeFundamentals q4NF3 = new QNodeFundamentals('a', 'a', EnumTuringMoveDirection.L, q5);
        QNodeFundamentals q4NF4 = new QNodeFundamentals('X', 'X', EnumTuringMoveDirection.R, q6);
        q4.addNodeFund(q4NF1);
        q4.addNodeFund(q4NF2);
        q4.addNodeFund(q4NF3);
        q4.addNodeFund(q4NF4);


        QNodeFundamentals q5NF1 = new QNodeFundamentals('a', 'a', EnumTuringMoveDirection.L, q5);
        QNodeFundamentals q5NF2 = new QNodeFundamentals('X', 'X', EnumTuringMoveDirection.R, q0);
        q5.addNodeFund(q5NF1);
        q5.addNodeFund(q5NF2);


        QNodeFundamentals q6NF1 = new QNodeFundamentals('Y', 'Y', EnumTuringMoveDirection.R, q6);
        QNodeFundamentals q6NF2 = new QNodeFundamentals('b', 'b', EnumTuringMoveDirection.R, q6);
        QNodeFundamentals q6NF3 = new QNodeFundamentals('Z', 'Z', EnumTuringMoveDirection.R, q6);
        QNodeFundamentals q6NF4 = new QNodeFundamentals('a', 'X', EnumTuringMoveDirection.L, q7);
        q6.addNodeFund(q6NF1);
        q6.addNodeFund(q6NF2);
        q6.addNodeFund(q6NF3);
        q6.addNodeFund(q6NF4);


        QNodeFundamentals q7NF1 = new QNodeFundamentals('X', 'X', EnumTuringMoveDirection.L, q7);
        QNodeFundamentals q7NF2 = new QNodeFundamentals('Z', 'Z', EnumTuringMoveDirection.L, q7);
        QNodeFundamentals q7NF3 = new QNodeFundamentals('b', 'Z', EnumTuringMoveDirection.L, q8);
        QNodeFundamentals q7NF4 = new QNodeFundamentals('Y', 'Y', EnumTuringMoveDirection.R, q9);
        q7.addNodeFund(q7NF1);
        q7.addNodeFund(q7NF2);
        q7.addNodeFund(q7NF3);
        q7.addNodeFund(q7NF4);


        QNodeFundamentals q8NF1 = new QNodeFundamentals('b', 'b', EnumTuringMoveDirection.L, q8);
        QNodeFundamentals q8NF2 = new QNodeFundamentals('Y', 'Y', EnumTuringMoveDirection.R, q9);
        q8.addNodeFund(q8NF1);
        q8.addNodeFund(q8NF2);

        QNodeFundamentals q9NF1 = new QNodeFundamentals('Z', 'Y', EnumTuringMoveDirection.R, q10);
        QNodeFundamentals q9NF2 = new QNodeFundamentals('b', 'Y', EnumTuringMoveDirection.R, q10);
        q9.addNodeFund(q9NF1);
        q9.addNodeFund(q9NF2);

        QNodeFundamentals q10NF1 = new QNodeFundamentals('b', 'b', EnumTuringMoveDirection.R, q10);
        QNodeFundamentals q10NF2 = new QNodeFundamentals('Z', 'Z', EnumTuringMoveDirection.R, q10);
        QNodeFundamentals q10NF3 = new QNodeFundamentals('X', 'X', EnumTuringMoveDirection.R, q10);
        QNodeFundamentals q10NF4 = new QNodeFundamentals('a', 'X', EnumTuringMoveDirection.L, q7);
        QNodeFundamentals q10NF5 = new QNodeFundamentals('B', 'B', EnumTuringMoveDirection.L, q11);
        q10.addNodeFund(q10NF1);
        q10.addNodeFund(q10NF2);
        q10.addNodeFund(q10NF3);
        q10.addNodeFund(q10NF4);
        q10.addNodeFund(q10NF5);

        QNodeFundamentals q11NF1 = new QNodeFundamentals('X', 'X', EnumTuringMoveDirection.R, q11);
        QNodeFundamentals q11NF2 = new QNodeFundamentals('Z', 'Z', EnumTuringMoveDirection.R, q11);
        QNodeFundamentals q11NF3 = new QNodeFundamentals('Y', 'Y', EnumTuringMoveDirection.R, q11);
        QNodeFundamentals q11NF4 = new QNodeFundamentals('B', 'B', EnumTuringMoveDirection.L, q12);
        q11.addNodeFund(q11NF1);
        q11.addNodeFund(q11NF2);
        q11.addNodeFund(q11NF3);
        q11.addNodeFund(q11NF4);


        QNodeFundamentals q12NF1 = new QNodeFundamentals('X', 'X', EnumTuringMoveDirection.L, q12);
        QNodeFundamentals q12NF2 = new QNodeFundamentals('Z', 'Z', EnumTuringMoveDirection.L, q12);
        QNodeFundamentals q12NF3 = new QNodeFundamentals('Y', 'Y', EnumTuringMoveDirection.L, q12);
        QNodeFundamentals q12NF4 = new QNodeFundamentals('B', 'B', EnumTuringMoveDirection.R, q13);
        q12.addNodeFund(q12NF1);
        q12.addNodeFund(q12NF2);
        q12.addNodeFund(q12NF3);
        q12.addNodeFund(q12NF4);


        TuringMacine turingMacine = new TuringMacine();
        turingMacine.start(tape, q0);

//        QNode q1 = new QNode();

        // aaa -->bbbbbb ornegini yapan q'leri yazicam sonra calistiracam


    }
}
