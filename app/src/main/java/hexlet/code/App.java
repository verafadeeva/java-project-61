package hexlet.code;

import hexlet.code.game.*;
import hexlet.code.game.Sequence;

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
        System.out.println("4 - GCD");
        System.out.println("5 - Sequence");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String answer = scanner.next();
        switch (answer) {
            case ("1"):
                Engine.gameStart();
                break;
            case ("2"):
                gameCode = 2;
                Odd.chet();
                break;
            case ("3"):
                gameCode = 3;
                Calc.calc();
                break;
            case ("4"):
                gameCode = 4;
                Gcd.gcd();
                break;
            case ("5"):
                gameCode = 5;
                Sequence.sequence();
                break;
            case ("6"):
                gameCode = 6;
                Prime.prime();
                break;
            default:
                System.exit(0);
        }
        /* if (answer.equals("2")) {
            gameCode = 2;
            Odd.chet();
        } else if (answer.equals("3")) {
            gameCode = 3;
            Calc.calc();
        } else if (answer.equals("4")) {
            gameCode = 4;
            Gcd.gcd();
        } else if (answer.equals("5")) {
            gameCode = answer;
            Sequence.prograssion();
        } else if (answer.equals("6")) {
            gameCode = 6;
            Prime.prime();
        } else {
            System.exit(0);
        }*/
    }
}
