package hexlet.code;

import hexlet.code.game.Sequence;
import hexlet.code.game.Prime;
import hexlet.code.game.Odd;
import hexlet.code.game.Calc;
import hexlet.code.game.Gcd;

public class Engine {
    public static String username;
    public static String answer;
    public static String corrAnswer;
    public static void gameStart() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        username = App.scanner.next();
        System.out.println("Hello, " + username + '!');
    }

    public static void gameCore(int gameCode) {
        for (int i = 0; i < 3; i++) {
            if ((gameCode == 2) && (!Odd.gameChet())) {
                wrongAnswer(answer, corrAnswer);
                System.exit(0);
            }
            if ((gameCode == 3) && (!Calc.gameCalc())) {
                wrongAnswer(answer, corrAnswer);
                System.exit(0);
            }
            if ((gameCode == 4) && (!Gcd.gameGcd())) {
                wrongAnswer(answer, corrAnswer);
                System.exit(0);
            }
            if ((gameCode == 5) && (!Sequence.gameSequence())) {
                wrongAnswer(answer, corrAnswer);
                System.exit(0);
            }
            if ((gameCode == 6) && (!Prime.gamePrime())) {
                wrongAnswer(answer, corrAnswer);
                System.exit(0);
            }
            System.out.println("Correct!");
        }
    }
    public static void question(String quest) {
        System.out.println("Question: " + quest);
        System.out.print("Your answer: ");
        answer = App.scanner.next();
    }
    public static void wrongAnswer(String usAnswer, String usCorrAnswer) {
        System.out.println(usAnswer + " is wrong answer ;(. Correct answer was " + usCorrAnswer + ".");
        System.out.println("Let's try again, " + Engine.username + "!");
    }

    public static void epicWin() {
        System.out.println("Congratulations, " + Engine.username + "!");
    }
}
