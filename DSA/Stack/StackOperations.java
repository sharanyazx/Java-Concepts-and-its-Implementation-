//  create stack class
class Stack{
	int a []= new int [10];
	int top=-1;
  // function to add element push
	public void push(int data) {
    // condition when stack is full
		if(top>=a.length-1) {
			System.out.print("Stack Overflow ");
		}
     // condition when stack has space
		else {
			top++;
			a[top]=data;
		}
	}
  // function to delete element only top most element will get removed 
	public void pop() {
    // condition when stack is empty cannot be removed 
		if(top==-1) {
			System.out.print("Stack is empty");
			
		}
      // condition when stack is not empty
		else {
			top-- ;
			
		}
	}
  // function to find top most element 
	public void  peek() {
    // when stack is empty
			if(top==-1) {
				System.out.print("Stack is empty");
				
			}
        // conditon when stack has elements
			else {
				System.out.println("Top element is  "+a[top]);
			}
			
			
		}
  // function to display 
		public void display() {
      // loop to display elements
			for(int i=top;i>=0;i--){
				System.out.println(a[i]+ "  ");
				
		}
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.peek();
		s.pop();
        s.display();
       
	}

}
