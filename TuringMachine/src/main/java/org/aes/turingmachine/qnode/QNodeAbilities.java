package org.aes.turingmachine.qnode;

import org.aes.turingmachine.machine.TuringMacine;

public interface QNodeAbilities {
    void read(TuringMacine turingMacine);

    void update();

    void moveReadHead();

    void activateNextQNode();
    boolean isOver();
}
