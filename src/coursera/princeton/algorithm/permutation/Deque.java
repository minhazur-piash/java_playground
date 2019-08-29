package coursera.princeton.algorithm.permutation;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {
    private int size;
    private Node<Item> first;
    private Node<Item> last;

    public Deque() {

    }

    public boolean isEmpty() {
        return first == null;
    }

    // return the number of items on the deque
    public int size() {
        return size;
    }

    // add the item to the front
    public void addFirst(Item item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }

        Node<Item> oldFirst = first;

        first = new Node<>();
        first.item = item;
        first.next = oldFirst;

        if (oldFirst != null) {
            oldFirst.prev = first;
        }

        if (last == null) {
            last = first;
        }

        size++;
    }

    // add the item to the end
    public void addLast(Item item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }

        Node<Item> oldLast = last;

        last = new Node<>();
        last.item = item;
        last.prev = oldLast;

        if (oldLast != null) {
            oldLast.next = last;
        }

        if (first == null) {
            first = last;
        }

        size++;

    }

    // remove and return the item from the front
    public Item removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        size--;

        Node<Item> oldFirst = first;
        if (first == last) {
            last = null;
            first = null;

        } else {
            first = first.next;
            first.prev = null;
        }

        return oldFirst.item;
    }

    // remove and return the item from the end
    public Item removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        size--;

        Node<Item> oldLast = last;
        if (last == first) {
            last = null;
            first = null;

        } else {
            last = last.prev;
            last.next = null;
        }
        return oldLast.item;
    }

    // return an iterator over items in order from front to end
    public Iterator<Item> iterator() {
        return new DequeIterator<>();
    }

    public static void main(String[] args) {
        /*  Deque<String> deque = new Deque<>();
         *//*deque.addLast("Hello");
        deque.addLast("World");
        deque.addLast("!");*//*

        deque.addFirst("Hello");
        deque.addFirst("World");
        deque.addFirst("!");

        System.out.print(deque.removeFirst() + " ");
        System.out.print(deque.removeFirst() + " ");
        System.out.print(deque.removeFirst() + " ");

      *//*  System.out.print(deque.removeLast() + " ");
        System.out.print(deque.removeLast() + " ");
        System.out.print(deque.removeLast() + " ");*//*
//        System.out.print(deque.removeLast() + " ");

        for (String string : deque) {
            System.out.print(string + " ");
        }

        System.out.println();*/
    }

    private static class Node<Item> {
        Item item;
        Node<Item> next;
        Node<Item> prev;
    }

    private class DequeIterator<Item> implements Iterator<Item> {

        private Node<Item> current = (Node<Item>) first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            if (current == null) {
                throw new NoSuchElementException();
            }

            Item currentItem = current.item;
            current = current.next;
            return currentItem;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}