package opgave01;

import opgave01.models.DoubleUp;
import opgave01.models.TwoDimensionalIntArray;

public class Opgave01 {
    public static void main(String[] args) {
        int[][] numbers = {
                {2, 17, 23, 0, -1},
                {34, 12, 41, -17, 51},
                {1, 2, 3, 4, 5}
        };
        TwoDimensionalIntArray twoDimensionalIntArray = new TwoDimensionalIntArray(numbers);

        twoDimensionalIntArray.setValueAt(2, 4, 101);
        System.out.println(twoDimensionalIntArray.getValueAt(2, 4));
        System.out.println(twoDimensionalIntArray.sumRow(1));
        System.out.println(twoDimensionalIntArray.sumColumn(3));
        System.out.println(twoDimensionalIntArray.sumAll());
        twoDimensionalIntArray.print();

        DoubleUp doubleUp = new DoubleUp();
        twoDimensionalIntArray.map(a -> a * 3);
        System.out.println();
        twoDimensionalIntArray.print();

    }
}
