package crazyjedi.homeWork03.Task3;

/**
 * Created by Vlad on 09.02.2017.
 */
public class SpecialStudent extends CollegeStudent {

    private long secretKey;
    private String email;

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
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
