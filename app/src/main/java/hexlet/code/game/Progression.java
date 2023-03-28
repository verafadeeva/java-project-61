package hexlet.code.game;

import hexlet.code.App;
import hexlet.code.Engine;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Random;

public class Progression {

    public static boolean gameProgression() {
        Random random = new Random();
        int seed = random.nextInt(8) + 1;
        int[] posled = new int[10];
        for (int i = 0; i < posled.length; i++) {
            posled[i] = i * seed;
        }
        int hiddenElem = random.nextInt(10);
        Engine.corrAnswer = String.valueOf(posled[hiddenElem]);
        String s = "";
        for (int i = 0; i < posled.length; i++) {
            if (i == hiddenElem) {
                s = s.concat("..").concat(" ");
            } else {
                s = s.concat(String.valueOf(posled[i])).concat(" ");
            }
        }
        Engine.question(s);
        if ((!NumberUtils.isCreatable(Engine.answer)) && (Engine.answer != null)) {
            return false;
        }
        if (Integer.parseInt(Engine.answer) != Integer.parseInt(Engine.corrAnswer)) {
            return false;
        }
        return true;
    }
    public static void prograssion() {
        Engine.gameStart();
        System.out.println("What number is missing in the progression?");
        Engine.gameCore(App.gameCode);
        Engine.epicWin();
    }
}
