package homeWork05;

/**
 * Created by fluent on 27.02.2017.
 */
public interface HotelsDAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
}
