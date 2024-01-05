package org.aes.turingmachine.qnode;

import org.aes.logger.ILogger;
import org.aes.turingmachine.machine.TuringMacine;

import javax.swing.*;
import java.util.HashMap;

public class QNode implements QNodeAbilities, QNodeMoveAction {
    ILogger iLogger;
    private String name;
    private char readCharactedFromTape;
    private TuringMacine turingMacine;
    private HashMap<Character, QNodeFundamentals> nodeFundMap = new HashMap<>();
    private boolean isFinalSituation = false;
    private QNodeFundamentals activatedQNodeFund;

    public QNode(String name) {
        this.name = name;
    }

    public void setiLogger(ILogger iLogger) {
        this.iLogger = iLogger;
    }

    @Override
    public void read(TuringMacine turingMacine/*StringBuilder tape, int readHead*/) {
        this.turingMacine = turingMacine;
        readCharactedFromTape = turingMacine.getCharAtReadHead();
        activatedQNodeFund = nodeFundMap.get(readCharactedFromTape);
        //todo Error Handle  yanlis harf okumasi yapilirsa hata verebilir.
    }

    @Override
    public void update() {
        turingMacine.updateTape(activatedQNodeFund.getNewChar());
    }

    @Override
    public void moveReadHead() {
        turingMacine.moveReadHead(nodeFundMap.get(readCharactedFromTape).getDirection());

    }

    @Override
    public void activateNextQNode() {
//        System.out.println("activatedQNodeFund.getNextQNode() : "+activatedQNodeFund.getNextQNode().getName()+"-"+activatedQNodeFund.getNextQNode().isFinalSituation);
        turingMacine.updateQNode(activatedQNodeFund.getNextQNode());
    }

    @Override
    public boolean isOver() {
        if (nodeFundMap.isEmpty() || isFinalSituation) {
//            turingMacine.clearTape();
//           iLogger.addMsg(turingMacine.getTapeReadableFormat());
//            iLogger.addMsg(turingMacine.getTape());

            iLogger.disableLogging();
            return true;
        }/*
        if (nodeFundMap.isEmpty()) {
            iLogger.addMsg(">>> Turing Machine run successfully");
            JOptionPane.showMessageDialog(null, " Final QNode degil ama Baska QNODE yok \n"+this);
            iLogger.disableLogging();
            return true;
        }
        if (isFinalSituation) {
            iLogger.addMsg(">>> Turing Machine run successfully");
            iLogger.disableLogging();
            return true;
        }*/

        return false;
    }

    public void addNodeFund(QNodeFundamentals nodeFund) {
        nodeFundMap.put(nodeFund.getOldChar(), nodeFund);
    }

    public void setAsFinalSituation() {
        isFinalSituation = true;
    }

    @Override
    public void move(TuringMacine turingMacine) {
        read(turingMacine);
        iLogger.addMsg("tape : " + turingMacine.getTapeReadableFormat());
        iLogger.addMsg(this.toString());
        update();
//        System.out.println("turingMacine.getTapeReadableFormat() "+turingMacine.getTapeReadableFormat());
//        System.out.println("ilogger "+iLogger);

        moveReadHead();
        activateNextQNode();

    }

    @Override
    public String toString() {
        return //"QNode{" +
                /*" name='" +*/ name +// '\'' +
                " = { Uc-Durum =" + isFinalSituation +
                ", Sonraki-Uygulancak-Adim => " + activatedQNodeFund +
                '}';
    }

    public HashMap<Character, QNodeFundamentals> getNodeFundMap() {
        return nodeFundMap;
    }

    public String getName() {
        return name;
    }
}
