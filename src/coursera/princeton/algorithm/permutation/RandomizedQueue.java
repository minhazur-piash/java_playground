package coursera.princeton.algorithm.permutation;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RandomizedQueue<Item> implements Iterable<Item> {
    private int size;
    private int index;
    private Item[] items;


    // construct an empty randomized queue
    public RandomizedQueue() {
        items = (Item[]) new Object[1];
    }

    // is the randomized queue empty?
    public boolean isEmpty() {
        return size == 0;
    }

    // return the number of items on the randomized queue
    public int size() {
        return size;
    }

    // add the item
    public void enqueue(Item item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }

        resize(items.length * 2);

        items[index++] = item;
        size++;
    }

    // remove and return a random item
    public Item dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        int randomIndex = StdRandom.uniform(items.length);
        if (items[randomIndex] == null) {
            return dequeue();
        }

        Item item = items[randomIndex];
        items[randomIndex] = null;
        size--;

        if (size > 0 && size == items.length / 4) {
            resize(items.length / 2);
        }

        return item;
    }

    // return a random item (but do not remove it)
    public Item sample() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        int randomIndex = StdRandom.uniform(items.length);
        return items[randomIndex];
    }

    // return an independent iterator over items in random order
    public Iterator<Item> iterator() {
        if (size != items.length) {
            resize(size);
        }

        return new RandomizedQueueIterator<>();
    }

    // unit testing (optional)
    public static void main(String[] args) {
    }


    private void resize(int capacity) {
        if (index == items.length) {
            Item[] oldItems = items;
            items = (Item[]) new Object[capacity];
            for (int i = 0; i < index; i++) {
                items[i] = oldItems[i];
            }
        }
    }

    private class RandomizedQueueIterator<Item> implements Iterator<Item> {

        private int currentIndex = StdRandom.uniform(size);
        private int itemProcessed = 0;

        @Override
        public boolean hasNext() {
            return itemProcessed < size;
        }

        @Override
        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            int index = (currentIndex % size);
            Item item = (Item) items[index];
            currentIndex++;
            itemProcessed++;
            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}