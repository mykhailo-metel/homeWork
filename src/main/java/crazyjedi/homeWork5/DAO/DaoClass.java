package crazyjedi.homeWork5.DAO;

import crazyjedi.homeWork5.Room;

/**
 * Created by Vlad on 28.02.2017.
 */
public class DaoClass implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println(String.format("save: %s", this.getClass()));
        return null;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(String.format("delete: %s", this.getClass()));
        return false;
    }


    @Override
    public Room update(Room room) {
        System.out.println(String.format("update: %s", this.getClass()));
        return null;
    }

    @Override
    public Room findById(long id) {
        System.out.println(String.format("findById: %s", this.getClass()));
        return null;
    }
}
