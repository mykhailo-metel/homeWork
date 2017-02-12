package crazyjedi.homeWork03.Task3;

/**
 * Created by Vlad on 09.02.2017.
 */
public class SpecialStudent extends CollegeStudent {

    private long secretKey;
    private String email;

    //Constructor 1 from CollegeStudent
    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    //Constructor 2 from CollegeStudent
    public SpecialStudent(String firstName, String lastName, int age, int group, Course[] coursesTaken
            , String collegeName, int rating, long id) {
        super(firstName, lastName, age, group, coursesTaken, collegeName, rating, id);
    }


    //Constructor with SecretKey
    public SpecialStudent(String firstName, String lastName, int group, long secretKey) {
        super(firstName, lastName, group);
        this.secretKey = secretKey;
    }

    //GETTERS AND SETTERS


    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if ("".equals(email)) {
            throw new IllegalArgumentException("Email name must not be empty");
        }
        this.email = email;
    }
}
