package org.aes.turingmachine.qnode;

import org.aes.turingmachine.machine.direction.EnumTuringMoveDirection;

public class QNodeFundamentals {
    private  char oldChar;
    private final char newChar;
    private final EnumTuringMoveDirection direction;
    private final QNode nextQNode;

    public QNodeFundamentals(Character oldChar, Character newChar, EnumTuringMoveDirection direction, QNode nextQNode) {
        this.nextQNode = nextQNode;
        if (oldChar != null) {
            this.oldChar = oldChar;
        }
        this.newChar = newChar;
        this.direction = direction;
    }

    public QNode getNextQNode() {
        return nextQNode;
    }

    public char getNewChar() {
        return newChar;
    }

    public EnumTuringMoveDirection getDirection() {
        return direction;
    }

    public char getOldChar() {
        return oldChar;
    }

    @Override
    public String toString() {
        return "{"+oldChar+"/"+newChar+","+direction.getDirection() +"-->"+nextQNode.getName()+"}";
        /*
        return "q-Hareket{" +
                "Okunan-Deger = " + oldChar +
                ", Guncellenecek-Deger = " + newChar +
                ", Yon = " + direction.getDirection() +
                ", Next-q = " + nextQNode.getName() +
                '}';
    */}
}
