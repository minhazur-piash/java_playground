package playground;

/**
 * Created by minhazur on 6/25/16.
 */

public class QueueAdt {
    private int front = -1;
    private int rear = -1;

    private int size = 10;
    private int[] arr = new int[size];

    public QueueAdt(int size) {
        this.size = size;
        arr = new int[size];
    }

    private boolean isFull(){
        return rear == size - 1;
    }

    private boolean isEmpty(){
        return front == -1;
    }

     void  enqueue(int value) {

        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (front == -1) {
            front++;
        }

        arr[++rear] = value;
    }

      int dequeue() {
        if (isEmpty() || front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[front++];
    }
}
