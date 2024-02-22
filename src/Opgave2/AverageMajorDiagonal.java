package Opgave2;

public class AverageMajorDiagonal {
    static double[][] numbers = {
            {2, 17, 23, 0},
            {34, 12, 41, -17},
            {1, 2, 3, 4},
            {1.5, 2.5, 3.5, 6.5}
    };

    public static void main(String[] args) {
        System.out.println(sumMajorDiagonal(numbers));

        int[] location = locateSmallest(numbers);
        for (int i = 0; i < location.length; i++) {
            System.out.println(location[i]);
        }

    }

    public static double sumMajorDiagonal(double[][] doubleArray) {
        double sum = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            sum += doubleArray[i][i];
        }
        return sum / doubleArray.length;
    }

    public static int[] locateSmallest(double[][] doubleArray) {
        int rowOfSmallest = 0;
        int columnOfSmallest = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                if (doubleArray[i][j] < doubleArray[rowOfSmallest][columnOfSmallest]) {
                    rowOfSmallest = i;
                    columnOfSmallest = j;
                }
            }
        }
        return new int[]{rowOfSmallest, columnOfSmallest};
    }
}
