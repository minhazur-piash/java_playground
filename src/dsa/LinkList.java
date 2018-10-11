package dsa;

import com.sun.istack.internal.Nullable;

public class LinkList {

    static class Node {
        Node(int value) {
            this.value = value;
        }

        int value;
        @Nullable Node next;
        @Nullable Node prev;
    }

    public static void main(String[] args) {

        Node node = createLinkList();
        printLinkListValue(node);

        Node reversedList = reversedLinkList(node);
        printLinkListValue(reversedList);

    }

    private static Node createLinkList() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node1.prev = null;

        node2.next = node3;
        node2.prev = node1;

        node3.next = node4;
        node3.prev = node2;

        node4.next = node5;
        node4.prev = node3;

        node5.next = null;
        node5.prev = node4;
        return node1;
    }


    private static void printLinkListValue(Node node) {
        System.out.println();

        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }

        System.out.println();
    }


    /**
     *
     * @param node Fist node in the list
     * @return returns first node after reversed
     */
    private static Node reversedDoublyLinkList(Node node) {
        Node prev = null;
        Node next;

        while (node != null) {
            next = node.next;
            node.next = prev;
            node.prev = next;
            prev = node;

            node = next;
        }

        return prev;
    }

    /**
     *
     * @param currentNode Fist currentNode in the list
     * @return returns first currentNode after reversed
     */
    private static Node reversedLinkList(Node currentNode) {
        Node prev = null;
        Node next;

        while (currentNode != null) {
            next = currentNode.next;
            currentNode.next = prev;
//            currentNode.prev = next;  //We don't need this
            prev = currentNode;

            currentNode = next;
        }

        return prev;
    }
}
