package org.aes.turingmachine;

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
        return "QNodeFundamentals{" +
                "oldChar=" + oldChar +
                ", newChar=" + newChar +
                ", direction=" + direction.getDirection() +
                ", nextQNode=" + nextQNode.getName() +
                '}';
    }
}
