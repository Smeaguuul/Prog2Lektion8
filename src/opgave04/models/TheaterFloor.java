package opgave04.models;

public class TheaterFloor {
    int[][] seats = {{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {10, 10, 20, 20, 20, 20, 20, 20, 10, 10}, {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {20, 20, 30, 30, 40, 40, 30, 30, 20, 20}, {20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
            {30, 40, 50, 50, 50, 50, 50, 50, 40, 30}};

    /**
     * Hvis plads seat på række row er ledig reserveres pladsen og der returneres true
     * Der returneres false hvis pladsen er optaget.
     *
     * @param row
     * @param seat
     * @return
     */

    public boolean buySeat(int row, int seat) {
        boolean success = false;
        if (seats[row][seat] != 0) {
            seats[row][seat] = 0;
            success = true;
        }
        return success;
    }

    /**
     * Hvis der er en plads ledig med den pågældende pris, reserveres pladsen og
     * der returneres true. Der returneres false, hvis der ikke er nogen pladser ledige
     * til den pågældende pris.
     *
     * @param price
     * @return
     */
    public boolean buySeat(int price) {
        boolean success = false;
        int i = 0;
        while (i < seats.length && success == false) {
            int j = 0;
            while (j < seats.length && success == false) {
                if (seats[i][j] != 0 && seats[i][j] == price) {
                    seats[i][j] = 0;
                    success = true;
                }
                j++;
            }
            i++;
        }
        return success;
    }

    public void printTheaterFloor() {
        int sum = 0;
        System.out.printf("%8s", "Sæde: ");
        for (int i = 0; i < seats.length; i++) {
            System.out.printf("%4s", i);
        }
        System.out.println();
        System.out.printf("%8s", " ");
        for (int i = 0; i < seats.length; i++) {
            System.out.printf("%4s", "____");
        }
        System.out.println();

        for (int i = 0; i < seats.length; i++) {
            System.out.printf("%8s", "Række " + (i + 1) + " :");
            for (int j = 0; j < seats[i].length; j++) {
                String price = "";
                if (seats[i][j] == 0){
                    price = "--";
                } else {
                    price = String.valueOf(seats[i][j]);
                }
                System.out.printf("%4s", price);
            }
            System.out.println();
        }
    }
}

