package org.aes.turingmachine.exception;

public class QNodeException extends Exception {
    private  final String errMsg;

    public QNodeException(String errMsg) {
        this.errMsg = errMsg;
    }
}
