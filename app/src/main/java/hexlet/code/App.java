package hexlet.code;

import java.util.Scanner;

public class App {
    public static void BrainGames(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit.");
        System.out.print("Your choice: ");
        String s = scanner.next();
        if (s.equals("2")) {
            Odd.Chet();
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        BrainGames();
    }
}
