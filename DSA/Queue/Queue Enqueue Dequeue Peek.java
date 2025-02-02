public class QueueUsingArrays {

    static final int MAX_SIZE = 30;
    int[] arr;
    int front, rear;

    // Constructor
    QueueUsingArrays() {
        arr = new int[MAX_SIZE];
        front = -1;
        rear = -1;
    }

    // Enqueue Operation (O(1))
    public void enqueue(int val) {
        if (rear == MAX_SIZE - 1) {
            System.out.print("Out of Bound");
        }
        if (front == -1) {
            front = 0; // Initialize front when inserting first element
        }
        arr[++rear] = val;
    }

    // Dequeue Operation (O(1))
    public int dequeue() {
        if (isEmpty()) {
            System.out.print("Queue is Empty");
        }
        int dequeuedElement = arr[front++];

        // Reset front and rear when the queue is empty after dequeuing
        if (front > rear) {
            front = -1;
            rear = -1;
        }
        return dequeuedElement;
    }

    // Peek Operation (O(1))
    public int peek() {
        if (isEmpty()) {
            System.out.print("Queue is Empty");
        }
        return arr[front];
    }

    // Check if Queue is Empty (O(1))
    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    // Print Queue Elements (for debugging)
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main Method for Testing
    public static void main(String args[]) {
        QueueUsingArrays queue = new QueueUsingArrays();
        queue.enqueue(34);
        queue.enqueue(36);
        queue.enqueue(39);
        queue.enqueue(100);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front Element: " + queue.peek());
        queue.printQueue();
    }
}
