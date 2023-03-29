package hexlet.code.game;

import hexlet.code.App;
import hexlet.code.Engine;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Random;

public class Gcd {

    public static int nod(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static boolean gameGcd() {
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        Engine.setCorrectAnswer(String.valueOf(nod(a, b)));
        Engine.question(String.valueOf(a) + " " + String.valueOf(b));
        if ((!NumberUtils.isCreatable(Engine.getAnswer())) && (Engine.getAnswer() != null)) {
            return false;
        }
        if (Integer.parseInt(Engine.getAnswer()) != Integer.parseInt(Engine.getCorrectAnswer())) {
            return false;
        }
        return true;
    }

    public static void gcd() {
        Engine.gameStart();
        System.out.println("Find the greatest common divisor of given numbers.");
        Engine.gameCore(App.getGameCode());
        Engine.epicWin();
    }
}
