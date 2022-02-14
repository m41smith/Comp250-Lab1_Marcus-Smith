package bsu.comp152;

public class MessageFragment {

    char letter;
    MessageFragment next;

    public MessageFragment(char letter, MessageFragment next){
        this.letter = letter;
        this.next = next;

    }
}
