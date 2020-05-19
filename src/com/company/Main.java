package com.company;

public class Main {

    public static void main(String[] args) {
        String str = "London OKKO axaxaxa green";

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].endsWith(words[i].substring(0, 1))) {
                System.out.println(words[i]);
            }
        }
    }
}
