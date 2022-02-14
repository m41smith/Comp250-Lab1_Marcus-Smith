package bsu.comp152;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var newQueue = new MessageQueue();
        newQueue.getStatus(1);

        var inputReader = new Scanner(System.in);
        System.out.println("Who is this message from? ");
        var username = inputReader.nextLine();
        System.out.println("What is your message: ");
        var message = inputReader.nextLine();
        System.out.println("Who is this message for? ");
        var recipient = inputReader.nextLine();

        newQueue.enqueue(message, "From "+ username +" to "+ recipient +".");
        var status = newQueue.getStatus(1);
        System.out.println(status);
        System.out.println(newQueue.head.letter);
        System.out.println(newQueue.tail.letter);
    }

}
