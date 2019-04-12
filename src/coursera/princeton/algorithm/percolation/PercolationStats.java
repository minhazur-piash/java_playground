package coursera.princeton.algorithm.percolation;

import coursera.princeton.algorithm.percolation.Percolation;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {
    private final double[] fractionOfOpenSites;
    private  double sumOfFractions = 0;
    private final int trials;

    // perform trials independent experiments on an n-by-n grid
    public PercolationStats(int n, int trials) {
        validCheck(n, trials);

        this.trials = trials;
        fractionOfOpenSites = new double[trials];

        for (int i = 1; i <= trials; i++) {
            Percolation percolation = new Percolation(n);
//            StdRandom.setSeed(System.currentTimeMillis());

            while (!percolation.percolates()) {
                int row = StdRandom.uniform(1, n + 1);
                int col = StdRandom.uniform(1, n + 1);
                percolation.open(row, col);
//                System.out.print("r " + row + " c " + col + " ");
            }

            double fraction =  ((double)percolation.numberOfOpenSites()) / (n * n);
//            System.out.println("number of open " + percolation.numberOfOpenSites() + " fraction: " + fraction);
            fractionOfOpenSites[i - 1] = fraction;
            sumOfFractions += fraction;
        }
    }

    private void validCheck(int n, int trials) {
        if (n <= 0 || trials <= 0) {
            throw new IllegalArgumentException("n " + n + " is not greater than 1 or trials "
                    + trials +" is not greater than 1");
        }
    }

    // sample mean of percolation threshold
    public double mean() {
        System.out.println("===> mean called."); // sumOfFractions: " + sumOfFractions);
        return sumOfFractions / trials;
    }

    // sample standard deviation of percolation threshold
    public double stddev() {
        double mean = mean();
        System.out.println("===> stddev called.");
        double sum = 0;
        for (int i = 0; i < trials; i++) {
            double f = fractionOfOpenSites[i] - mean;
            sum += (f * f);
        }

        double stdDev = sum / (trials - 1);
        return Math.sqrt(stdDev);
    }

    // low  endpoint of 95% confidence interval
    public double confidenceLo() {
        return mean() - (1.96 * stddev() / Math.sqrt(trials));
    }

    // high endpoint of 95% confidence interval
    public double confidenceHi() {
        return mean() + (1.96 * stddev() / Math.sqrt(trials));

    }

    // test client (described below)
    public static void main(String[] args) {
        PercolationStats percolationStats = new PercolationStats(20, 10);
        System.out.println("mean                    = " + percolationStats.mean());
        System.out.println("stddev                  = " + percolationStats.stddev());
        System.out.println("95% confidence interval = [" + percolationStats.confidenceLo()
                + ", " + percolationStats.confidenceHi() + "]");
    }
}