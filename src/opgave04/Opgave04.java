package opgave04;

import opgave04.models.TheaterFloor;

public class Opgave04 {
    public static void main(String[] args) {
        TheaterFloor theaterFloor = new TheaterFloor();

        System.out.println(theaterFloor.buySeat(5, 5));
        System.out.println(theaterFloor.buySeat(5, 5));

        /*
        for (int i = 0; i < 100; i++) {
            System.out.println(theaterFloor.buySeat(40));
        }

         */
        theaterFloor.printTheaterFloor();
    }
}
