package bsu.comp152;

public class MessageQueue {

    boolean inUse;
    int size;
    MessageFragment head;
    MessageFragment tail;
    String sendReceive;

    public MessageQueue(){
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.inUse = false;
        this.sendReceive = null;

    }

    public void clear(){
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.inUse = false;
        this.sendReceive = null;

    }

    public String getStatus(int num){
        if (inUse == true){
            return  "Queue "+ num +": Unavailable\n"+ size +" characters left";
        }
        else {
            return  "Queue "+ num +": Available";
        }
    }

    public MessageFragment poll(){
        MessageFragment currHead = this.head;
        MessageFragment nextHead = this.head.next;
        --size;
        return currHead;
    }

    public void enqueue(String message, String sendReceive){
        if (inUse == true){
            throw new IllegalStateException();
        }
        else {
            inUse = true;
            this.sendReceive = message;
            for (var l : message.toCharArray()){
                if (size == 0){
                    var newFrag = new MessageFragment( l, head );
                    this.head = newFrag;
                    this.head.next = null;
                    this.tail = newFrag;

                }
                else {
                    var newFrag = new MessageFragment(l,head);
                    this.tail.next = newFrag;
                    this.tail = newFrag;
                }
                ++this.size;

            }
        }

    }
}
