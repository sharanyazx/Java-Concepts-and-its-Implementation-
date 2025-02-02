class LinkedList {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }   // constructor close
    }  // class node close

    Node head,tail;  // Define head at the LinkedList level

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

    public void deleteFirst(){
        if(head == null){
            System.out.print(" List is Empty ");
            return ;
        }
        head=head.next;
    }
    public  void deleteLast(){
        if(head==null){
            System.out.print(" List is empty");
        }
        else if(head.next==null){
            head=null;
            return;
        }
        else{
            Node temp=head;  // temp points first node
            Node tail=head.next;  // tail points Second node
            while(tail.next!=null){  // loop until tail last node
                temp=temp.next;  // each iteration head update to its 1 step next
                tail=tail.next;  // each iteration second node of head update to its 1 step next
            }
            temp.next=null;  // last node is tail before is temp so next to temp link is removed by assigning to null
        }
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
        System.out.println("First Insertion ");
        link.addFirst("Sharanya's");
        link.printList();

        System.out.println("Insertion at  First");
        link.addFirst("is");
        link.printList();

        System.out.println("Insertion at First ");
        link.addFirst("who");
        link.printList();

        System.out.println("Last Insertion ");
        link.addLast("Best Friend ");
        link.printList();  // Output -- "  who--> is--> Sharanya's--> Best Friend "

        System.out.println("First Deletion  ");
        link.deleteFirst();
        link.printList();

        System.out.println("Last Deletion  ");
        link.deleteLast();
        link.printList();
    }
}


/*
output 
"C:\Program Files\Java\jdk-23\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.2\lib\idea_rt.jar=64942:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.2\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\A\IdeaProjects\JavaPlacement\out\production\JavaPlacement LinkedList
First Insertion 
Sharanya's --> NULL
Insertion at  First
is --> Sharanya's --> NULL
Insertion at First 
who --> is --> Sharanya's --> NULL
Last Insertion 
who --> is --> Sharanya's --> Best Friend  --> NULL
First Deletion  
is --> Sharanya's --> Best Friend  --> NULL
Last Deletion  
is --> Sharanya's --> NULL

Process finished with exit code 0*/
