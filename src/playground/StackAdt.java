package playground;

import java.util.Stack;

/**
 * Created by minhazur on 6/25/16.
 */
public class StackAdt {
    int size = 5;
    int top = -1;
    int[] arr = new int[size];

    public StackAdt(int size){
        this.size = size;
        arr = new int[size];
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top < 0;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[top--];
    }




}
