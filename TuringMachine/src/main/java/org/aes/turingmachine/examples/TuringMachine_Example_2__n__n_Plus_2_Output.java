package org.aes.turingmachine.examples;

import org.aes.logger.CustomLogger;
import org.aes.logger.ILogger;
import org.aes.turingmachine.machine.direction.EnumTuringMoveDirection;
import org.aes.turingmachine.qnode.QNode;
import org.aes.turingmachine.qnode.QNodeFundamentals;
import org.aes.turingmachine.machine.TuringMacine;
import org.aes.turingmachine.exception.QNodeException;
import org.aes.utils.abstracts.ReadableFormatTape;
import org.aes.utils.concretes.ConsoleReadableFormatForTape;
import org.aes.utils.concretes.LoggerEntegrationQNode;

import java.util.ArrayList;
import java.util.List;

public class TuringMachine_Example_2__n__n_Plus_2_Output {
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


    public TuringMachine_Example_2__n__n_Plus_2_Output(ReadableFormatTape readableFormatTape, int aval, int bval)/* throws QNodeException*/ {
        this.readableFormatTape = readableFormatTape;
        for (int i = 0; i < aval; i++) {
            tape.append("a");
        }
        for (int i = 0; i < bval; i++) {
            tape.append("b");
        }
        solve();
    }

    public TuringMachine_Example_2__n__n_Plus_2_Output(ReadableFormatTape readableFormatTape, String text) /*throws QNodeException*/ {
        this.readableFormatTape = readableFormatTape;
        tape = new StringBuilder(text);
        solve();
    }

    private void solve()/* throws QNodeException*/ {

        q6.setAsFinalSituation();
        setLoggerAndReadableFormat();

//        q0.setAsFinalSituation();
        QNodeFundamentals q0NF1 = new QNodeFundamentals('a', 'X', EnumTuringMoveDirection.R, q1);
        QNodeFundamentals q0NF2 = new QNodeFundamentals('Y', 'Y', EnumTuringMoveDirection.R, q3);
        q0.addNodeFund(q0NF1);
        q0.addNodeFund(q0NF2);


        //        q0.setAsFinalSituation();
        QNodeFundamentals q1NF1 = new QNodeFundamentals('a', 'a', EnumTuringMoveDirection.R, q1);
        QNodeFundamentals q1NF2 = new QNodeFundamentals('Y', 'Y', EnumTuringMoveDirection.R, q1);
        QNodeFundamentals q1NF3 = new QNodeFundamentals('b', 'Y', EnumTuringMoveDirection.L, q2);
        q1.addNodeFund(q1NF1);
        q1.addNodeFund(q1NF2);
        q1.addNodeFund(q1NF3);

        QNodeFundamentals q2NF1 = new QNodeFundamentals('a', 'a', EnumTuringMoveDirection.L, q2);
        QNodeFundamentals q2NF2 = new QNodeFundamentals('Y', 'Y', EnumTuringMoveDirection.L, q2);
        QNodeFundamentals q2NF3 = new QNodeFundamentals('X', 'X', EnumTuringMoveDirection.R, q0);
        q2.addNodeFund(q2NF1);
        q2.addNodeFund(q2NF2);
        q2.addNodeFund(q2NF3);

        QNodeFundamentals q3NF1 = new QNodeFundamentals('Y', 'Y', EnumTuringMoveDirection.R, q3);
        QNodeFundamentals q3NF2 = new QNodeFundamentals('b', 'Y', EnumTuringMoveDirection.R, q4);

        q3.addNodeFund(q3NF1);
        q3.addNodeFund(q3NF2);

        QNodeFundamentals q4NF1 = new QNodeFundamentals('b', 'Y', EnumTuringMoveDirection.R, q5);

        q4.addNodeFund(q4NF1);


        QNodeFundamentals q5NF1 = new QNodeFundamentals('B', 'B', EnumTuringMoveDirection.L, q6);

        q5.addNodeFund(q5NF1);


//        TuringMacine turingMacine = new TuringMacine(readableFormatTape);
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
        LoggerEntegrationQNode.setLogger(qNodeList, iLogger);
        turingMacine.setIlogger(iLogger);
        turingMacine.setReadableFormat(readableFormatTape);
    }
}
