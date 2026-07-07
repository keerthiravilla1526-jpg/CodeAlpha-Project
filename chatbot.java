import java.util.*;

class ChatBot {

    private Scanner sc = new Scanner(System.in);

    public void start() {

        System.out.println("====================================");
        System.out.println("      JAVA AI CHATBOT");
        System.out.println("====================================");
        System.out.println("Type 'exit' to end the chat.");

        while (true) {

            System.out.print("\nYou : ");
            String input = sc.nextLine().toLowerCase().trim();

            if (input.equals("exit")) {
                System.out.println("Bot : Goodbye! Have a nice day 😊");
                break;
            }

            reply(input);
        }
    }

    private void reply(String input) {

        if (input.contains("hello") || input.contains("hi")) {
            System.out.println("Bot : Hello! How can I help you?");
        }

        else if (input.contains("how are you")) {
            System.out.println("Bot : I'm doing great! Thanks for asking.");
        }

        else if (input.contains("your name")) {
            System.out.println("Bot : My name is Java AI ChatBot.");
        }

        else if (input.contains("college")) {
            System.out.println("Bot : I can help with college-related questions.");
        }

        else if (input.contains("java")) {
            System.out.println("Bot : Java is an object-oriented programming language.");
        }

        else if (input.contains("python")) {
            System.out.println("Bot : Python is simple, powerful and widely used for AI.");
        }

        else if (input.contains("c++")) {
            System.out.println("Bot : C++ is popular for competitive programming and system software.");
        }

        else if (input.contains("html")) {
            System.out.println("Bot : HTML is used to build the structure of web pages.");
        }

        else if (input.contains("css")) {
            System.out.println("Bot : CSS is used for designing web pages.");
        }

        else if (input.contains("javascript")) {
            System.out.println("Bot : JavaScript makes websites interactive.");
        }

        else if (input.contains("ai")) {
            System.out.println("Bot : AI stands for Artificial Intelligence.");
        }

        else if (input.contains("machine learning")) {
            System.out.println("Bot : Machine Learning allows computers to learn from data.");
        }

        else if (input.contains("nlp")) {
            System.out.println("Bot : NLP means Natural Language Processing.");
        }

        else if (input.contains("internship")) {
            System.out.println("Bot : Practice Java projects and upload them to GitHub.");
        }

        else if (input.contains("project")) {
            System.out.println("Bot : Try Hotel Reservation, ChatBot or Stock Trading System.");
        }

        else if (input.contains("thanks")) {
            System.out.println("Bot : You're welcome!");
        }

        else if (input.contains("bye")) {
            System.out.println("Bot : Bye! See you soon.");
        }

        else {
            System.out.println("Bot : Sorry, I don't understand that yet.");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        ChatBot bot = new ChatBot();
        bot.start();

    }
}