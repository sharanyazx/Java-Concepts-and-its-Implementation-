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
    // insert at end ---->  common for insert and  delete
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
   
  // Deletion at end
    public void deleteAtEnd(){
        Node temp=tail;
        if(tail==null){
            System.out.print("Empty");
            return;
        }
        if(head==tail){
            head=tail=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
            temp.prev=null;
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
	    Link.insertAtBeginning(600);
	    Link.deleteAtEnd();
	    Link.display();   // this will print 600,300,200
	    

	}
}
