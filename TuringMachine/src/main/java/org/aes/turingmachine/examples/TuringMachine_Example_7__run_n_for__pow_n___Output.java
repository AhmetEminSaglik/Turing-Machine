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

public class TuringMachine_Example_7__run_n_for__pow_n___Output {
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

    public TuringMachine_Example_7__run_n_for__pow_n___Output(ReadableFormatTape readableFormatTape, int nVal) throws QNodeException {
        this.readableFormatTape = readableFormatTape;
        for (int i = 0; i < nVal; i++) {
            tape.append("a");
        }
        solve();
    }

    public TuringMachine_Example_7__run_n_for__pow_n___Output(ReadableFormatTape readableFormatTape, String text) throws QNodeException {
        this.readableFormatTape = readableFormatTape;
        tape = new StringBuilder(text);
        solve();
    }

    private void solve() throws QNodeException {

        q5.setAsFinalSituation();
        setLoggerAndReadableFormat();
//        q0.setAsFinalSituation();
        QNodeFundamentals q0NF1 = new QNodeFundamentals('a', 'A', EnumTuringMoveDirection.R, q1);
        q0.addNodeFund(q0NF1);

        //        q0.setAsFinalSituation();
        QNodeFundamentals q1NF1 = new QNodeFundamentals('a', 'a', EnumTuringMoveDirection.R, q2);
        q1.addNodeFund(q1NF1);

        QNodeFundamentals q2NF1 = new QNodeFundamentals('B', 'c', EnumTuringMoveDirection.R, q3);
        QNodeFundamentals q2NF2 = new QNodeFundamentals('a', 'a', EnumTuringMoveDirection.R, q6);
        q2.addNodeFund(q2NF1);
        q2.addNodeFund(q2NF2);

        QNodeFundamentals q3NF1 = new QNodeFundamentals('B', 'c', EnumTuringMoveDirection.L, q4);
        q3.addNodeFund(q3NF1);

        QNodeFundamentals q4NF1 = new QNodeFundamentals('a', 'c', EnumTuringMoveDirection.L, q4);
        QNodeFundamentals q4NF2 = new QNodeFundamentals('c', 'c', EnumTuringMoveDirection.L, q4);
        QNodeFundamentals q4NF3 = new QNodeFundamentals('A', 'c', EnumTuringMoveDirection.L, q5);
        q4.addNodeFund(q4NF1);
        q4.addNodeFund(q4NF2);
        q4.addNodeFund(q4NF3);


        QNodeFundamentals q6NF1 = new QNodeFundamentals('a', 'a', EnumTuringMoveDirection.R, q6);
        QNodeFundamentals q6NF2 = new QNodeFundamentals('b', 'b', EnumTuringMoveDirection.R, q6);
        QNodeFundamentals q6NF3 = new QNodeFundamentals('B', 'b', EnumTuringMoveDirection.L, q7);
        q6.addNodeFund(q6NF1);
        q6.addNodeFund(q6NF2);
        q6.addNodeFund(q6NF3);


        QNodeFundamentals q7NF1 = new QNodeFundamentals('a', 'a', EnumTuringMoveDirection.L, q7);
        QNodeFundamentals q7NF2 = new QNodeFundamentals('b', 'b', EnumTuringMoveDirection.L, q7);
        QNodeFundamentals q7NF3 = new QNodeFundamentals('A', 'A', EnumTuringMoveDirection.R, q8);
        q7.addNodeFund(q7NF1);
        q7.addNodeFund(q7NF2);
        q7.addNodeFund(q7NF3);


        QNodeFundamentals q8NF1 = new QNodeFundamentals('a', 'A', EnumTuringMoveDirection.R, q6);
        QNodeFundamentals q8NF2 = new QNodeFundamentals('b', 'b', EnumTuringMoveDirection.L, q9);
        q8.addNodeFund(q8NF1);
        q8.addNodeFund(q8NF2);

        QNodeFundamentals q9NF1 = new QNodeFundamentals('A', 'X', EnumTuringMoveDirection.R, q10);
        q9.addNodeFund(q9NF1);

        QNodeFundamentals q10NF1 = new QNodeFundamentals('X', 'X', EnumTuringMoveDirection.R, q10);
        QNodeFundamentals q10NF2 = new QNodeFundamentals('b', 'Y', EnumTuringMoveDirection.R, q11);
        QNodeFundamentals q10NF3 = new QNodeFundamentals('c', 'c', EnumTuringMoveDirection.L, q13);
        q10.addNodeFund(q10NF1);
        q10.addNodeFund(q10NF2);
        q10.addNodeFund(q10NF3);

        QNodeFundamentals q11NF1 = new QNodeFundamentals('b', 'b', EnumTuringMoveDirection.R, q11);
        QNodeFundamentals q11NF2 = new QNodeFundamentals('c', 'c', EnumTuringMoveDirection.R, q11);
        QNodeFundamentals q11NF3 = new QNodeFundamentals('B', 'c', EnumTuringMoveDirection.L, q12);
        q11.addNodeFund(q11NF1);
        q11.addNodeFund(q11NF2);
        q11.addNodeFund(q11NF3);


        QNodeFundamentals q12NF1 = new QNodeFundamentals('b', 'b', EnumTuringMoveDirection.L, q12);
        QNodeFundamentals q12NF2 = new QNodeFundamentals('c', 'c', EnumTuringMoveDirection.L, q12);
        QNodeFundamentals q12NF3 = new QNodeFundamentals('Y', 'Y', EnumTuringMoveDirection.R, q10);
        q12.addNodeFund(q12NF1);
        q12.addNodeFund(q12NF2);
        q12.addNodeFund(q12NF3);


        QNodeFundamentals q13NF1 = new QNodeFundamentals('Y', 'b', EnumTuringMoveDirection.L, q13);
        QNodeFundamentals q13NF2 = new QNodeFundamentals('X', 'X', EnumTuringMoveDirection.L, q13);
        QNodeFundamentals q13NF3 = new QNodeFundamentals('A', 'X', EnumTuringMoveDirection.R, q10);
        QNodeFundamentals q13NF4 = new QNodeFundamentals('B', 'B', EnumTuringMoveDirection.R, q5);
        q13.addNodeFund(q13NF1);
        q13.addNodeFund(q13NF2);
        q13.addNodeFund(q13NF3);
        q13.addNodeFund(q13NF4);


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
        LoggerEntegrationQNode.setLogger(qNodeList, iLogger);
        turingMacine.setIlogger(iLogger);
        turingMacine.setReadableFormat(readableFormatTape);
    }

}
