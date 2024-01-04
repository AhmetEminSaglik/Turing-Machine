package org.aes.turingmachine.examples;

import org.aes.logger.CustomLogger;
import org.aes.logger.ILogger;
import org.aes.turingmachine.exception.QNodeException;
import org.aes.turingmachine.machine.TuringMacine;
import org.aes.turingmachine.machine.direction.EnumTuringMoveDirection;
import org.aes.turingmachine.qnode.QNode;
import org.aes.turingmachine.qnode.QNodeFundamentals;
import org.aes.utils.abstracts.ReadableFormatTape;
import org.aes.utils.concretes.LoggerEntegrationQNode;

import java.util.ArrayList;
import java.util.List;

public class TuringMachine_Example_6_EXAM__3a_minus_2b__Output {
    StringBuilder tape = new StringBuilder();
    ReadableFormatTape readableFormatTape;
    public ILogger iLogger = new CustomLogger();
    TuringMacine turingMacine = new TuringMacine(readableFormatTape);

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
    QNode q14 = new QNode("q14");

    public TuringMachine_Example_6_EXAM__3a_minus_2b__Output(ReadableFormatTape readableFormatTape, int aVal, int bVal) throws QNodeException {
        this.readableFormatTape = readableFormatTape;
        for (int i = 0; i < aVal; i++) {
            tape.append("a");
        }
        for (int i = 0; i < bVal; i++) {
            tape.append("b");
        }
        solve();
    }

    public TuringMachine_Example_6_EXAM__3a_minus_2b__Output(ReadableFormatTape readableFormatTape, String text) throws QNodeException {
        this.readableFormatTape = readableFormatTape;
        tape = new StringBuilder(text);
        solve();
    }

