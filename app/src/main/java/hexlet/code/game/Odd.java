package hexlet.code.game;

import hexlet.code.App;
import hexlet.code.Engine;

import java.util.Random;

public class Odd {

    public static boolean gameChet() {
        Random random = new Random();
        int num = random.nextInt(20);
        if (num % 2 == 0) {
            Engine.setCorrectAnswer("yes");
        } else {
            Engine.setCorrectAnswer("no");
        }
        Engine.question(String.valueOf(num));
        return (Engine.getAnswer().equalsIgnoreCase(Engine.getCorrectAnswer()));
    }

    public static void chet() {
        Engine.gameStart();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.gameCore(App.getGameCode());
        Engine.epicWin();
    }
}

