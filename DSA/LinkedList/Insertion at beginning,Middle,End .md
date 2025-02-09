# Insertion 
``` java []
class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class LL {
    Node head;

    // Insert at the beginning
    public void insertAtBeginning(String data) {
        Node newNode = new Node(data); // Step 1: Create new node
        newNode.next = head;  // Step 2: Link new node to old head
        head = newNode;  // Step 3: Update head to new node
    }
    // Insert at Middle
    public void insertAtmiddle(int pos,String data){
        Node temp=head;
        Node newNode= new Node(data);
        // if position is beginning
        if(pos==1){
            insertAtBeginning(data);
            return;
        }
        // if middle
        //traversing 
        for(int i =0;i<pos-2;i++){  // traverse upto insert position
            temp=temp.next;
        }
        // pointing newnode(hello) to next (me) link creation
        newNode.next=temp.next;
        //cuuting link and updating to newNode
        temp.next=newNode;
    }

    // Insert at the end (unchanged)
    public void insertAtEnd(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Display linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class SLLInsertion {
    public static void main(String args[]) {
        LL list = new LL();

        list.insertAtEnd("is");
        list.insertAtEnd("me");
        list.insertAtEnd("sharanya");

        System.out.println("Before inserting at beginning:");
        list.display();

        // Inserting at beginning
        list.insertAtBeginning("this");

        System.out.println("After inserting at beginning:");
        list.display();
        System.out.println("After inserting at middle:");
        list.insertAtmiddle(3,"Hello");
        list.display();

    }
}

```
# Output
```java []
Before inserting at beginning:
is -> me -> sharanya -> null
After inserting at beginning:
this -> is -> me -> sharanya -> null
After inserting at middle:
this -> is -> Hello -> me -> sharanya -> null
```
