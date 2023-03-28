package hexlet.code.game;

import hexlet.code.App;
import hexlet.code.Engine;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.Random;

public class Gcd {

    public static int nod(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static boolean gameGcd() {
        Random random = new Random();
        int randomSeed = 20; //random seed
        int a = random.nextInt(randomSeed);
        int b = random.nextInt(randomSeed);
        Engine.corrAnswer = String.valueOf(nod(a, b));
        Engine.question(String.valueOf(a) + " " + String.valueOf(b));
        if ((!NumberUtils.isCreatable(Engine.answer)) && (Engine.answer != null)) {
            return false;
        }
        if (Integer.parseInt(Engine.answer) != Integer.parseInt(Engine.corrAnswer)) {
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
