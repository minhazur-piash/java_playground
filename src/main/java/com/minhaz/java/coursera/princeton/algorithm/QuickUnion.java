package com.minhaz.java.coursera.princeton.algorithm;

public class QuickUnion {

    private int[] nodes;

    public QuickUnion(int nodesCount) {
        this.nodes = new int[nodesCount];

        for (int i = 0; i < nodesCount; i++) {
            nodes[i] = i;
        }
    }

    public int[] getNodes() {
        return nodes;
    }

    /**
     * @param nodeP
     * @param nodeQ
     * @return
     */
    public boolean isConnected(int nodeP, int nodeQ) {
        int rootP = findRootNode(nodeP);
        int rootQ = findRootNode(nodeQ);
        return rootP == rootQ;
    }

    /**
     * Connecting two nodes by making Q node's root as P's root node's parent.
     *
     * @param nodeP
     * @param nodeQ
     */
    void union(int nodeP, int nodeQ) {
        int rootP = findRootNode(nodeP);
        int rootQ = findRootNode(nodeQ);

        if (rootP == rootQ) {
            System.out.println(nodeP + " & " + nodeQ + " are already connected");
            return;
        }

        nodes[rootP] = rootQ;
    }

    /**
     * For a skinny tree can take N operation
     *
     * @param nodeP
     * @return
     */
    private int findRootNode(int nodeP) {
        int parentNode = nodes[nodeP];
        if (parentNode == nodeP) {
            return parentNode;
        }
        return findRootNode(parentNode);

    }


}
