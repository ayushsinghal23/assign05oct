package main;

import java.util.Scanner;

public class Main10 {
    private String input;
    private char word;

    public Main10(String input, char word) {
        this.input = input;
        this.word = word;
    }

    public void modification() {


        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == word) {
                System.out.println(i);
                break;
            }
        }
    }
}

class index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        char word = scanner.next().charAt(0);
        Main10 obj1 = new Main10(input, word);
        scanner.close();
        obj1.modification();
    }
}
