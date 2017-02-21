package crazyjedi.homeWork03.Task3;

import java.util.Date;


public class Solution {

    public static void main(String[] args) {

        Course math = new Course(new Date(2017, 9, 1), "Math");
        Course economics = new Course(new Date(2017, 9, 1), "Economics");
        Course literature = new Course(new Date(2017, 9, 1), "Literature");
        Course calculus = new Course(new Date(2017, 9, 1), "Calculus");
        Course computerScience = new Course(new Date(2017, 9, 1), "Computer Science");

        Student firstStudent = new Student("Bob", "Dow", 10);
        Student secondStudent = new Student("Surname", new Course[]{math, economics});

        CollegeStudent firstCollegeStudent = new CollegeStudent("John", "James", 5);
        CollegeStudent secondCollegeStudent = new CollegeStudent("Oktopopulos", new Course[]{calculus, computerScience});
        CollegeStudent thirdCollegeStudent = new CollegeStudent("David", "Bobr", 20, 10
                , new Course[]{literature, math}, "Miskatonic", 583, 2546);
//
        SpecialStudent firstBond = new SpecialStudent("Pavel", "Morozov", 5);
        SpecialStudent secondBond = new SpecialStudent("Nehavtilo", new Course[]{economics, calculus});
        SpecialStudent thirdBond = new SpecialStudent("Gordon", "Freeman", 4, 12232);

    }

}
