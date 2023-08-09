package grades;

public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student("Jane");
        Student student2 = new Student("Jasmine");

        student1.addGrade(88);
        student1.addGrade(56);
        student1.addGrade(73);
        student1.addGrade(90);

        student2.addGrade(87);
        student2.addGrade(95);
        student2.addGrade(100);

        System.out.println(student1.getName() + "'s grade average is " + student1.getGradeAverage());
        System.out.println(student2.getName() + "'s grade average is " + student2.getGradeAverage());


    }
}

