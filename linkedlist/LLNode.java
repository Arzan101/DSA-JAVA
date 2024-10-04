package linkedlist;  // Declares the package name

public class LLNode {  // Defines the outer class for the linked list

    Node head;  // Reference to the first node (head) of the linked list

    class Node {  // Defines the inner class for a node in the linked list

        String data;  // Stores the data for the node
        Node next;  // Points to the next node in the list

        Node(String data) {  // Constructor for initializing a new node
            this.data = data;  // Assigns the input data to the node's data field
            this.next = null;  // Sets the next node reference to null initially
        }
    }

    public void addLast(String data) {  // Adds a new node to the end of the list
        Node newNode = new Node(data);  // Creates a new node with the given data
        if (head == null) {  // If the list is empty (head is null)
            head = newNode;  // Set the new node as the head of the list
            return;  // Exit the method as the node has been added
        }
        Node currNode = head;  // Start traversing the list from the head
        while (currNode.next != null) {  // Traverse until the last node (where next is null)
            currNode = currNode.next;  // Move to the next node
        }
        currNode.next = newNode;  // Add the new node at the end of the list
    }

    public void printList() {  // Method to print the entire linked list
        if (head == null) {  // If the list is empty (head is null)
            System.out.println("list is empty");  // Print that the list is empty
            return;  // Exit the method
        }
        Node currNode = head;  // Start traversing from the head node
        while (currNode != null) {  // Loop through the nodes until currNode is null
            System.out.println();  // Print an empty line for formatting
            System.out.println(currNode.data + " ");  // Print the data of the current node
            currNode = currNode.next;  // Move to the next node
        }
        System.out.println("Null");  // After the last node, print "Null" to indicate end of list
    }

    public static void main(String[] args) {  // Main method to run the program
        LLNode list = new LLNode();  // Create a new linked list object
        list.addLast("a");  // Add "a" to the end of the list
        list.addLast("b");  // Add "b" to the end of the list
        list.printList();  // Print the list, which now contains "a" and "b"
    }
}

// public void addFirst(String data){
//     Node newNode = new Node(data);  // Step 1: Create a new node with the given data
//     if(head == null){  // Step 2: Check if the list is empty
//         head = newNode;  // Step 3: If the list is empty, make the new node the head
//         return;  // Step 4: Exit the method because the node has been added
//     }
//     Node currNode = head;  // Step 5: Start traversing from the head (first node)
//     while(currNode.next != null){  // Step 6: Loop until we reach the last node
//         currNode = currNode.next;  // Step 7: Move to the next node in the list
//     }
//     currNode.next = newNode;  // Step 8: Add the new node to the end of the list
// }
