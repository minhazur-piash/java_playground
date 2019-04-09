package coursera.princeton.algorithm;

import edu.princeton.cs.algs4.WeightedQuickUnionUF;
import playground.FileUtils;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class Percolation {

    private int[] sites;
    private int rowLength;
    private WeightedQuickUnionUF quickUnionUF;

    // create n-by-n grid, with all sites blocked
    public Percolation(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n " + n + " is not greater than 1 ");
        }

        this.rowLength = n;
        int numberOfSites = (n * n) + 2;
        sites = new int[numberOfSites];
        for (int i = 0; i < sites.length; i++) {
            sites[i] = 0; //blocked = 0; open = 1;
        }

        quickUnionUF = new WeightedQuickUnionUF(numberOfSites);

        for (int i = 1; i <= rowLength; i++) {
            quickUnionUF.union(0, i);
        }

        int lastSite = numberOfSites - 2;
        for (int i = lastSite; i > (lastSite - rowLength); i--) {
            quickUnionUF.union(numberOfSites - 1, i);
        }

    }

    // open site (row, col) if it is not open already
    public void open(int row, int col) {

        validate(row, col);

        int index = convertPercolationMatrixIndexToArrayIndex(row, col);
        sites[index] = 1;

        //connect to adjacent open sites

        if (row != 1) {
            int topSite = index - rowLength;
            if (sites[topSite] == 1) {
                quickUnionUF.union(index, topSite);
            }
        }

        if (col != rowLength) {
            int rightSite = index + 1;
            if (sites[rightSite] == 1) {
                quickUnionUF.union(index, rightSite);
            }
        }

        if (col != 1) {
            int leftSite = index - 1;
            if (sites[leftSite] == 1) {
                quickUnionUF.union(index, leftSite);
            }
        }

        if (row != rowLength) {
            int bottomSite = index + rowLength;
            if (sites[bottomSite] == 1) {
                quickUnionUF.union(index, bottomSite);
            }
        }
    }

    // is site (row, col) open?
    public boolean isOpen(int row, int col) {
        validate(row, col);

        int index = convertPercolationMatrixIndexToArrayIndex(row, col);
        return sites[index] == 1;
    }

    // is site (row, col) full open?
    public boolean isFull(int row, int col) {
        validate(row, col);

        int index = convertPercolationMatrixIndexToArrayIndex(row, col);
        return quickUnionUF.connected(0, index);
    }

    // number of open sites
    public int numberOfOpenSites() {
        long count = Arrays.stream(sites)
                .filter( value -> value == 1)
                .count();
        return (int) count;
    }

    // does the system percolate?
    public boolean percolates() {
        return quickUnionUF.connected(0, sites.length - 1);
    }

    private void validate(int row, int col) {
        if (row < 0 || row > rowLength ) {
            throw new IllegalArgumentException("Row " + row + " is not between 1 and " + rowLength);
        }

        if (col < 0 || col > rowLength ) {
            throw new IllegalArgumentException("Col " + col + " is not between 1 and " + rowLength);
        }
    }

    // test client (optional)
    public static void main(String[] args) {

        String filePath = "/Users/minhaz/Books/DSA/Algorithms_Pt-1_Coursera/percolation/wayne98.txt";

        final Percolation[] percolation = {null};
        FileUtils.readFile(filePath, line -> {
            line = line.replaceAll("\\s+", " ").trim();
//            System.out.println(line);

            String[] words = line.split(" ");
//            System.out.println(Arrays.toString(words));
            if (words.length == 1) {
                int n = Integer.parseInt(words[0]);
                percolation[0] = new Percolation(n);

            } else {
                int row = Integer.parseInt(words[0]);
                int col = Integer.parseInt(words[1]);
                percolation[0].open(row, col);
            }
        });

        boolean percolates = percolation[0].percolates();
        System.out.println(percolates);

//        Percolation percolation = new Percolation(3);
//        percolation.open(1, 3);
//        percolation.open(2, 3);
//        percolation.open(3, 3);
//        percolation.open(3, 1);
//        percolation.open(2, 1);
//        percolation.open(1, 1);
//
//        /*boolean isOpen = percolation.isOpen(1, 1);
//        System.out.println(isOpen);*/
//
//        boolean percolates = percolation.percolates();
//        System.out.println(percolates);
    }


    public int convertPercolationMatrixIndexToArrayIndex(int row, int column){
        return getIndexFromMultiArray(rowLength, row - 1, column - 1) + 1;
    }


    private  int getIndexFromMultiArray(int rowLength, int rowIndex, int columnIndex) {
        return (rowIndex * rowLength) + columnIndex;
    }
}