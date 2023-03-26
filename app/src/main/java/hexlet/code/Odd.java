package hexlet.code;


import java.util.Scanner;
import java.util.Random;

public class Odd {
    public static void Chet(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + '!');
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int count = 0;
        for (int i=0; i<3; i++) {
            int num = random.nextInt(100);
            System.out.println("Question: " + num);
            System.out.print("Your answer: ");
            String s = scanner.next();
            if (num % 2 == 0) {
                if (s.toLowerCase().equals("yes")) {
                    System.out.println("Correct!");
                    count++;
                } else {
                    System.out.println( s + " is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + name + "!");
                    //break;
                   // App.BrainGames();
                }
            } else {
                if (s.toLowerCase().equals("no")) {
                    System.out.println("Correct!");
                    count++;
                } else {
                    System.out.println( s + " is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + name + "!");
                    //break;
                   // App.BrainGames();
                }
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }

}
