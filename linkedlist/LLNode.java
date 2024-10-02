package linkedlist;

import javax.xml.crypto.Data;

public class LLNode {

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
    }

    public static void main(String[] args) {
        LLNode list = new LLNode();

    }
}
