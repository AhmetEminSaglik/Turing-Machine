package org.aes.turingmachine.examples;

import org.aes.turingmachine.EnumTuringMoveDirection;
import org.aes.turingmachine.QNode;
import org.aes.turingmachine.QNodeFundamentals;
import org.aes.turingmachine.TuringMacine;
import org.aes.turingmachine.exception.QNodeException;

public class Example_1__n__2n_Output {
    public Example_1__n__2n_Output(int inputValue) throws QNodeException {


        StringBuilder tape = new StringBuilder();
        for (int i = 0; i < inputValue; i++) {
            tape.append("a");
        }

        QNode q0 = new QNode("q0");
        QNode q1 = new QNode("q1");
        QNode q2 = new QNode("q2");
        QNode q3 = new QNode("q3");
        QNode q4 = new QNode("q4");
        q4.setAsFinalSituation();


//        q0.setAsFinalSituation();
        QNodeFundamentals q0NF1 = new QNodeFundamentals('a', 'X', EnumTuringMoveDirection.R, q1);
        QNodeFundamentals q0NF2 = new QNodeFundamentals('b', 'b', EnumTuringMoveDirection.R, q4);
        q0.addNodeFund(q0NF1);
        q0.addNodeFund(q0NF2);


        //        q0.setAsFinalSituation();
        QNodeFundamentals q1NF1 = new QNodeFundamentals('a', 'a', EnumTuringMoveDirection.R, q1);
        QNodeFundamentals q1NF2 = new QNodeFundamentals('b', 'b', EnumTuringMoveDirection.R, q1);
        QNodeFundamentals q1NF3 = new QNodeFundamentals('B', 'b', EnumTuringMoveDirection.R, q2);
        q1.addNodeFund(q1NF1);
        q1.addNodeFund(q1NF2);
        q1.addNodeFund(q1NF3);

        QNodeFundamentals q2NF1 = new QNodeFundamentals('B', 'b', EnumTuringMoveDirection.L, q3);
        q2.addNodeFund(q2NF1);

        QNodeFundamentals q3NF1 = new QNodeFundamentals('b', 'b', EnumTuringMoveDirection.L, q3);
        QNodeFundamentals q3NF2 = new QNodeFundamentals('a', 'a', EnumTuringMoveDirection.L, q3);
        QNodeFundamentals q3NF3 = new QNodeFundamentals('X', 'X', EnumTuringMoveDirection.R, q0);

        q3.addNodeFund(q3NF1);
        q3.addNodeFund(q3NF2);
        q3.addNodeFund(q3NF3);


        TuringMacine turingMacine = new TuringMacine();
        turingMacine.start(tape, q0);
    }
}
