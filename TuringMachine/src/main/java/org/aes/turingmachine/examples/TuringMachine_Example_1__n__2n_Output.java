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

public class TuringMachine_Example_1__n__2n_Output {
    ReadableFormatTape readableFormatTape;
    public ILogger iLogger = new CustomLogger();
    TuringMacine turingMacine = new TuringMacine(readableFormatTape);
    QNode q0 = new QNode("q0");
    QNode q1 = new QNode("q1");
    QNode q2 = new QNode("q2");
    QNode q3 = new QNode("q3");
    QNode q4 = new QNode("q4");

    public TuringMachine_Example_1__n__2n_Output(ReadableFormatTape readableFormatTape, int inputValue) throws QNodeException {
        this.readableFormatTape = readableFormatTape;

        StringBuilder tape = new StringBuilder();
        for (int i = 0; i < inputValue; i++) {
            tape.append("a");
        }

        q4.setAsFinalSituation();
        setLoggerAndReadableFormat();

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

        turingMacine.start(tape, q0);
    }

    private void setLoggerAndReadableFormat() {
        List<QNode> qNodeList = new ArrayList<>();
        qNodeList.add(q0);
        qNodeList.add(q1);
        qNodeList.add(q2);
        qNodeList.add(q3);
        qNodeList.add(q4);
        LoggerEntegrationQNode.setLogger(qNodeList, iLogger);
        turingMacine.setIlogger(iLogger);
        turingMacine.setReadableFormat(readableFormatTape);
    }
}
