package org.aes.turingmachine;

import javax.swing.*;
import java.util.HashMap;

//public abstract class QNode implements QNodeAbilities, QNodeMoveAction {
public class QNode implements QNodeAbilities, QNodeMoveAction {
    private String name;
    private char readCharactedFromTape;
    //    StringBuilder tape;
    private TuringMacine turingMacine;
    private HashMap<Character, QNodeFundamentals> nodeFundMap = new HashMap<>();
    private boolean isFinalSituation = false;
    private QNodeFundamentals activatedQNodeFund;

    public QNode(String name) {
        this.name = name;
    }
//    read(tape, readHead) {
//        c = tape.charAt(readHead);


    /* Burada Turing machine yerine direk string builder gondersem
     degisiklik yapsam o zaman turinge' yansir mi? onu ogrenmem lazim.*/
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
//        System.out.println("-------------------------");
        turingMacine.updateQNode(activatedQNodeFund.getNextQNode());
//        System.out.println("activatedQNodeFund.getNextQNode() : " + activatedQNodeFund.getNextQNode());
    }

    @Override
    public boolean isOver() {
        if (nodeFundMap.isEmpty() && isFinalSituation) {
//            JOptionPane.showMessageDialog(null, " Uc durum olabilir,  F ve noQNode");
            return true;
        }
        if (nodeFundMap.isEmpty()) {
            JOptionPane.showMessageDialog(null, " Final QNode degil ama Baska QNODE yok");
            return true;
        }
        if (isFinalSituation) {
//            JOptionPane.showMessageDialog(null, " Final QNode. Ama baska hareket de yok");
            return true;
        }

        return false;
    }

    public void addNodeFund(QNodeFundamentals nodeFund) {
        nodeFundMap.put(nodeFund.getOldChar(), nodeFund);
    }

//    public void setNodeFundMap(HashMap<Character, QNodeFundamentals> nodeFundMap) {
//        this.nodeFundMap = nodeFundMap;
//    }

    public void setAsFinalSituation() {
        isFinalSituation = true;
//        isFinalSituation = finalSituation;
    }

    @Override
    public void move(TuringMacine turingMacine) {
        read(turingMacine);
        update();
        System.out.println("tape : " + turingMacine.getTapeReadableFormat());
        moveReadHead();
        System.out.println(this);
        activateNextQNode();

//        return isOver();

    }

    @Override
    public String toString() {
        return "QNode{" +
                "name='" + name + '\'' +
                ", isFinalSituation=" + isFinalSituation +
                ", activatedQNodeFund=" + activatedQNodeFund +
                '}';
    }

    public HashMap<Character, QNodeFundamentals> getNodeFundMap() {
        return nodeFundMap;
    }

    public String getName() {
        return name;
    }
}
