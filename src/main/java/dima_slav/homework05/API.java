package dima_slav.homework05;

public interface API {
    Room[]findRooms (int price, int persons,String city, String hotel);
    Room[] getAll();
}
