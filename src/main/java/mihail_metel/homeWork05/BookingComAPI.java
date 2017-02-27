package homeWork05;

import java.util.Date;

/*
Create three implementations of API called: BookingComAPI, TripAdvisorAPI, GoogleAPI. Every implementation
has global variable Room[] rooms which must be initialized in empty constructor with 5 differentRooms.
 */
public class BookingComAPI implements API {
    private Room[] rooms;

    public BookingComAPI() {
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
