# Insertion 
``` java []
class Node{
    String data;
    Node next;
    Node(String data){
        this.data=data;
        this.next=null;
    }
}
 class LL {
    Node head;
    //Node temp=head;


    public void  Insertion(String data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return ;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next= newNode;

     }
     public void display(){
        Node temp=head;
         while(temp!=null){
             System.out.print(temp.data+"->");
             temp=temp.next;
         }
         System.out.println("null");
     }
}
public class SLLInsertion{
    public static void main(String args[]){
        LL list=new LL();
        list.Insertion("This");
        list.Insertion("is");
        list.Insertion("me");
        list.Insertion("Sharanya");
        list.display();   // this -> is->me->Sharanya->null
    }
}
```
# Output
```java []
This->is->me->Sharanya->null
```
