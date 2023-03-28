package hexlet.code.game;

import hexlet.code.App;
import hexlet.code.Engine;
import org.apache.commons.math3.primes.Primes;
import java.util.Random;

public class Prime {

    public static boolean gamePrime() {
        Random random = new Random();
        int num = random.nextInt(100);
        if (Primes.isPrime(num)) {
            Engine.corrAnswer = "yes";
        } else {
            Engine.corrAnswer = "no";
        }
        Engine.question(String.valueOf(num));
        return (Engine.answer.equalsIgnoreCase(Engine.corrAnswer));
    }

    public static void prime() {
        Engine.gameStart();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.gameCore(App.gameCode);
        Engine.epicWin();
    }

}
