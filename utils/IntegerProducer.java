package utils;
import java.util.Scanner;

public class IntegerProducer {

    public static int getIntInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println(prompt);
            try{
                number = Integer.parseInt(scanner.nextLine());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Insatta siffran inte ett heltal, vänligen försök på nytt");
            }
        }
        return number;
    }
}

