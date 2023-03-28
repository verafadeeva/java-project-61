package hexlet.code.game;

import hexlet.code.App;
import hexlet.code.Engine;

import java.util.Random;

public class Odd {

    public static boolean gameChet() {
        Random random = new Random();
        int randomSeed = 20; //random seed
        int num = random.nextInt(randomSeed);
        if (num % 2 == 0) {
            Engine.corrAnswer = "yes";
        } else {
            Engine.corrAnswer = "no";
        }
        Engine.question(String.valueOf(num));
        return ((num % 2 == 0) & (Engine.answer.equalsIgnoreCase("yes")))
                || ((num % 2 != 0) & (Engine.answer.equalsIgnoreCase("no")));
    }

    public static void chet() {
        Engine.gameStart();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.gameCore(App.getGameCode());
        Engine.epicWin();
    }
}

