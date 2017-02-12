package Homework3_3;

import java.util.Date;


public class Solution {

    public static void main(String[] args) {

        Date startDate1 = new Date();

        Course course1 = new Course("Math", 200, "Petr");
        Course course2 = new Course("History", 250, "Petr2");
        Course course3 = new Course (startDate1, "English");
        Course course4 = new Course("Programming", 300,
                "Petr: The return of the legend");
        Course course5 = new Course("Defusing bombs with a hammer",
                1, "Petr Forever");

        Course[] coursesTaken1 = {course1, course2};
        Course[] coursesTaken2 = {course3, course4, course5};

        Student student1 = new Student("John", "Snow", 1);
        Student student2 = new Student("Stark", coursesTaken1);

        CollegeStudent collegeStudent1 = new CollegeStudent("Tirion", "Lannister", 43);
        CollegeStudent collegeStudent2 = new CollegeStudent("Frey", coursesTaken2);
        CollegeStudent collegeStudent3 = new CollegeStudent("Ruse", "Bolton", 6549,
                "Stark Academy", 3, 55584);

        SpecialStudent specialStudent1 = new SpecialStudent("Katlin", "Stark", 87);
        SpecialStudent specialStudent2 = new SpecialStudent ("Arya", "Stark",
                6, "Temple of The Many-Faced God", 1, 6548);
        SpecialStudent specialStudent3 = new SpecialStudent("Robert", "Barateon",
                45, 6767);
    }
}
