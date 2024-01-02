package org.aes.logger;

import java.util.ArrayList;
import java.util.List;

public class CustomLogger implements ILogger {
    List<String> msgList = new ArrayList<>();

    @Override
    public void addMsg(String msg) {
        msgList.add(msg);
    }

    @Override
    public List<String> getAllMsg() {
        return msgList;
    }
}
