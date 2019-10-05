package main;
import java.util.Scanner;

public class Main1 {
    private String input;

    public Main1(String input) {
        this.input = input;

    }

    public String getInput() {
        return input;
    }

    public void modification() {
        System.out.print("Index: ");
        for (int i = 0; i < getInput().length(); i++) {
            System.out.print(i + "\t");
        }
        System.out.print("\n");
        System.out.print("Chars: ");
        for (int i = 0; i < getInput().length(); i++) {
            System.out.print(getInput().charAt(i) + "\t");


        }
    }
}

class modify {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        //  String input = scanner.nextLine().trim();
        Main1 obj1 = new Main1("Hello");
        obj1.modification();
    }
}