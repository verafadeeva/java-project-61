package hexlet.code;

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
                Engine.corrAnswer = String.valueOf(a + b);
                Engine.question(String.valueOf(a) + " + " + String.valueOf(b));
                if ((!NumberUtils.isCreatable(Engine.answer)) && (Engine.answer != null)) {
                    return false;
                }
                if (Integer.parseInt(Engine.answer) != Integer.parseInt(Engine.corrAnswer)) {
                    return false;
                }
                break;
            case (1):
                Engine.corrAnswer = String.valueOf(a - b);
                Engine.question(String.valueOf(a) + " - " + String.valueOf(b));
                if ((!NumberUtils.isCreatable(Engine.answer)) && (Engine.answer != null)) {
                    return false;
                }
                if (Integer.parseInt(Engine.answer) != Integer.parseInt(Engine.corrAnswer)) {
                    return false;
                }
                break;
            case (2):
                Engine.corrAnswer = String.valueOf(a * b);
                Engine.question(String.valueOf(a) + " * " + String.valueOf(b));
                if ((!NumberUtils.isCreatable(Engine.answer)) && (Engine.answer != null)) {
                    return false;
                }
                if (Integer.parseInt(Engine.answer) != Integer.parseInt(Engine.corrAnswer)) {
                    return false;
                }
                break;
            default:
                //return false;
                break;
        }
        return true;
    }

    public static void calc() {
        Engine.gameStart();
        System.out.println("What is the result of the expression?");
        Engine.gameCore(App.gameCode);
        Engine.epicWin();
    }
}
