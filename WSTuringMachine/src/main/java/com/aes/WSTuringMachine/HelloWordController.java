package com.aes.WSTuringMachine;

import org.aes.logger.ILogger;
import org.aes.turingmachine.examples.TuringMachine_Example_1__n__2n_Output;
import org.aes.turingmachine.exception.QNodeException;
import org.aes.utils.abstracts.ReadableFormatTape;
import org.aes.utils.concretes.HTMLReadableFormatForTape;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class HelloWordController {
    ReadableFormatTape formatTape = new HTMLReadableFormatForTape();

    @GetMapping
    public String getHelloWord() {
        TuringMachine_Example_1__n__2n_Output example = null;// new TuringMachine_Example_1__n__2n_Output(formatTape,3);
        try {
            example = new TuringMachine_Example_1__n__2n_Output(formatTape, 3);
        } catch (QNodeException e) {
            return "Error occured : " + e.getMessage();
            //throw new RuntimeException(e);
        }

        return getMsgFromLogger(example.iLogger);
    }

    private String getMsgFromLogger(ILogger iLogger) {
        StringBuilder sb = new StringBuilder();
        List<String> list = iLogger.getAllMsg();
        int mod=2;
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("<br>");
            if(i%(mod+1)==0){
            sb.append("<hr>");

            }
        }
        return sb.toString();
    }
}
