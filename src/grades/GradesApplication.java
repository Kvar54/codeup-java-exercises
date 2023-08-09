package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String,Student> students = new HashMap<>();

        Student student1 = new Student("Jane");
        student1.addGrade(88);
        student1.addGrade(56);
        student1.addGrade(73);
        student1.addGrade(90);
        students.put("janEdoe12_1", student1);

        Student student2 = new Student("Jasmine");
        student2.addGrade(87);
        student2.addGrade(95);
        student2.addGrade(100);
        students.put("Jazzy_535", student2);

        Student student3 = new Student("Xavier");
        student3.addGrade(65);
        student3.addGrade(55);
        student3.addGrade(99);
        students.put("XXaVier21X", student3);

        Student student4 = new Student("Tommy");
        student3.addGrade(75);
        student3.addGrade(25);
        student3.addGrade(100);
        students.put("TomatoTom91_9", student4);

        // Accessing the Student objects using their github usernames
        Student jane = students.get("janEdoe12_1");
        Student jasmine = students.get("Jazzy_535");
        Student xavier = students.get("XXaVier21X");
        Student tommy = students.get("TomatoTom91_9");


        System.out.println(jane.getName()+"'s Grade Average is: "+ jane.getGradeAverage());
        System.out.println(jasmine.getName()+"'s Grade Average is: "+ jasmine.getGradeAverage());
        System.out.println(xavier.getName()+"'s Grade Average is: "+ xavier.getGradeAverage());
        System.out.println(tommy.getName()+"'s Grade Average is: "+ tommy.getGradeAverage());




    }
}
