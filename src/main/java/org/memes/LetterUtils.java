package org.memes;


public class LetterUtils {

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
