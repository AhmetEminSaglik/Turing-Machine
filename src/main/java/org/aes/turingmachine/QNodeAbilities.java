package org.aes.turingmachine;

public interface QNodeAbilities {
    void read(TuringMacine turingMacine);

    void update();

    void moveReadHead();

    void activateNextQNode();
    boolean isOver();
}
