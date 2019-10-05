package main;

import java.util.Scanner;

public class Main2 {
    private String input;
    private int startingIndex;
    private int endingIndex;


    public Main2(String input, int startingIndex, int endingIndex) {
        this.input = input;
        this.startingIndex = startingIndex;
        this.endingIndex = endingIndex;

    }

    public String getInput() {
        return input;
    }

    public int getEndingIndex() {
        return endingIndex;
    }

    public int getStartingIndex() {
        return startingIndex;
    }

    public void modification() {
        System.out.println(input.substring(startingIndex, endingIndex));
    }

}

class substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        int startingIndex = scanner.nextInt();
        int endingIndex = scanner.nextInt();
        Main2 obj1 = new Main2(input, startingIndex, endingIndex);
        obj1.modification();
    }
}