package homeWork05;

/*
TASK  3
Create API interface which contains one method
Room[] findRooms(int price, int persons, String city, String hotel)
 */
public interface API_findRooms {
    Room[] findRooms(int price, int persons, String city, String hotel);
}
