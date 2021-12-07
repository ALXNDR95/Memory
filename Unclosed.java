package Homework.Modul15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class Unclosed {

    public void readFile() throws IOException {
        StringBuilder strBuilder = new StringBuilder();
        URLConnection connection = new URL("https://www.oracle.com/ru/index.html").openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));

        while (true) {
            try {
                if (!(reader.readLine() != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            strBuilder.append(reader.readLine());
        }
    }

    public static void main(String[] args) throws IOException {
        Unclosed stream = new Unclosed();
        stream.readFile();
        System.out.println("Done with reading file");
    }
}
