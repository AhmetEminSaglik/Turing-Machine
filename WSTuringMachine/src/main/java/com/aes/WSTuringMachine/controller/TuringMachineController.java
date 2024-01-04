package com.aes.WSTuringMachine.controller;

import com.aes.WSTuringMachine.utils.Utils;
import org.aes.turingmachine.examples.*;
import org.aes.turingmachine.exception.QNodeException;
import org.aes.utils.abstracts.ReadableFormatTape;
import org.aes.utils.concretes.HTMLReadableFormatForTape;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/turing-machine")
public class TuringMachineController {
    private final ReadableFormatTape formatTape = new HTMLReadableFormatForTape();
    static Random random = new Random();


    @GetMapping("/e1")
    public String getExample1() {
        TuringMachine_Example_1__n__2n_Output example = null;// new TuringMachine_Example_1__n__2n_Output(formatTape,3);
        try {
            example = new TuringMachine_Example_1__n__2n_Output(formatTape, random.nextInt(5) + 1);
        } catch (QNodeException e) {
            return "Error occured : " + e.getMessage();
        }
        return Utils.getFunctionSymbol("f(n)=2n") + Utils.getMsgFromLogger(example.iLogger);
    }

    static int maxIntergetInput = 15;

    @GetMapping("/e1/{val}")
    public String getExample1Test(@PathVariable int val) {
        if (val >= maxIntergetInput) {
            return "Lütfen servere zarar vermeden usulca testimizi yapıyoruz. " + maxIntergetInput + "'den küçük pozitif tam sayılar giriyoruz.  ";
        }
        if (val < 1) {
            return maxIntergetInput + "'den küçük pozitif tam sayılar girerek testinizi gerçekleştirebilirsiniz";
        }

        TuringMachine_Example_1__n__2n_Output example = null;// new TuringMachine_Example_1__n__2n_Output(formatTape,3);
        try {
            example = new TuringMachine_Example_1__n__2n_Output(formatTape, val);
        } catch (QNodeException e) {
            return "Error occured : " + e.getMessage();
        }
        return /*"(URL sonundaki sayi guncelleyerek kendiniz test edebilirsiniz)\n"*/ Utils.getFunctionSymbol("f(n)=2n") + Utils.getMsgFromLogger(example.iLogger);
    }

    @GetMapping("/e2")
    public String getExample2() {
        TuringMachine_Example_2__n__n_Plus_2_Output example = null;// new TuringMachine_Example_1__n__2n_Output(formatTape,3);
        try {
            int size = random.nextInt(3) + 1;
//            int size = 3;
//            example = new TuringMachine_Example_2__n__n_Plus_2_Output(formatTape, size, size + random.nextInt(3));
            example = new TuringMachine_Example_2__n__n_Plus_2_Output(formatTape, size, size + 2);
        } catch (Exception e) {
//            System.out.println("==e>> "+e.getCause());
            return "Error occured : \n" + Utils.getMsgFromLogger(example.iLogger);
        }
        return Utils.getFunctionSymbol("f(n)=n+2") + Utils.getMsgFromLogger(example.iLogger);
    }

    @GetMapping("/e2/{valA}/{valB}")
    public String getExample2Test(@PathVariable int valA, @PathVariable int valB) {
        if (valA >= maxIntergetInput || valB >= maxIntergetInput) {
            return "Lütfen servere zarar vermeden usulca testimizi yapıyoruz. " + maxIntergetInput + "'den küçük pozitif tam sayılar giriyoruz.  ";
        }
        if (valA < 1 || valB < 1) {
            return maxIntergetInput + "'den küçük pozitif tam sayılar girerek testinizi gerçekleştirebilirsiniz";
        }

        TuringMachine_Example_2__n__n_Plus_2_Output example = null;// new TuringMachine_Example_1__n__2n_Output(formatTape,3);
        try {
            example = new TuringMachine_Example_2__n__n_Plus_2_Output(formatTape, valA, valB);
        } catch (Exception e) {
            return "Error occured : " + e.getMessage();
        }
        return /*"(URL sonundaki sayi guncelleyerek kendiniz test edebilirsiniz)\n"*/ Utils.getFunctionSymbol("f(n)=2n") + Utils.getMsgFromLogger(example.iLogger);
    }


    @GetMapping("/e3")
    public String getExample3() {
        TuringMachine_Example_3__First_Last_Different_Values_Exchange_Output example = null;// new TuringMachine_Example_1__n__2n_Output(formatTape,3);
        try {
            int size = random.nextInt(3) + 1;
            example = new TuringMachine_Example_3__First_Last_Different_Values_Exchange_Output(
                    formatTape,
                    random.nextInt(2),
                    random.nextInt(5) + 1,
                    random.nextInt(2)
            );
        } catch (Exception e) {
//            System.out.println("==e>> "+e.getCause());
            return "Error occured : \n" + Utils.getMsgFromLogger(example.iLogger);
        }
        return Utils.getFunctionSymbol("(Random Data) İlk ve son değeri zıt ise yerlerini değiştir. Diğer değerler sabit kalsın.") + Utils.getMsgFromLogger(example.iLogger);
    }


