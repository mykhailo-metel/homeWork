import java.util.Date;

public class Solution {
    public static void main(String[] args) {

        Course[] coursesTaken=new Course[5];
        coursesTaken[0]= new Course(new Date(2016,12,01),"History");
        coursesTaken[1]= new Course(20, "Nina");
        coursesTaken[2]= new Course(new Date(2016,02,03), "English");
        coursesTaken[3]= new Course(40, "Mike");
        coursesTaken[4]= new Course(15, "Jack");

        Student student1 = new Student("Aleks","White",1);
        Student student2 = new Student("Stalone", coursesTaken);

        CollegeStudent collegeStudent1 = new CollegeStudent( "Harvard",8,123987,"Peter","Kisel",2,coursesTaken,18);
        CollegeStudent collegeStudent2 = new CollegeStudent("Vitaliy","Feremik",2);
        CollegeStudent collegeStudent3 = new CollegeStudent("Green",coursesTaken);

        SpecialStudent specialStudent1 = new SpecialStudent("Mihail","Boyko",3);
        SpecialStudent specialStudent2 = new SpecialStudent("Bondarenko",coursesTaken);
        SpecialStudent specialStudent3 = new SpecialStudent("Oxford",9,123456788,"Masha","Ivanov",4,coursesTaken,21,25859457);









    }
}


