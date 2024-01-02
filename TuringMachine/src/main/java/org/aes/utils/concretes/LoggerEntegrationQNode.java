package org.aes.utils.concretes;

import org.aes.logger.ILogger;
import org.aes.turingmachine.qnode.QNode;
import org.aes.utils.abstracts.ReadableFormatTape;

import java.util.List;

public class LoggerEntegrationQNode {
    public static void setLogger(List<QNode> list, ILogger logger) {
        list.forEach(e -> {
            e.setiLogger(logger);
        });

    }
}
