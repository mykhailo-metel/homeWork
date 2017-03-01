package crazyjedi.homeWork5.api;

import crazyjedi.homeWork5.Room;

import java.util.ArrayList;

/**
 * Created by Vlad on 27.02.2017.
 */
public interface API {
    public ArrayList<Room> findRooms(int price, int persons, String city, String hotel);
    public Room[] getAllRooms();
}
