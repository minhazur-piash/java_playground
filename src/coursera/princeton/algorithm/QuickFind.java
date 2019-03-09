package coursera.princeton.algorithm;

public class QuickFind {

    private int[] nodes;

    /**
     *
     * @param p
     * @param q
     * @return boolean based on whether there is a connection between node p & q
     */
    public boolean isConnected(int p, int q){
        return nodes[p] == nodes[q];
    }


    /**
     * Connects node p and q
     * @param p first node
     * @param q second node
     */
    public void union(int p, int q){
        if (isConnected(p, q)) {
            System.out.println("already connected");
            return;
        }

        int pId = nodes[p];
        int qId = nodes[q];

        for (int i = 0; i < nodes.length - 1; i++) {
            if(nodes[i] == pId) {
                nodes[i] = qId;
            }
        }
    }



}