    private void solve() throws QNodeException {

        q10.setAsFinalSituation();
        setLoggerAndReadableFormat();
//        q0.setAsFinalSituation();
        QNodeFundamentals q0NF1 = new QNodeFundamentals('a', 'X', EnumTuringMoveDirection.R, q1);
        q0.addNodeFund(q0NF1);

        //        q0.setAsFinalSituation();
        QNodeFundamentals q1NF1 = new QNodeFundamentals('a', 'a', EnumTuringMoveDirection.R, q1);
        QNodeFundamentals q1NF2 = new QNodeFundamentals('b', 'b', EnumTuringMoveDirection.R, q1);
        QNodeFundamentals q1NF3 = new QNodeFundamentals('B', 'c', EnumTuringMoveDirection.R, q2);
        q1.addNodeFund(q1NF1);
        q1.addNodeFund(q1NF2);
        q1.addNodeFund(q1NF3);

        QNodeFundamentals q2NF1 = new QNodeFundamentals('B', 'c', EnumTuringMoveDirection.R, q3);
        q2.addNodeFund(q2NF1);

        QNodeFundamentals q3NF1 = new QNodeFundamentals('B', 'c', EnumTuringMoveDirection.L, q4);
        q3.addNodeFund(q3NF1);

        QNodeFundamentals q4NF1 = new QNodeFundamentals('a', 'a', EnumTuringMoveDirection.L, q4);
        QNodeFundamentals q4NF2 = new QNodeFundamentals('b', 'b', EnumTuringMoveDirection.L, q4);
        QNodeFundamentals q4NF3 = new QNodeFundamentals('c', 'c', EnumTuringMoveDirection.L, q4);
        QNodeFundamentals q4NF4 = new QNodeFundamentals('X', 'X', EnumTuringMoveDirection.R, q5);
        q4.addNodeFund(q4NF1);
        q4.addNodeFund(q4NF2);
        q4.addNodeFund(q4NF3);
        q4.addNodeFund(q4NF4);

        QNodeFundamentals q5NF1 = new QNodeFundamentals('a', 'X', EnumTuringMoveDirection.R, q6);
        QNodeFundamentals q5NF2 = new QNodeFundamentals('Y', 'Y', EnumTuringMoveDirection.R, q9);
        q5.addNodeFund(q5NF1);
        q5.addNodeFund(q5NF2);


        QNodeFundamentals q6NF1 = new QNodeFundamentals('a', 'a', EnumTuringMoveDirection.R, q6);
        QNodeFundamentals q6NF2 = new QNodeFundamentals('Y', 'Y', EnumTuringMoveDirection.R, q6);
        QNodeFundamentals q6NF3 = new QNodeFundamentals('b', 'Y', EnumTuringMoveDirection.R, q7);
        QNodeFundamentals q6NF4 = new QNodeFundamentals('c', 'c', EnumTuringMoveDirection.R, q11);
        q6.addNodeFund(q6NF1);
        q6.addNodeFund(q6NF2);
        q6.addNodeFund(q6NF3);
        q6.addNodeFund(q6NF4);


        QNodeFundamentals q7NF1 = new QNodeFundamentals('b', 'b', EnumTuringMoveDirection.R, q7);
        QNodeFundamentals q7NF2 = new QNodeFundamentals('c', 'c', EnumTuringMoveDirection.R, q7);
        QNodeFundamentals q7NF3 = new QNodeFundamentals('B', 'c', EnumTuringMoveDirection.L, q8);
        q7.addNodeFund(q7NF1);
        q7.addNodeFund(q7NF2);
        q7.addNodeFund(q7NF3);


        QNodeFundamentals q8NF1 = new QNodeFundamentals('a', 'a', EnumTuringMoveDirection.L, q8);
        QNodeFundamentals q8NF2 = new QNodeFundamentals('b', 'b', EnumTuringMoveDirection.L, q8);
        QNodeFundamentals q8NF3 = new QNodeFundamentals('c', 'c', EnumTuringMoveDirection.L, q8);
        QNodeFundamentals q8NF4 = new QNodeFundamentals('Y', 'Y', EnumTuringMoveDirection.L, q8);
        QNodeFundamentals q8NF5 = new QNodeFundamentals('X', 'X', EnumTuringMoveDirection.R, q5);
        q8.addNodeFund(q8NF1);
        q8.addNodeFund(q8NF2);
        q8.addNodeFund(q8NF3);
        q8.addNodeFund(q8NF4);
        q8.addNodeFund(q8NF5);

        QNodeFundamentals q9NF1 = new QNodeFundamentals('Y', 'Y', EnumTuringMoveDirection.R, q9);
        QNodeFundamentals q9NF2 = new QNodeFundamentals('c', 'c', EnumTuringMoveDirection.R, q10);
        q9.addNodeFund(q9NF1);
        q9.addNodeFund(q9NF2);


        QNodeFundamentals q11NF1 = new QNodeFundamentals('c', 'c', EnumTuringMoveDirection.R, q11);
        QNodeFundamentals q11NF2 = new QNodeFundamentals('B', 'c', EnumTuringMoveDirection.R, q12);
        q11.addNodeFund(q11NF1);
        q11.addNodeFund(q11NF2);


        QNodeFundamentals q12NF1 = new QNodeFundamentals('B', 'c', EnumTuringMoveDirection.R, q13);
        q12.addNodeFund(q12NF1);


        QNodeFundamentals q13NF1 = new QNodeFundamentals('B', 'c', EnumTuringMoveDirection.L, q14);
        q13.addNodeFund(q13NF1);


        QNodeFundamentals q14NF1 = new QNodeFundamentals('c', 'c', EnumTuringMoveDirection.L, q14);
        QNodeFundamentals q14NF2 = new QNodeFundamentals('Y', 'Y', EnumTuringMoveDirection.L, q14);
        QNodeFundamentals q14NF3 = new QNodeFundamentals('a', 'a', EnumTuringMoveDirection.L, q14);
        QNodeFundamentals q14NF4 = new QNodeFundamentals('X', 'X', EnumTuringMoveDirection.R, q5);
        q14.addNodeFund(q14NF1);
        q14.addNodeFund(q14NF2);
        q14.addNodeFund(q14NF3);
        q14.addNodeFund(q14NF4);


        turingMacine.start(tape, q0);
    }

    private void setLoggerAndReadableFormat() {
        List<QNode> qNodeList = new ArrayList<>();
        qNodeList.add(q0);
        qNodeList.add(q1);
        qNodeList.add(q2);
        qNodeList.add(q3);
        qNodeList.add(q4);
        qNodeList.add(q5);
        qNodeList.add(q6);
        qNodeList.add(q7);
        qNodeList.add(q8);
        qNodeList.add(q9);
        qNodeList.add(q10);
        qNodeList.add(q11);
        qNodeList.add(q12);
        qNodeList.add(q13);
        qNodeList.add(q14);
        LoggerEntegrationQNode.setLogger(qNodeList, iLogger);
        turingMacine.setIlogger(iLogger);
        turingMacine.setReadableFormat(readableFormatTape);
    }

}
