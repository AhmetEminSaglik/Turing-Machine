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
import java.util.Random;

public class TuringMachine_Example_3__First_Last_Different_Values_Exchange_Output {
    StringBuilder tape = new StringBuilder();
    ReadableFormatTape readableFormatTape;
    ILogger iLogger = new CustomLogger();
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

    public TuringMachine_Example_3__First_Last_Different_Values_Exchange_Output(ReadableFormatTape readableFormatTape, int firstIndexValue, int middleDataSize, int lastIndexValue) throws QNodeException {
        this.readableFormatTape = readableFormatTape;
        tape.append(firstIndexValue);

        for (int i = 0; i < middleDataSize; i++) {
            Random random = new Random();
            tape.append(random.nextInt(2));
        }
        tape.append(lastIndexValue);
        solve();
    }

    public TuringMachine_Example_3__First_Last_Different_Values_Exchange_Output(ReadableFormatTape readableFormatTape, String text) throws QNodeException {
        this.readableFormatTape = readableFormatTape;
        tape = new StringBuilder(text);
        solve();
    }

    private void solve() throws QNodeException {
        q4.setAsFinalSituation();
        setLoggerAndReadableFormat();
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
