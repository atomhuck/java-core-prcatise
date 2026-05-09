package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String message = console.nextLine();
        BotMessageProcessor bot = new BotMessageProcessor();
        bot.processMessage(message);
    }
}
