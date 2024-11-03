package Demo;
class Node {
    int data;
    Node next;
    Node prev; // Pointer to the previous node

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;

    // Method to insert a node at the end
    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
            node.prev = n; // Set the previous pointer
        }
    }

    // Method to insert a node at the start
    public void insertAtStart(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head.prev = node; // Set the previous pointer
            head = node; // Update head to the new node
        }
    }

    // Method to insert a node at a specific index
    public void insertAt(int index, int data) {
        Node node = new Node(data);
        if (index == 0) {
            insertAtStart(data);
            return;
        }

        Node n = head;
        for (int i = 0; i < index - 1; i++) {
            if (n == null) return; // Prevent NullPointerException
            n = n.next;
        }

        if (n != null) {
            node.next = n.next;
            if (n.next != null) {
                n.next.prev = node; // Set the previous pointer of the next node
            }
            n.next = node; // Link the new node
            node.prev = n; // Set the previous pointer
        }
    }

    // Method to delete a node at a specific index
    public void deleteAt(int index) {
        if (head == null) return; // Prevent NullPointerException

        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null; // Set the previous pointer of the new head
            }
        } else {
            Node n = head;
            for (int i = 0; i < index; i++) {
                if (n == null) return; // Prevent NullPointerException
                n = n.next;
            }
            if (n != null) {
                if (n.prev != null) {
                    n.prev.next = n.next; // Bypass the node
                }
                if (n.next != null) {
                    n.next.prev = n.prev; // Bypass the node
                }
            }
        }
    }

    // Method to display the list
    public void show() {
        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}

public class DoublyLinkedListExample {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(18);
        list.insertAtStart(25);
        list.insertAt(1, 55); // Change to 1 to insert between 25 and 18
        list.deleteAt(2); // Deletes the node at index 2
        list.show(); // Display the list after operations
    }
}
