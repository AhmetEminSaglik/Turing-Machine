package org.aes.logger;

import java.util.ArrayList;
import java.util.List;

public class CustomLogger implements ILogger {
    List<String> msgList = new ArrayList<>();
    boolean logginPermision = true;

    @Override
    public void addMsg(String msg) {
        if (logginPermision) {
            msgList.add(msg);
        }
    }

    @Override
    public List<String> getAllMsg() {
        return msgList;
    }

    @Override
    public void enableLogging() {
        logginPermision = true;

    }

    @Override
    public void disableLogging() {
        logginPermision = false;
    }
}
