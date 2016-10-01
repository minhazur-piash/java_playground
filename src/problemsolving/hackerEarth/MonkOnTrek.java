package problemsolving.hackerearth;

import java.util.Scanner;

/**
 * Created by minhazur on 9/2/16.
 */
public class MonkOnTrek {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String nkInput = input.nextLine();

        String[] nkStrings = nkInput.split(" ");

        int matrixSize = Integer.parseInt(nkStrings[0]);
        int curseCount = Integer.parseInt(nkStrings[1]);

        int[][] matrix = new int[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            String row = input.nextLine();
            String[] rowCellItems = row.split(" ");

            int[] cellItems = new int[matrixSize];
            for (int j = 0; j < matrixSize; j++) {
                cellItems[j] = Integer.parseInt(rowCellItems[j]);

            }
            matrix[i] = cellItems;
        }

        for (int i = 0; i < curseCount; i++) {
            int[] result = rowWiseMinimum(matrix);
            System.out.print(result[0] + " " + result[1]);

            result = columnWiseMinimum(matrix);
            System.out.print(result[0] + " " + result[1]);
        }

    }

    public static int[] rowWiseMinimum(int[][] matrix) {
        int minRowCellSum = Integer.MAX_VALUE;
        int minRowIndex = 0;
        int currentRowCellSum = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {

            currentRowCellSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                currentRowCellSum += matrix[i][j];
            }

            if (currentRowCellSum < minRowCellSum) {
                minRowCellSum = currentRowCellSum;
                minRowIndex = i;
            }
        }

        int rowAndSum[] = new int[2];
        rowAndSum[0] = minRowIndex;
        rowAndSum[1] = minRowCellSum;

        return rowAndSum;
    }

    public static int[] columnWiseMinimum(int[][] matrix) {
        int minColumnCellSum = Integer.MAX_VALUE;
        int minColumnIndex = 0;
        int currentColumnCellSum = Integer.MAX_VALUE;

        for (int i = 0; i < matrix[0].length; i++) {

            currentColumnCellSum = 0;
            for (int j = 0; j < matrix.length; j++) {
                currentColumnCellSum += matrix[j][i];
            }

            if (currentColumnCellSum < minColumnCellSum) {
                minColumnCellSum = currentColumnCellSum;
                minColumnIndex = i;
            }
        }

        int columnAndSum[] = new int[2];
        columnAndSum[0] = minColumnIndex;
        columnAndSum[1] = minColumnCellSum;

        return columnAndSum;
    }

}
