package homeWork05;

import java.util.Date;

/**
 * Created by fluent on 27.02.2017.
 */
public class GoogleAPI implements API {

    private Room[] rooms;

    public GoogleAPI() {

        Date date = new Date();

        rooms = new Room[5];
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room(i, (i+1)*100,2, date,"Hotel "+i, "Kiev");
            // todo change date here
        }
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
