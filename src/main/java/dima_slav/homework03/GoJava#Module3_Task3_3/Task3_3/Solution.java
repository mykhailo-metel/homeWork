package Task3_3;


import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        // Объекты Course
        Date startDate = new Date();
        Course[] course = new Course[6];
        course[0] = new Course("Биология", 48, "Иванов");
        course[1] = new Course("Химия", 48, "Петров");
        course[2] = new Course("География", 116, "Сидоров");
        course[3] = new Course("Информатика", 202, "Иваненко");
        course[4] = new Course("Тайм менеджмент", 48, "Петренко");
        course[5] = new Course(startDate, "экономика");

        //Объекты Student
        //----------------------------------------------------------------------------------
        Student st1 = new Student("Василий", "Васильев", 21);
        Student st2 = new Student("Васильев", course);


        //Объекты CollegeStudent
        //----------------------------------------------------------------------------------
        CollegeStudent CS1 = new CollegeStudent("Сергей", "Сергеев", 14);
        CollegeStudent CS2 = new CollegeStudent("Сергеев", course);
        CollegeStudent CS3 = new CollegeStudent("КПИ", 1, 10001);


        //Объекты SpecialStudent
        //----------------------------------------------------------------------------------
        SpecialStudent SS1 = new SpecialStudent("Максим", "Максимов", 7);
        SpecialStudent SS2 = new SpecialStudent("Максимов", course);
        SpecialStudent SS3 = new SpecialStudent(12345);

    }
}


