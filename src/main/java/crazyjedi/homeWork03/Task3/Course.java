package crazyjedi.homeWork03.Task3;

import java.util.Date;

/**
 * Created by Vlad on 09.02.2017.
 */
public class Course {

    private Date startDate = new Date();
    private String name = "";
    private int hoursDuration = 0;
    private String teacherName = "";

    public Course(Date startDate, String name) {
        if("".equals(name)){//так можно не проверять на null, запись выходит короче.
            throw new IllegalArgumentException("Insert valid (not null and not empty) name!");
        }
        this.startDate = startDate;
        this.name = name;
    }

    public Course(String name, int hoursDuration, String teacherName) {
        if("".equals(name)){
            throw new IllegalArgumentException("Insert valid (not null and not empty) name!");
        }
        if("".equals(teacherName)){
            throw new IllegalArgumentException("Insert valid (not null and not empty) teacherName!");
        }
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }

    //GETTERS

    public Date getStartDate() {
        return startDate;
    }

    public String getName() {
        return name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    //SETTERS

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
