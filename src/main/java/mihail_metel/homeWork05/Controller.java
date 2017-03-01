package homeWork05;

/*
TASK 6
Create Controller class. It contains global variable
API apis[] = new API[3];
which contains all impelentations of API interface.
Also, controller contains two methods
Room[] requstRooms(int price, int persons, String city, String hotel)
which finds all the rooms with requested params. Method use all apis available to make search.
Found rooms create to DB
Room[] check(API api1, API api2)
Chech how many the same rooms two different apis return
 */

public class Controller implements API {
    API apis[] = new API[3];

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }

    public Room[] requstRooms(int price, int persons, String city, String hotel){
        return new Room[0];
    }

    Room[] check(API api1, API api2){
        return new Room[0];
    }
}
