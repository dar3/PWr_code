import java.util.Random;

class Z2C5 {
    public static void main(String[] args) {
        Random random = new Random();
        final int rows = 3;
        final int columns = 3;

        int[][] array = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10) + 1;
            }
        }

        System.out.println("Initial array: ");
        printArray(array);
        bubbleSort(array, rows, columns);
        System.out.println("\nSorted array: ");
        printArray(array);
    }

    public static void printArray(int[][] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            for (int j = 0; j < arrayToPrint[i].length; j++) {
                System.out.print(arrayToPrint[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void bubbleSort(int[][] arrayToSort, int rows, int columns) {

        int lastElementInRow = 0;
        for (int i = 0; i < rows * columns; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < columns; k++)
                    if (k == columns - 1) {
                        lastElementInRow = arrayToSort[j][k];
                    } else {
                        if (k == 0 && j > 0) {
                            if (lastElementInRow > arrayToSort[j][k]) {
                                System.out.print("last element in previous row = " + lastElementInRow + " > ");
                                System.out.print("array[" + j + "][" + k + "] = " + arrayToSort[j][k] + " swapping them...");
                                System.out.println();
                                int temp = lastElementInRow;
                                arrayToSort[j - 1][columns - 1] = arrayToSort[j][k];
                                arrayToSort[j][k] = temp;
                                lastElementInRow = 0;
                                printArray(arrayToSort);
                            } else {
                                System.out.print("last element in previous row = " + lastElementInRow + " !> ");
                                System.out.print("array[" + j + "][" + k + "] = " + arrayToSort[j][k]);
                                System.out.println();
                            }
                        }
                        if (arrayToSort[j][k] > arrayToSort[j][k + 1]) {
                            System.out.print("array[" + j + "][" + k + "] = " + arrayToSort[j][k] + " > ");
                            System.out.print("array[" + j + "][" + (k + 1) + "] = " + arrayToSort[j][k + 1] + " swapping them...");
                            System.out.println();
                            int temp = arrayToSort[j][k];
                            arrayToSort[j][k] = arrayToSort[j][k + 1];
                            arrayToSort[j][k + 1] = temp;
                            printArray(arrayToSort);
                        } else {
                            System.out.print("array[" + j + "][" + k + "] = " + arrayToSort[j][k] + " !> ");
                            System.out.print("array[" + j + "][" + (k + 1) + "] = " + arrayToSort[j][k + 1] + "");
                            System.out.println();
                        }
                    }
            }
        }
    }
}