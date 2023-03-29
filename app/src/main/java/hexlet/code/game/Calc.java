package hexlet.code.game;

import hexlet.code.App;
import hexlet.code.Engine;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Random;

public class Calc {

    public static boolean gameCalc() {
        Random random = new Random();
        int a = random.nextInt(20);
        int b = random.nextInt(20);
        int operand = random.nextInt(3);
        switch (operand) {
            case (0):
                Engine.setCorrectAnswer(String.valueOf(a + b));
                Engine.question(String.valueOf(a) + " + " + String.valueOf(b));
                if ((!NumberUtils.isCreatable(Engine.getAnswer())) && (Engine.getAnswer() != null)) {
                    return false;
                }
                if (Integer.parseInt(Engine.getAnswer()) != Integer.parseInt(Engine.getCorrectAnswer())) {
                    return false;
                }
                break;
            case (1):
                Engine.setCorrectAnswer(String.valueOf(a - b));
                Engine.question(String.valueOf(a) + " - " + String.valueOf(b));
                if ((!NumberUtils.isCreatable(Engine.getAnswer())) && (Engine.getAnswer() != null)) {
                    return false;
                }
                if (Integer.parseInt(Engine.getAnswer()) != Integer.parseInt(Engine.getCorrectAnswer())) {
                    return false;
                }
                break;
            case (2):
                Engine.setCorrectAnswer(String.valueOf(a * b));
                Engine.question(String.valueOf(a) + " * " + String.valueOf(b));
                if ((!NumberUtils.isCreatable(Engine.getAnswer())) && (Engine.getAnswer() != null)) {
                    return false;
                }
                if (Integer.parseInt(Engine.getAnswer()) != Integer.parseInt(Engine.getCorrectAnswer())) {
                    return false;
                }
                break;
            default:
                break;
        }
        return true;
    }

    public static void calc() {
        Engine.gameStart();
        System.out.println("What is the result of the expression?");
        Engine.gameCore(App.getGameCode());
        Engine.epicWin();
    }
}
