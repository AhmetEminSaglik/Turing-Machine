package org.aes.turingmachine;

import javax.swing.*;

public class TuringMacine {
    private StringBuilder tape;
    private int readHead = 0;
    QNode qNode;
    int counter = 0;

    public boolean start(StringBuilder tape, QNode q0) {
        this.tape = tape;
        this.qNode = q0;
        System.out.println("Start : " + getTapeReadableFormat());
//        q0.move(this);
        boolean result = false;
        try {

            result = process();
//            System.out.println("Last Form Of Tape : " + tape);
        } catch (NullPointerException e) {
            if (qNode.getNodeFundMap().get(getCharAtReadHead()) == null) {
                System.err.println("--------------------- Error Occured : " + readHead + ". index ("+tape.charAt(readHead)+") in Tape is not able to read by " + qNode.getName()
                        + "\ntape : " + getTapeReadableFormat());
            } else {
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
            nsb.insert(readHead + 1, "_\u001B[0m");
            nsb.insert(readHead, "\u001B[31m_");
        }
        return nsb.toString();
    }

    private boolean process() {
        while (!qNode.isOver()) {
            counter++;
            System.out.print(counter + "-) ");
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
//        Character c = tape.charAt(readHead);
//        if (c == null) {
//            tape.insert(readHead, 'B');
//            c = 'B';
//        }
//        return c;
        return tape.charAt(readHead);
    }

    void moveReadHead(EnumTuringMoveDirection direction) {
        if (EnumTuringMoveDirection.R == direction) {
            readHead++;
        } else if (EnumTuringMoveDirection.L == direction) {
            readHead--;
        } else {
            JOptionPane.showMessageDialog(null, "TuringMacine > moveReadHead Hata meydana geldi");
            System.exit(0);
        }

    }


}
