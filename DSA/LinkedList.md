````java []
// create class node 
class Node{
    int data;
    Node next;
    // Create a constructor
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
// step 4
class LinkedList{
    Node head,tail;
    // insert
    public void insert(int data){
        Node newNode=new Node(data);
        //newNode.next=head;
        if(head==null){
            head=newNode;
            tail=newNode;
            
        }
        else{
            tail.next=newNode;  // connect current tail to new node
            tail=newNode;  // update tail to new node
            
        }
    }
    // display
    public void display(){
        Node temp=head;
        while(temp!=null){   // iterate until condition is not satisfied
        System.out.println(temp.data);
            temp=temp.next;  //move to next node
              
        }  // print at once
  
    }
}
// Step 3 Main class 
public class Main{
	public static void main(String[] args) {
	    LinkedList Link=new LinkedList();
	    Link.insert(100);
	    Link.insert(200);
	    Link.insert(300);
	    Link.display();  // this will print 100,200,300
	    

	}
}
````
