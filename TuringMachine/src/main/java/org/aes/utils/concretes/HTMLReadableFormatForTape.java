package org.aes.utils.concretes;

import org.aes.utils.abstracts.ReadableFormatTape;

public class HTMLReadableFormatForTape implements ReadableFormatTape {
    @Override
    public String getBetterFormat(String msg) {

        if (msg.length() == 1) {
            return "<b style=\"color: red\">_" + msg + "_</b>";
        }
        return "<b style=\"color: red\">" + msg + "</b>";
    }
}
