package crazyjedi.homeWork5;

import crazyjedi.homeWork5.api.API;
import crazyjedi.homeWork5.api.BookingComAPI;
import crazyjedi.homeWork5.api.GoogleAPI;
import crazyjedi.homeWork5.api.TripAdvisorAPI;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vlad on 28.02.2017.
 */
public class Controller {
    public API[] apis = new API[3];

    public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    private Room[] addRoomToArray(Room[] roomArray, Room room) {
        Room[] result;
        if (roomArray == null) {
            return new Room[]{room};
        }
        int oldArrayLen = roomArray.length;
        if (roomArray.length > 0) {
            result = new Room[oldArrayLen + 1];
            System.arraycopy(roomArray, 0, result, 0, oldArrayLen);
            result[oldArrayLen] = room;
        } else {
            result = new Room[]{room};
        }

        return result;
    }

    public Room[] requstRooms(int price, int persons, String city, String hotel) {
        Room[] result = null;
        for (API api : apis) {
            for (Room room : api.findRooms(price, persons, city, hotel)) {
                result = addRoomToArray(result, room);
            }
        }
        return result;
    }

    ;

    public Room[] check(API api1, API api2) {
        Room[] result = null;
        for (Room room : api1.getAllRooms()) {
            for (Room room1 : api2.getAllRooms()) {
                if (room.equals(room1)) {
                    result = addRoomToArray(result, room);
                }
            }
        }
        return result;
    }

    ;
}
