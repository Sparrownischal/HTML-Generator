package com.ReactComponents;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main (String[] args) throws IOException {
        LabelClass htmlTag = new LabelClass();

        FileWriter html = new FileWriter("index.html");
        html.write("hello check lets see whats going on");  
        html.write(htmlTag.html());
        html.close();
        System.out.println("Successfully created HTML file");
    }
}