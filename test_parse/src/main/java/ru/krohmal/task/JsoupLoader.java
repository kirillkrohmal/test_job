package ru.krohmal.task;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;


import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Comp on 15.11.2017.
 */
public class JsoupLoader {
    static String html = "https://ru.wikipedia.org/wiki/Пляжный_теннис";

    public static void main(String[] args) {
        String result = null;

        Document document = null;
        try {
            document = getDocum();
            Elements elements = document.getAllElements();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Document getDocum() throws IOException {
        return Jsoup.parse(new File(html), "UTF-8");
    }

    //Document doc = Jsoup.connect(

    public String getHtml(List<Articles> list) {
        String result = null;

        Document document = null;
        try {
            document = getDocum();
            Elements elements = document.getAllElements();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
}
