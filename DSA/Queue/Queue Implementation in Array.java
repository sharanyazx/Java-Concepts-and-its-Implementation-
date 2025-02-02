class Queue {
    int[] a = new int[10];
    int front = -1;
    int rear = -1;

    // function to add element (enqueue)
    public void enqueue(int data) {
        // Check if the queue is full
        if (rear >= a.length - 1) {
            System.out.println("Queue Overflow");
        } else {
            // If the queue is empty, initialize front
            if (front == -1) {
                front = 0;
            }
            // Increment rear and insert the data
            rear++;
            a[rear] = data;
        }
    }

    // function to delete element (dequeue)
    public void dequeue() {
        // Check if the queue is empty
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            // Remove the element at the front
            front++;
        }
    }

    // function to find the front most element (peek)
    public void peek() {
        // Check if the queue is empty
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element is " + a[front]);
        }
    }

    // function to display elements in the queue
    public void display() {
        // Check if the queue is empty
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            // Loop to display elements from front to rear
            for (int i = front; i <= rear; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Queue object
        Queue q = new Queue();
        
        // Enqueue some elements
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        // Peek at the front element
        q.peek();

        // Dequeue an element
        q.dequeue();
        
        // Display the remaining elements in the queue
        q.display();
    }
}
