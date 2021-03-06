package crazyjedi.homeWork5.api;

import crazyjedi.homeWork5.Room;

import java.util.ArrayList;
import java.util.Date;
/**
 * Created by Vlad on 27.02.2017.
 */
public class GoogleAPI implements API {

    public Room[] rooms;

    public GoogleAPI() {
        rooms = new Room[]{
                new Room(1, 100, 2, new Date(2017, 3, 4), "Kim's Inn"
                        , "Pyongyang")
                ,new Room(1, 200, 3, new Date(2017, 4, 5), "Red Water Bottle"
                , "Matrix")
                ,new Room(1, 10, 50, new Date(2017, 4, 4), "Saddam's Friendship"
                , "Baghdad")
                ,new Room(1, 20, 1, new Date(2017, 8, 2), "The Bookstore"
                , "Pripyat")
                ,new Room(1, 1000, 1, new Date(2017, 7, 4), "The Mended Drum"
                , "Ankh-Morpork")
        };
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] result=new Room[0];
        for (Room room : rooms) {
            if (room.getPrice() == price && room.getPersons() == persons && city.equals(room.getCityName())
                    && hotel.equals(room.getHotelName())) {
                result=addRoomToArray(result,room);
            }
        }
        return result;
    }

    @Override
    public Room[] getAllRooms() {
        return rooms;
    }

    private Room[] addRoomToArray (Room[] roomArray, Room room) {
        int oldArrayLen = roomArray.length;
        Room[] result;
        if(roomArray.length>0) {
            result = new Room[oldArrayLen + 1];
            System.arraycopy(roomArray, 0, result, 0, oldArrayLen);
            result[oldArrayLen] = room;
        }
        else{
            result = new Room[] {room};
        }

        return result;
    }

}
