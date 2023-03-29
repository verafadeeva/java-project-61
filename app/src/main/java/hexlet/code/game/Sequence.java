package hexlet.code.game;

import hexlet.code.App;
import hexlet.code.Engine;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Random;

public class Sequence {
    private static final int SEQUENCE_RANDOM_SEED = 8;
    private static final int SEQUENCE_LENGTH = 10;
    public static boolean gameSequence() {
        Random random = new Random();
        int seed = random.nextInt(SEQUENCE_RANDOM_SEED) + 1;
        int[] sequence = new int[SEQUENCE_LENGTH];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = i * seed;
        }
        int hiddenElem = random.nextInt(SEQUENCE_LENGTH);
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
