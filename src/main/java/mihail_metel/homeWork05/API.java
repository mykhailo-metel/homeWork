package homeWork05;

/*
TASK  3
Create API interface which contains one method
Room[] findRooms(int price, int persons, String city, String hotel)
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
}