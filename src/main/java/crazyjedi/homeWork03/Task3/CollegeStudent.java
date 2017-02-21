package crazyjedi.homeWork03.Task3;

/**
 * Created by Vlad on 09.02.2017.
 */
public class CollegeStudent extends Student {
    protected String collegeName;
    protected int rating;
    protected long id;

    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    //Constructor with all fields
    public CollegeStudent(String firstName, String lastName, int age, int group, Course[] coursesTaken, String collegeName, int rating, long id) {
        super(firstName, lastName, group);
        this.setAge(age);
        this.setCoursesTaken(coursesTaken);
        if ("".equals(collegeName)) {
            throw new IllegalArgumentException("College name must not be empty");
        }
        if (rating < 0) {
            throw new IllegalArgumentException("Rating can not be less then 0.");
        }
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    //GETTERS AND SETTERS

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        if ("".equals(collegeName)) {
            throw new IllegalArgumentException("College name must not be empty");
        }
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating < 0) {
            throw new IllegalArgumentException("Rating can not be less then 0.");
        }
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (id < 0) {
            throw new IllegalArgumentException("ID can not be less then 0.");
        }
        this.id = id;
    }
}
