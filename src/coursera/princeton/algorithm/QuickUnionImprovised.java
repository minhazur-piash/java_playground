package coursera.princeton.algorithm;

public class QuickUnionImprovised {

    private int[] nodes;
    private int[] treeSize;

    public QuickUnionImprovised(int nodesCount) {
        this.nodes = new int[nodesCount];
        this.treeSize = new int[nodesCount];

        for (int i = 0; i < nodesCount; i++) {
            nodes[i] = i;
        }

        for (int i = 0; i < nodesCount; i++) {
            treeSize[i] = 1;
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

        if (treeSize[rootP] > treeSize[rootQ]) {
            nodes[rootQ] = rootP;
            treeSize[rootP] += treeSize[rootQ];

        } else {
            nodes[rootP] = rootQ;
            treeSize[rootQ] += treeSize[rootP];
        }
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
