package hexlet.code;

import hexlet.code.game.Sequence;
import hexlet.code.game.Prime;
import hexlet.code.game.Odd;
import hexlet.code.game.Calc;
import hexlet.code.game.Gcd;

public class Engine {
    private static final String GAME_CODE_EVEN = "2";
    private static final String GAME_CODE_CALC = "3";
    private static final String GAME_CODE_GCD = "4";
    private static final String GAME_CODE_SEQUENCE = "5";
    private static final String GAME_CODE_PRIME = "6";
    private static final int NUMBER_OF_ROUNDS = 3;
    private static String userName;
    private static String answer;
    private static String correctAnswer;

    public static String getCorrectAnswer() {
        return correctAnswer;
    }

    public static void setCorrectAnswer(String newCorrectAnswer) {
        correctAnswer = newCorrectAnswer;
    }
    public static String getAnswer() {
        return answer;
    }

    public static void setAnswer(String userAnswer) {
        answer = userAnswer;
    }
    public static String getUserName() {
        return userName;
    }
    public static void setUserName(String newUserName) {
        userName = newUserName;
    }
    public static void gameStart() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        setUserName(App.getScanner().next());
        System.out.println("Hello, " + getUserName() + '!');
    }

    public static void gameCore(int gameCode) {
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            if ((gameCode == Integer.parseInt(GAME_CODE_EVEN)) && (!Odd.gameChet())) {
                wrongAnswer(answer, correctAnswer);
                System.exit(0);
            }
            if ((gameCode == Integer.parseInt(GAME_CODE_CALC)) && (!Calc.gameCalc())) {
                wrongAnswer(answer, correctAnswer);
                System.exit(0);
            }
            if ((gameCode == Integer.parseInt(GAME_CODE_GCD)) && (!Gcd.gameGcd())) {
                wrongAnswer(answer, correctAnswer);
                System.exit(0);
            }
            if ((gameCode == Integer.parseInt(GAME_CODE_SEQUENCE)) && (!Sequence.gameSequence())) {
                wrongAnswer(answer, correctAnswer);
                System.exit(0);
            }
            if ((gameCode == Integer.parseInt(GAME_CODE_PRIME)) && (!Prime.gamePrime())) {
                wrongAnswer(answer, correctAnswer);
                System.exit(0);
            }
            System.out.println("Correct!");
        }
    }
    public static void question(String quest) {
        System.out.println("Question: " + quest);
        System.out.print("Your answer: ");
        answer = App.getScanner().next();
    }
    public static void wrongAnswer(String usAnswer, String usCorrAnswer) {
        System.out.println(usAnswer + " is wrong answer ;(. Correct answer was " + usCorrAnswer + ".");
        System.out.println("Let's try again, " + getUserName() + "!");
    }

    public static void epicWin() {
        System.out.println("Congratulations, " + getUserName() + "!");
    }
}
