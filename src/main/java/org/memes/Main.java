package org.memes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        var letterUtils = new LetterUtils();

        int counter = Integer.parseInt(in.readLine());

        while (counter != 0) {
            letterUtils.readNext(in.readLine());

            System.out.printf("%s%n", letterUtils.getMostFrequent());
            counter--;
        }
    }

    public static class LetterUtils {

        private int[] charactersCount;
        private String actual;

        public LetterUtils() {
            // used for object creation
        }

        public void readNext(String string){
            this.actual = string.toLowerCase();
            charactersCount = new int[26];
        }

        public String getMostFrequent() {

            var b = actual.toCharArray();
            for (char c : b) {
                if(c < 97 || c > 122) continue;
                var value = c - 97;
                charactersCount[value]++;
            }

            var mostOccurredCount = 0;

            for (int j : charactersCount) {
                if (j > mostOccurredCount) {
                    mostOccurredCount = j;
                }
            }

            StringBuilder result = new StringBuilder();

            for (int i = 0; i< charactersCount.length; i++) {
                if(charactersCount[i] == mostOccurredCount) {
                    result.append((char)(i + 97));
                }
            }

            return result.toString();
        }
    }
}