    @GetMapping("/e3/{text}")
    public String getExample3Test(@PathVariable String text) {

        if (!text.matches("[01]+")) {
            return "Sadece 0 ve 1 degerlerini metin olarak girebilirsiniz. Orneğin 10010. Lütfen tekrar deneyiniz";
        }
        TuringMachine_Example_3__First_Last_Different_Values_Exchange_Output example = null;// new TuringMachine_Example_1__n__2n_Output(formatTape,3);
        try {
            example = new TuringMachine_Example_3__First_Last_Different_Values_Exchange_Output(
                    formatTape,
                    text
//                    random.nextInt(2),
//                    random.nextInt(5) + 1,
//                    random.nextInt(2)
            );
        } catch (Exception e) {
//            System.out.println("==e>> "+e.getCause());
            return "Error occured : \n" + Utils.getMsgFromLogger(example.iLogger);
        }
        return Utils.getFunctionSymbol("(Random Data) İlk ve son değeri zıt ise yerlerini değiştir. Diğer değerler sabit kalsın.") + Utils.getMsgFromLogger(example.iLogger);
    }


    @GetMapping("/e4")
    public String getExample4() {
        TuringMachine_Example_4__a_b_b_a__b_Equals_a_or_equalsAndlower_2a_Output example = null;// new TuringMachine_Example_1__n__2n_Output(formatTape,3);
        try {
            int size = random.nextInt(3) + 1;
            example = new TuringMachine_Example_4__a_b_b_a__b_Equals_a_or_equalsAndlower_2a_Output(
                    formatTape,
                    2, 3, 2, 2
            );
        } catch (Exception e) {
//            System.out.println("==e>> "+e.getCause());
            return "Error occured : \n" + Utils.getMsgFromLogger(example.iLogger);
        }
        return Utils.getFunctionSymbol(" a^(n)b^(m)b^(p)a^(q) | n>=1, n<=b<=2n; | q>=1, p<=q<=2q. b'ler alarin kendisine veya 2 katina veya arasindaki degerlere esit olmali.") + Utils.getMsgFromLogger(example.iLogger);
    }

    @GetMapping("/e4/{text}")
    public String getExample4Test(@PathVariable String text) {
        TuringMachine_Example_4__a_b_b_a__b_Equals_a_or_equalsAndlower_2a_Output example = null;// new TuringMachine_Example_1__n__2n_Output(formatTape,3);
        try {
            int size = random.nextInt(3) + 1;
            example = new TuringMachine_Example_4__a_b_b_a__b_Equals_a_or_equalsAndlower_2a_Output(
                    formatTape,
                    text
            );
        } catch (Exception e) {
//            System.out.println("==e>> "+e.getCause());
            return "Error occured : \n" + Utils.getMsgFromLogger(example.iLogger);
        }
        /*" a^(n)b^(m)b^(p)a^(q) | n>=1, n<=b<=2n; | q>=1, p<=q<=2q.*/
        return Utils.getFunctionSymbol("b'ler alarin kendisine veya 2 katina veya arasindaki degerlere esit olmali.") + Utils.getMsgFromLogger(example.iLogger);
    }


    @GetMapping("/e5")
    public String getExample5() {
        TuringMachine_Example_5__abs__a_minus_b__Output example = null;// new TuringMachine_Example_1__n__2n_Output(formatTape,3);
        try {
            example = new TuringMachine_Example_5__abs__a_minus_b__Output(
                    formatTape,
                    random.nextInt(3) + 1, random.nextInt(3) + 1);
        } catch (Exception e) {
            return "Error occured : \n" + Utils.getMsgFromLogger(example.iLogger);
        }
        return Utils.getFunctionSymbol("f(n,m) = |n-m|") + Utils.getMsgFromLogger(example.iLogger);
    }


    @GetMapping("/e5/{text}")
    public String getExample5Test(@PathVariable String text) {
        if (!text.matches("[ab]+")) {
            return "Sadece a ve b degerlerini metin olarak girebilirsiniz. Orneğin abb. Lütfen tekrar deneyiniz";
        }
        TuringMachine_Example_5__abs__a_minus_b__Output example = null;// new TuringMachine_Example_1__n__2n_Output(formatTape,3);
        try {
            example = new TuringMachine_Example_5__abs__a_minus_b__Output(
                    formatTape, text);
        } catch (Exception e) {
            return "Error occured : \n" + Utils.getMsgFromLogger(example.iLogger);
        }
        return Utils.getFunctionSymbol("f(n,m) = |n-m|") + Utils.getMsgFromLogger(example.iLogger);
    }


    @GetMapping("/e6")
    public String getExample6() {
        TuringMachine_Example_6_EXAM__3a_minus_2b__Output example = null;// new TuringMachine_Example_1__n__2n_Output(formatTape,3);
        try {
            example = new TuringMachine_Example_6_EXAM__3a_minus_2b__Output(
                    formatTape,
                    "aab");
//                    random.nextInt(3) + 1, random.nextInt(3) + 1);
        } catch (Exception e) {
            return "Error occured : \n" + Utils.getMsgFromLogger(example.iLogger);
        }
        return Utils.getFunctionSymbol("f(n,m) = |n-m|") + Utils.getMsgFromLogger(example.iLogger);
    }


    @GetMapping("/e6/{text}")
    public String getExample6Test(@PathVariable String text) {
        if (!text.matches("[ab]+")) {
            return "Sadece a ve b degerlerini metin olarak girebilirsiniz. Orneğin aab. Lütfen tekrar deneyiniz";
        }
        TuringMachine_Example_6_EXAM__3a_minus_2b__Output example = null;// new TuringMachine_Example_1__n__2n_Output(formatTape,3);
        try {
            example = new TuringMachine_Example_6_EXAM__3a_minus_2b__Output(
                    formatTape, text);
        } catch (Exception e) {
            return "Error occured : \n" + Utils.getMsgFromLogger(example.iLogger);
        }
        return Utils.getFunctionSymbol("f(n,m) = 3m-2n ; m > n > 0") + Utils.getMsgFromLogger(example.iLogger);
    }


}
