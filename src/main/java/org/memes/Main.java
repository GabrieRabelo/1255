package org.memes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int counter = Integer.parseInt(in.readLine());

        while (counter != 0) {
            var a = "string";

            System.out.printf("%s%n", a);
            counter--;
        }





    }
}