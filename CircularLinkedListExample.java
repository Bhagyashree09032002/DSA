package MostRecent;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            node.next = head; // Point to itself
        } else {
            Node n = head;
            while (n.next != head) { // Traverse until we reach the head again
                n = n.next;
            }
            n.next = node;
            node.next = head; // Make it circular
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            node.next = head; // Point to itself
        } else {
            Node n = head;
            while (n.next != head) { // Traverse to find the last node
                n = n.next;
            }
            n.next = node; // Link the last node to the new node
            node.next = head; // Make it circular
            head = node; // Update head to the new node
        }
    }

    public void insertAt(int index, int data) {
        Node node = new Node(data);
        if (index == 0) {
            insertAtStart(data);
            return;
        }

        Node n = head;
        for (int i = 0; i < index - 1; i++) {
            if (n.next == head) return; // Prevent NullPointerException
            n = n.next;
        }
        
        node.next = n.next;
        n.next = node; // Insert the new node
    }

    public void deleteAt(int index) {
        if (head == null) return; // Prevent NullPointerException

        if (index == 0) {
            if (head.next == head) {
                head = null; // If there's only one node
            } else {
                Node n = head;
                while (n.next != head) { // Find the last node
                    n = n.next;
                }
                n.next = head.next; // Bypass the head
                head = head.next; // Update head
            }
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                if (n.next == head) return; // Prevent NullPointerException
                n = n.next;
            }
            if (n.next != head) { // Check if there's a node to delete
                n.next = n.next.next; // Bypass the node to delete
            }
        }
    }

    public void show() {
        if (head == null) return;

        Node node = head;
        do {
            System.out.println(node.data);
            node = node.next;
        } while (node != head);
    }
}

public class CircularLinkedListExample {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        CircularLinkedList list = new CircularLinkedList();
        list.insert(18);
        list.insertAtStart(25);
        list.insertAt(0, 55);
        list.deleteAt(2);
        list.show(); // Display the list after operations
    }
}
