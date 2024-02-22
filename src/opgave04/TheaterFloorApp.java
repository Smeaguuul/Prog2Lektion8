package opgave04;

import opgave04.models.TheaterFloor;

import java.util.Scanner;

public class TheaterFloorApp {
    public static void main(String[] args) {
        TheaterFloor theaterFloor = new TheaterFloor();
        buySeat(theaterFloor);
    }

    private static void buySeat(TheaterFloor theaterFloor) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("If you wish to buy a specific seat, type 1.");
        System.out.println("If you wish to buy any seat at a given price, type 2");

        int seatBuy = myObj.nextInt();  // Read user input
        if (seatBuy == 1) {
            theaterFloor.printTheaterFloor();
            System.out.println("Please type the row you want:");
            int row = myObj.nextInt();
            System.out.println("Please type the column you want:");
            int column = myObj.nextInt();
            boolean success = theaterFloor.buySeat(row, column);
            if (success){
                System.out.println("It was a success!");
            } else {
                System.out.println("It failed. No seat for you!");
            }
            theaterFloor.printTheaterFloor();
        } else {
            theaterFloor.printTheaterFloor();
            System.out.println("Please the type the price you wish to pay");
            int price = myObj.nextInt();
            boolean success = theaterFloor.buySeat(price);
            if (success){
                System.out.println("It was a success");
            } else {
                System.out.println("It failed. No seat for you!");
            }
            theaterFloor.printTheaterFloor();
        }
        System.out.println("Do you wish to continue? 1/2");
        int answer = myObj.nextInt();
        if (answer == 1){
            buySeat(theaterFloor);
        }
    }
}
