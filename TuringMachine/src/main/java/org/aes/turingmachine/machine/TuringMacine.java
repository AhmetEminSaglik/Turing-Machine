package org.aes.turingmachine.machine;

import org.aes.logger.CustomLogger;
import org.aes.logger.ILogger;
import org.aes.turingmachine.machine.direction.EnumTuringMoveDirection;
import org.aes.turingmachine.qnode.QNode;
import org.aes.turingmachine.exception.QNodeException;
import org.aes.utils.abstracts.ReadableFormatTape;

import javax.swing.*;

public class TuringMacine {
    private ILogger ilogger;
    private ReadableFormatTape readableFormat;// = new ConsoleReadableFormatForTape();

    public TuringMacine(ReadableFormatTape readableFormat) {
        this.readableFormat = readableFormat;
    }

    private StringBuilder tape;
    private int readHead = 0;
    QNode qNode;
    int counter = 0;

    public boolean start(StringBuilder tape, QNode q0) throws QNodeException {
        this.tape = tape;
        this.qNode = q0;
//        System.out.println("Start : " + getTapeReadableFormat());
        ilogger.addMsg("Start : " + getTapeReadableFormat());
//        q0.move(this);
        boolean result = false;
        try {

            result = process();
            ilogger.getAllMsg().forEach(System.out::println);

//            System.out.println("Last Form Of Tape : " + tape);
        } catch (NullPointerException e) {
            if (qNode.getNodeFundMap().get(getCharAtReadHead()) == null) {
                String msg = "--------------------- Error Occured : " + readHead + ". index (" + tape.charAt(readHead) + ") in Tape is not able to read by " + qNode.getName()
                        + "\ntape : " + getTapeReadableFormat();
                ilogger.addMsg(msg);
                ilogger.getAllMsg().forEach(System.out::println);
                System.err.println(msg);
                throw new QNodeException(msg);
            } else {
//                ilogger.addMsg(e.toString());
                ilogger.getAllMsg().forEach(System.out::println);
                e.printStackTrace();
            }
        }
        return result;
    }

    private void clearTape() {
        for (int i = 0; i < tape.length(); i++) {
            if (tape.charAt(i) == 'B') {
                tape.deleteCharAt(i);
            }
        }
    }


    public String getTapeReadableFormat() {
        StringBuilder nsb = new StringBuilder(tape);
        if (readHead + 1 <= tape.length()) {
//            System.out.println("nsb BEFORE : "+nsb);
            nsb.insert(readHead+1, readableFormat.getBetterFormat(nsb.charAt(readHead) + ""));
            nsb.deleteCharAt(readHead);
//            System.out.println("nsb AFTER : "+nsb);
//            nsb.insert(readHead + 1, "_\u001B[0m");
//            nsb.insert(readHead, "\u001B[31m_");

        }
        return nsb.toString();
    }

    private boolean process() {
        while (!qNode.isOver()) {
            counter++;
//            System.out.print(counter + "-) ");
            ilogger.addMsg("Process:  " + counter);
            clearTape();
            qNode.move(this);

        }

        return qNode.isOver();
//        return true;

    }

    public void updateQNode(QNode qNode) {
        this.qNode = qNode;
        process();
    }

    public void updateTape(char c) {
        tape.setCharAt(readHead, c);
    }

    public char getCharAtReadHead() {
        if (tape.length() == readHead) {
            tape.append("B");
        }
        if (readHead == -1) {
            tape.insert(0, 'B');
            readHead = 0;
        }
        return tape.charAt(readHead);
    }

    public void moveReadHead(EnumTuringMoveDirection direction) {
        if (EnumTuringMoveDirection.R == direction) {
            readHead++;
        } else if (EnumTuringMoveDirection.L == direction) {
            readHead--;
        } else {
            JOptionPane.showMessageDialog(null, "TuringMacine > moveReadHead Hata meydana geldi");
            System.exit(0);
        }

    }

    public void setIlogger(ILogger ilogger) {
        this.ilogger = ilogger;
    }

    public void setReadableFormat(ReadableFormatTape readableFormat) {
        this.readableFormat = readableFormat;
    }
}
