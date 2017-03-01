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
        apis[0]=new BookingComAPI();
        apis[1]=new GoogleAPI();
        apis[2]=new TripAdvisorAPI();
    }

    public List<Room> requstRooms(int price, int persons, String city, String hotel) {
        List<Room> result = new ArrayList<Room>();
        for (API api : apis) {
            for (Room room : api.findRooms(price,persons,city,hotel)) {
                result.add(room);
            }
        }
        return result;
    }

    ;

    public int check(API api1, API api2) {
        int result=0;
        for (Room room : api1.getAllRooms()) {
            for (Room room1 : api2.getAllRooms()) {
                if (room.equals(room1)){
                    result++;
                }
            }
        }
        return result;
    }

    ;
}
