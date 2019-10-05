package main;

import java.util.Scanner;

public class Main4 {
    private String input;
    private int c = 0;


    public Main4(String input) {
        this.input = input;
    }


    public void modification() {

        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') && (c % 3 == 0)) {
                input = input.replace(input.charAt(i), '*');
            } else if ((input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') && (c % 3 == 1)) {
                input = input.replace(input.charAt(i), '^');
            } else if ((input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') && (c % 3 == 2)) {
                input = input.replace(input.charAt(i), '!');
            }
            c++;
        }
        System.out.println(input);
    }
}

class changes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        Main4 obj1 = new Main4(input);
        obj1.modification();
    }
}