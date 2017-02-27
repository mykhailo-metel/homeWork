package homeWork05;

/*
Create three implementations of API called: BookingComAPI, TripAdvisorAPI, GoogleAPI. Every implementation
has global variable Room[] rooms which must be initialized in empty constructor with 5 differentRooms.
 */
public class BookingComAPI implements API_findRooms {

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
