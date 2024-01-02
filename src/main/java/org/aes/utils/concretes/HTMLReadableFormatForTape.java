package org.aes.utils.concretes;

import org.aes.utils.abstracts.ReadableFormatTape;

public class HTMLReadableFormatForTape implements ReadableFormatTape {
    @Override
    public String getBetterFormat(String msg) {
        return "<p style=\"color: red\">" + msg + ".</p>";
    }
}
