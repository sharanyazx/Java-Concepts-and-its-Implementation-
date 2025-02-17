// creating a linkedlist node 
class StackNode{
    int data;
    StackNode next;
    StackNode(int data){
        this.data=data;
        this.next=null;
    }
}
// Main class 
public class StackLL {
    // head=null
    static StackNode  head=null;
    // method to push
    public static void push(int data){
        // creating a node
        StackNode newNode=new StackNode(data);
        // edge case
        if(head==null) {
            head = newNode;
            return;
        }
        // else  insert 
        newNode.next=head;
        head=newNode;
    }
    public static boolean isEmpty(){
        return head==null;
    }
    // method to pop
    public static int Pop(){
        // check for empty
     if(isEmpty()) {
         return 0;
     }   
         // top = head 
         // head is popped out 
        // head.next is the new head
       StackNode top=head;
       head=head.next;
       return top.data;

    }
    // method to return top element
    public static int Peak(){
        if(isEmpty()) {
            return -1;
        }
        // top is assigned to head
        // return top of data
        StackNode top=head;
        return top.data;

    }
    public static void main(String args[]){
        StackLL stack=new StackLL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
         stack.Pop(); // top -> 7 6 5 4 3 2 1
         stack.Pop(); // top -> 6 5 4 3 2 1
         stack.Pop(); // top -> 5 4 3 2 1
        System.out.print(" Displaying elements ");
        while(!stack.isEmpty()){
            System.out.print(Peak()+" ");
            stack.Pop();
        }

    }

}
