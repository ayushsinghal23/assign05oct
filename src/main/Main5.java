package main;

import java.util.Scanner;

public class Main5 {
    private String input;
    private String subString;
    private String subString1;

    public Main5(String input, String subString) {
        this.input = input;
        this.subString = subString;
    }

    public void modification() {
        if (input.contains(subString)) {
            subString1 = subString.replace(subString, input);
            input = input.replace(subString, subString1);
        }
        System.out.println(input);
    }
}


class replacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String subString = scanner.nextLine().trim();
        Main5 obj1 = new Main5(input, subString);
        scanner.close();
        obj1.modification();
    }
}
