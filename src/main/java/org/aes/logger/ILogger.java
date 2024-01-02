package org.aes.logger;

import java.util.List;

public interface ILogger {
    void addMsg(String msg);

    List<String> getAllMsg();

}
