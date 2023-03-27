package hexlet.code;

import hexlet.code.game.Calc;
import hexlet.code.game.Odd;

import java.util.Scanner;

public class App {
    public static Scanner scanner;
    public static int gameCode;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String s = scanner.next();
        if (s.equals("2")) {
            gameCode = 2;
            Odd.chet();
        } else if (s.equals("3")) {
            gameCode = 3;
            Calc.calc();
        } else {
            return;
        }
    }
}
