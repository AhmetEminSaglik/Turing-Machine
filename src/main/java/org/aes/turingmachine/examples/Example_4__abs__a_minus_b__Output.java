package org.aes.turingmachine.examples;

import org.aes.turingmachine.EnumTuringMoveDirection;
import org.aes.turingmachine.QNode;
import org.aes.turingmachine.QNodeFundamentals;
import org.aes.turingmachine.TuringMacine;
import org.aes.turingmachine.exception.QNodeException;

public class Example_4__abs__a_minus_b__Output {
    StringBuilder tape = new StringBuilder();

    public Example_4__abs__a_minus_b__Output(int aVal, int bVal) throws QNodeException {
        for (int i = 0; i < aVal; i++) {
            tape.append("a");
        }
        for (int i = 0; i < bVal; i++) {
            tape.append("b");
        }
        solve();
    }

    public Example_4__abs__a_minus_b__Output(String text) throws QNodeException {
        tape = new StringBuilder(text);
        solve();
    }

    private void solve() throws QNodeException {

        QNode q0 = new QNode("q0");
        QNode q1 = new QNode("q1");
        QNode q2 = new QNode("q2");
        QNode q3 = new QNode("q3");
        QNode q4 = new QNode("q4");
        q4.setAsFinalSituation();
        QNode q5 = new QNode("q5");
        QNode q6 = new QNode("q6");
        q6.setAsFinalSituation();

//        q0.setAsFinalSituation();
        QNodeFundamentals q0NF1 = new QNodeFundamentals('a', 'a', EnumTuringMoveDirection.R, q1);
        QNodeFundamentals q0NF2 = new QNodeFundamentals('b', 'b', EnumTuringMoveDirection.R, q4);
        q0.addNodeFund(q0NF1);
        q0.addNodeFund(q0NF2);

        //        q0.setAsFinalSituation();
        QNodeFundamentals q1NF1 = new QNodeFundamentals('X', 'X', EnumTuringMoveDirection.R, q1);
        QNodeFundamentals q1NF2 = new QNodeFundamentals('Y', 'Y', EnumTuringMoveDirection.R, q1);
        QNodeFundamentals q1NF3 = new QNodeFundamentals('a', 'a', EnumTuringMoveDirection.R, q1);
        QNodeFundamentals q1NF5 = new QNodeFundamentals('b', 'Y', EnumTuringMoveDirection.L, q2);
        QNodeFundamentals q1NF4 = new QNodeFundamentals('B', 'B', EnumTuringMoveDirection.L, q4);
        q1.addNodeFund(q1NF1);
        q1.addNodeFund(q1NF2);
        q1.addNodeFund(q1NF3);
        q1.addNodeFund(q1NF4);
        q1.addNodeFund(q1NF5);

        QNodeFundamentals q2NF1 = new QNodeFundamentals('Y', 'Y', EnumTuringMoveDirection.L, q2);
        QNodeFundamentals q2NF2 = new QNodeFundamentals('X', 'X', EnumTuringMoveDirection.L, q2);
        QNodeFundamentals q2NF3 = new QNodeFundamentals('a', 'X', EnumTuringMoveDirection.R, q3);
        QNodeFundamentals q2NF4 = new QNodeFundamentals('B', 'B', EnumTuringMoveDirection.R, q5);
        q2.addNodeFund(q2NF1);
        q2.addNodeFund(q2NF2);
        q2.addNodeFund(q2NF3);
        q2.addNodeFund(q2NF4);

        QNodeFundamentals q3NF1 = new QNodeFundamentals('Y', 'Y', EnumTuringMoveDirection.R, q1);
        QNodeFundamentals q3NF2 = new QNodeFundamentals('X', 'X', EnumTuringMoveDirection.R, q1);
        q3.addNodeFund(q3NF1);
        q3.addNodeFund(q3NF2);

        QNodeFundamentals q5NF1 = new QNodeFundamentals('X', 'b', EnumTuringMoveDirection.R, q6);
        QNodeFundamentals q5NF2 = new QNodeFundamentals('Y', 'b', EnumTuringMoveDirection.R, q6);
        q5.addNodeFund(q5NF1);
        q5.addNodeFund(q5NF2);

        TuringMacine turingMacine = new TuringMacine();
        turingMacine.start(tape, q0);
    }
}
