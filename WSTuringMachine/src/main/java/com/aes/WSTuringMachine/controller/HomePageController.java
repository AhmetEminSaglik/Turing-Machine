package com.aes.WSTuringMachine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomePageController {

    @GetMapping()
    public String getUrlList() {
        return getAllUrlList();
    }

    private String getAllUrlList() {
        StringBuilder sbUrl = new StringBuilder();
        sbUrl.append("<ul>");

        sbUrl.append(getHTMLInnerList("Örnek 1 : f(n)=2n", "http://localhost:8080/turing-machine/e1"));
        sbUrl.append(getHTMLInnerList("Test  1  : f(n)=2n (URL/3)", "http://localhost:8080/turing-machine/e1/3"));
        sbUrl.append("<br>");
        sbUrl.append(getHTMLInnerList("Örnek 2 : f(n)=n+2", "http://localhost:8080/turing-machine/e2"));
        sbUrl.append(getHTMLInnerList("Test  2 : f(n)=n+2 (URL/2/4)", "http://localhost:8080/turing-machine/e2/2/4"));
        sbUrl.append("<br>");
        sbUrl.append(getHTMLInnerList("Örnek 3 : İlk ve son değeri zıt ise yerlerini değiştir. Diğer değerler sabit kalsın", "http://localhost:8080/turing-machine/e3"));
        sbUrl.append(getHTMLInnerList("Test  3 : İlk ve son değeri zıt ise yerlerini değiştir. Diğer değerler sabit kalsın (URL)", "http://localhost:8080/turing-machine/e3/10"));
        sbUrl.append("<br>");
        sbUrl.append(getHTMLInnerList("Örnek 4 : abba b'ler a'larin 2 kati veya kendisine veya aralığına esit.", "http://localhost:8080/turing-machine/e4"));
        sbUrl.append(getHTMLInnerList("Test  4 : abba b'ler a'larin 2 kati veya kendisine veya aralığına esit.", "http://localhost:8080/turing-machine/e4/abbba"));
        sbUrl.append("<br>");
        sbUrl.append(getHTMLInnerList("Örnek 5 : f(n,m) = |n-m|.", "http://localhost:8080/turing-machine/e5"));
        sbUrl.append(getHTMLInnerList("Test  5 : f(n,m) = |n-m|.", "http://localhost:8080/turing-machine/e5/aab"));
        sbUrl.append("<br>");
        sbUrl.append(getHTMLInnerList("Örnek 6 : f(n,m) = 3m-2n ; m > n > 0", "http://localhost:8080/turing-machine/e6"));
        sbUrl.append(getHTMLInnerList("Test  6 : f(n,m) = 3m-2n ; m > n > 0", "http://localhost:8080/turing-machine/e6/aab"));
        sbUrl.append("</br>");
        sbUrl.append(getHTMLInnerList("Örnek 7 : f(n) = n^2", "http://localhost:8080/turing-machine/e7"));
        sbUrl.append(getHTMLInnerList("Test  7 : f(n) = n^2", "http://localhost:8080/turing-machine/e7/aaa"));
        sbUrl.append("</ul>");
        return sbUrl.toString();
    }

    private String getHTMLInnerList(String name, String url) {
        return "<li><a href=" + url + ">" + name + "</a></li>";
    }

}
