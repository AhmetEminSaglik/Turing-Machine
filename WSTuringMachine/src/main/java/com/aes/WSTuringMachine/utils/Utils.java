package com.aes.WSTuringMachine.utils;

import org.aes.logger.ILogger;

import java.util.List;

public class Utils {
    public static String getMsgFromLogger(ILogger iLogger) {
        StringBuilder sb = new StringBuilder();
        List<String> list = iLogger.getAllMsg();
        int mod = 2;
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("<br>");
            if (i % (mod + 1) == 0) {
                sb.append("<hr>");

            }
        }
        return sb.toString();
    }

    public static String getFunctionSymbol(String functionSymbol) {
        return "Fonksiyon : " + functionSymbol + "<hr>\n";
    }
}
