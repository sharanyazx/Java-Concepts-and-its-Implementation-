# Deletion at Start,End,Middle
```java []
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
    public void deleteAtstart(){
        if(head==null){
            System.out.print("List is empty");
        }
        head=head.next;
    }
    public void deleteAtEnd(){
        if(head.next==null){
            head=null;
            return ;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void deleteAtmiddle(int pos){
        if(head==null){
            System.out.print("List is empty");
            return;
        }
        if(pos==1){
            deleteAtstart();
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 2; i++) {
            if (temp.next == null || temp.next.next == null) {
                System.out.println("Invalid position");
                return;
            }
            temp = temp.next;
        }

        temp.next = temp.next.next;

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


        System.out.println("After inserting at beginning:");
        list.insertAtBeginning("this");
        list.display();

        System.out.println("After inserting at middle:");
        list.insertAtmiddle(3,"Hello");
        list.display();

        System.out.println("After Deletion At beginning ");
        list.deleteAtstart();
        list.display();

        System.out.println("After Deletion At End ");
        list.deleteAtEnd();
        list.display();


        System.out.println("After Deletion At Middle");
        list.deleteAtmiddle(3);
        list.display();



    }
}
```
# Output
``` java []
Before inserting at beginning:
is -> me -> sharanya -> null
After inserting at beginning:
this -> is -> me -> sharanya -> null
After inserting at middle:
this -> is -> Hello -> me -> sharanya -> null
After Deletion At beginning 
is -> Hello -> me -> sharanya -> null
After Deletion At End 
is -> Hello -> me -> null
After Deletion At Middle
is -> Hello -> null
```
