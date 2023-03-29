package hexlet.code.game;

import hexlet.code.App;
import hexlet.code.Engine;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Random;

public class Sequence {

    public static boolean gameSequence() {
        Random random = new Random();
        int seed = random.nextInt(8) + 1;
        int[] sequence = new int[10];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = i * seed;
        }
        int hiddenElem = random.nextInt(10);
        Engine.setCorrectAnswer(String.valueOf(sequence[hiddenElem]));
        String s = "";
        for (int i = 0; i < sequence.length; i++) {
            if (i == hiddenElem) {
                s = s.concat("..").concat(" ");
            } else {
                s = s.concat(String.valueOf(sequence[i])).concat(" ");
            }
        }
        Engine.question(s);
        if ((!NumberUtils.isCreatable(Engine.getAnswer())) && (Engine.getAnswer() != null)) {
            return false;
        }
        if (Integer.parseInt(Engine.getAnswer()) != Integer.parseInt(Engine.getCorrectAnswer())) {
            return false;
        }
        return true;
    }
    public static void sequence() {
        Engine.gameStart();
        System.out.println("What number is missing in the progression?");
        Engine.gameCore(App.getGameCode());
        Engine.epicWin();
    }
}
