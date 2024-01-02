package org.aes.utils.concretes;

import org.aes.utils.abstracts.ReadableFormatTape;

public class ConsoleReadableFormatForTape implements ReadableFormatTape {
    @Override
    public String getBetterFormat(String msg) {
        return "\u001B[31m_" + msg + "_\u001B[0m";
    }
}
