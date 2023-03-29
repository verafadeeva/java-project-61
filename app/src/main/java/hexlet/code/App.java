package hexlet.code;

import hexlet.code.game.Sequence;
import hexlet.code.game.Prime;
import hexlet.code.game.Odd;
import hexlet.code.game.Calc;
import hexlet.code.game.Gcd;
import java.util.Scanner;

public class App {
    private static final String GAME_CODE_GREETING = "1";
    private static final String GAME_CODE_EVEN = "2";
    private static final String GAME_CODE_CALC = "3";
    private static final String GAME_CODE_GCD = "4";
    private static final String GAME_CODE_SEQUENCE = "5";
    private static final String GAME_CODE_PRIME = "6";

    private static Scanner scanner;
    private static int gameCode;

    public static Scanner getScanner() {
        return scanner;
    }
    public static int getGameCode() {
        return gameCode;
    }
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
            case (GAME_CODE_GREETING):
                Engine.gameStart();
                break;
            case (GAME_CODE_EVEN):
                gameCode = Integer.parseInt(GAME_CODE_EVEN);
                Odd.chet();
                break;
            case (GAME_CODE_CALC):
                gameCode = Integer.parseInt(GAME_CODE_CALC);
                Calc.calc();
                break;
            case (GAME_CODE_GCD):
                gameCode = Integer.parseInt(GAME_CODE_GCD);
                Gcd.gcd();
                break;
            case (GAME_CODE_SEQUENCE):
                gameCode = Integer.parseInt(GAME_CODE_SEQUENCE);
                Sequence.sequence();
                break;
            case (GAME_CODE_PRIME):
                gameCode = Integer.parseInt(GAME_CODE_PRIME);
                Prime.prime();
                break;
            default:
                System.exit(0);
        }
    }
}
