package org.aes.turingmachine;

public interface QNodeAbilities {
//    void read(StringBuilder tape, int readHead);
    void read(TuringMacine turingMacine);

    void update();

    void moveReadHead();

    void activateNextQNode();
    boolean isOver();
}
