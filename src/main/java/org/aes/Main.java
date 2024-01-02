package org.aes;

import org.aes.turingmachine.qnode.QNode;
import org.aes.turingmachine.machine.direction.EnumTuringMoveDirection;
import org.aes.turingmachine.qnode.QNodeFundamentals;
import org.aes.turingmachine.machine.TuringMacine;
import org.aes.turingmachine.exception.QNodeException;
import org.aes.utils.concretes.ConsoleReadableFormatForTape;

public class Main {

    public static void main(String[] args) throws QNodeException {

        StringBuilder tape = new StringBuilder("aaa");

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


        TuringMacine turingMacine = new TuringMacine(new ConsoleReadableFormatForTape());
        turingMacine.start(tape, q0);

//        QNode q1 = new QNode();

        // aaa -->bbbbbb ornegini yapan q'leri yazicam sonra calistiracam


    }


}