package linkedlist;

public class LLNode {

    Node head;

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
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;

        }
        currNode.next = newNode;

    }

    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
        }
        Node currNode = head;
        while (currNode.next != null) {
            System.out.println();
            System.out.println(currNode.data + " ");
            currNode = currNode.next;

        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LLNode list = new LLNode();
        list.addFirst("a");
        list.addFirst("b");

    }
}
