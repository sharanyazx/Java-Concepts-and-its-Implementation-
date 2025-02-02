class LinkedList {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }   // constructor close 
    }  // class node close

     Node head;  // Define head at the LinkedList level

    public void addFirst(String data) {
        Node newNode = new Node(data);
        // if list is empty
        if (head == null) {
            head = newNode;
            return;
        }
      // else part --> not empty 
        newNode.next = head;
        head = newNode;
    }
     // function to add at last
    public void addLast(String data) {
        Node newNode = new Node(data);
      // if list is empty
        if (head == null) {
            head = newNode;
            return;
        }
      //else part --> not empty 
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    // function to Display
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("NULL");  // end of LinkedList NULL printing
    } 
    // main function 
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        // function calling
        link.addFirst("Sharanya's");
        link.addFirst("is");
        link.addFirst("who");
        link.addLast("Best Friend ");
        link.printList();  // Output -- "  who--> is--> Sharanya's--> Best Friend "
    }
}
