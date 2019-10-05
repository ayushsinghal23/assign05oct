package main;

import java.util.Scanner;

public class Main7 {
    private String input;
    private int weight = 0;

    public Main7(String input) {
        this.input = input;
    }

    public void modification() {
        for (int i = 0; i < input.length(); i++) {
            int a = input.charAt(i);
            System.out.print(a + "+");
            weight += a;
        }
        System.out.print("\b" + "=");
        System.out.print(weight);
    }
}

class weight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        Main7 obj1 = new Main7(input);
        obj1.modification();


    }
}