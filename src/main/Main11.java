package main;

import java.util.Scanner;

public class Main11 {
    private String input;
    private char word;

    public Main11(String input, char word) {
        this.input = input;
        this.word = word;
    }

    public void modification() {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == word) {
                System.out.println(i);
            }
        }
    }
}

class allIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        char word = scanner.next().charAt(0);
        Main11 obj1 = new Main11(input, word);
        scanner.close();
        obj1.modification();
    }
}

