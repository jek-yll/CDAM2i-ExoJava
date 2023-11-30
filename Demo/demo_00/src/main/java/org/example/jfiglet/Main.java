package org.example.jfiglet;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String asciiart = FigletFont.convertOneLine("Hello World");
        System.out.println(asciiart);




    }
}
