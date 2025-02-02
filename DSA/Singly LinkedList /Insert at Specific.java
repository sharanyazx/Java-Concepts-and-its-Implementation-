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
    // insert at beginning
    // insert at end ---->  common for insert and  delete
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
	    Link.insert(100);  // node 1
	    Link.insert(200);  // node 2
	    Link.insert(300);// node 3
	    Link.display();  // this will print 100,200,300
	    

	}
}
```java []
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

Process finished with exit code 0
	```
