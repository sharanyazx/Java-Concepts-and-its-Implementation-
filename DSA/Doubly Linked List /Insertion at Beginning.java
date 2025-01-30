// create class node 
class Node{
    int data;
    Node next;
    Node prev;
    // Create a constructor
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
// step 4
class LinkedList{
    Node head,tail;
    // insert at beginning
   
    public void insertAtBeginning(int data){
        Node newNode=new Node(data);
        //newNode.next=head;
        if(head==null){
            head=tail=newNode;
            
            
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            
        }
    }
    
    // display
    public void display(){
        Node temp=head;
        if(temp==null){
            System.out.print("empty");
        }
    while(temp!=null){   // iterate until condition is not satisfied
        System.out.print(temp.data);
            if(temp.next!=null) {
             System.out.print("<-> ");
            } //move to next node
             temp=temp.next;
        } 
         System.out.println();
    
    }
   
}

// Step 3 Main class 
public class Main{
	public static void main(String[] args) {
	    LinkedList Link=new LinkedList();
	    Link.insertAtBeginning(100);  // node 1
	    Link.insertAtBeginning(200);  // node 2
	    Link.insertAtBeginning(300);// node 3
	    Link.display();  // this will print 100,200,300
	    

	}
}
