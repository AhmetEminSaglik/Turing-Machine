package org.aes.turingmachine.machine.direction;

public enum EnumTuringMoveDirection {
    L(0, "Left"),
    R(1, "Right");

    private final int id;
    private final String direction;

    EnumTuringMoveDirection(int id, String direction) {
        this.id = id;
        this.direction = direction;
    }

    public int getId() {
        return this.id;
    }

    public String getDirection() {
        return this.direction;
    }

}
