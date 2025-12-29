package mediumLevelPrograms;

import java.util.Scanner;

/*Task 9: Simple Chatbot (Switch + String)
Create a simple chatbot program:
Take user input as string
Use switch case to respond:
"hi" → Hello!
"bye" → Goodbye!
"help" → How can I assist you?
default → Invalid input
Convert input to lowercase before checking
*/
public class simpleChatBot {

    public static void main(String[] args) {
        System.out.println("Say Hi or Bye or help");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();
        String actualResponse = response.toLowerCase();
        switch (actualResponse){
            case "hi":
                System.out.println("Hello!");
                break;
            case "bye":
                System.out.println("Goodbye!");
                break;
            case "help":
                System.out.println("How can I assist you?");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
