package crazyjedi.homeWork5.DAO;

import crazyjedi.homeWork5.Room;

/**
 * Created by Vlad on 28.02.2017.
 */
public interface DAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
}
