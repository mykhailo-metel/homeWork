package crazyjedi.homeWork5.api;

import crazyjedi.homeWork5.Room;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Vlad on 27.02.2017.
 */
public class BookingComAPI implements API {

    public Room[] rooms;

    public BookingComAPI() {
        rooms = new Room[]{
                new Room(1, 100, 2, new Date(2017, 3, 4), "Hilton"
                        , "New Vasyuki")
                , new Room(1, 200, 3, new Date(2017, 4, 5), "Jack's"
                , "Los Santos")
                , new Room(1, 10, 50, new Date(2017, 4, 4), "Karavan-Saray"
                , "Agraba")
                , new Room(1, 20, 1, new Date(2017, 8, 2), "The Pirate Bay"
                , "Mogadishu")
                , new Room(1, 1000, 1, new Date(2017, 7, 4), "The Mended Drum"
                , "Ankh-Morpork")
        };
    }

    @Override
    public ArrayList<Room> findRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> result = new ArrayList<Room>();
        for (Room room : rooms) {
            if (room.getPrice() == price && room.getPersons() == persons && city.equals(room.getCityName())
                    && hotel.equals(room.getHotelName())) {
                result.add(room);
            }
        }
        return result;
    }

    @Override
    public Room[] getAllRooms() {
        return rooms;
    }
}
