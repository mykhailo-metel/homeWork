package crazyjedi.homeWork5;

import java.sql.Array;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by Vlad on 01.03.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Controller myController = new Controller();
        System.out.println(Arrays.toString(myController.requstRooms(200,3,"Imperial City","The All-Saints Inn")));


        Room room1 = new Room(1, 10, 50, new Date(2017, 4, 4), "Sheogorath's Smile"
                , "Shivering Isles");
        Room room2 = new Room(1, 10, 50, new Date(2017, 4, 4), "Sheogorath's Smile"
                , "Shivering Isles");
        Room room3 = new Room(1, 20, 1, new Date(2017, 8, 2), "The Pirate Bay"
                , "Mogadishu");

        System.out.println(Arrays.toString(myController.check(myController.apis[0],myController.apis[1]))); //BookingCom ~ Google Ankh-Morpork
        System.out.println(Arrays.toString(myController.check(myController.apis[1],myController.apis[2]))); //Google ~ TripAdvisor Pripyat
        System.out.println(Arrays.toString(myController.check(myController.apis[0],myController.apis[2]))); //BookingCom ~ TripAdvisor No

    }


}
