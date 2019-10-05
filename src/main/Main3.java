package main;

import java.util.Scanner;

public class Main3 {
    private String input;

    public Main3(String input) {
        this.input = input;

    }

    public String getInput() {
        return input;
    }

    public void modification() {
        for (int i = 0; i < getInput().length(); i++) {
            if (getInput().charAt(i) == 'a' || getInput().charAt(i) == 'e' || getInput().charAt(i) == 'i' ||
                    getInput().charAt(i) == 'o' || getInput().charAt(i) == 'u') {
                input = getInput().replace(getInput().charAt(i), '*');

            }
        }
        System.out.println(input);
    }
}

class replace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        Main3 obj1 = new Main3(input);
        obj1.modification();
    }
}