package crazyjedi.homeWork03.Task3;

/**
 * Created by Vlad on 09.02.2017.
 */
public class Student {

    private String firstName = "";
    private String lastName = "";
    private int group = 0;
    private Course[] coursesTaken;
    private int age = 0;


    public Student(String firstName, String lastName, int group) {
        if ("".equals(firstName) || "".equals(lastName)) {
            throw new IllegalArgumentException("firstName and lastName must not be empty");
        }
        if (group <= 0) {
            throw new IllegalArgumentException("Group number must be > 0");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student(String lastName, Course[] coursesTaken) {
        if ("".equals(lastName)) {
            throw new IllegalArgumentException("lastName must not be empty");
        }
        if (coursesTaken == null || coursesTaken.length == 0) {
            throw new IllegalArgumentException("Course list mast not be empty");
        }
        for (Course course : coursesTaken) {
            if (course == null) {
                throw new IllegalArgumentException("One of courses was not defined");
            }
        }
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }

    //GETTERS AND SETTERS

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if ("".equals(firstName)) {
            throw new IllegalArgumentException("lastName must not be empty");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if ("".equals(lastName)) {
            throw new IllegalArgumentException("lastName must not be empty");
        }
        this.lastName = lastName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        if (group <= 0) {
            throw new IllegalArgumentException("Group number must be > 0");
        }
        this.group = group;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        if (coursesTaken == null || coursesTaken.length == 0) {
            throw new IllegalArgumentException("Course list mast not be empty");
        }
        for (Course course : coursesTaken) {
            if (course == null) {
                throw new IllegalArgumentException("One of courses was not defined");
            }
        }
        this.coursesTaken = coursesTaken;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age number must be > 0");
        }
        this.age = age;
    }

}
