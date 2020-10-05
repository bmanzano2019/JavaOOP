import model.Student;
import model.GenderTypes;

public class Main {
    public static void main (String[] args) {
        Student regularStudent;
        Student topStudent;

        regularStudent = new Student("Henry", 18, GenderTypes.MALE, "ST323123");
        topStudent = new Student( "Ellie", 17, GenderTypes.FEMALE, "ST123678");

        System.out.println("my name is " + regularStudent.getName() + ", a " + regularStudent.getGender());
        System.out.println("age is " + regularStudent.getAge() + " and my IDNo is " + regularStudent.getIdNo() + "\n");

        System.out.println("and my name is " + topStudent.getName() + ", a " + topStudent.getGender());
        System.out.println("age is " + topStudent.getAge() + " and my IDNo is " + topStudent.getIdNo() + "\n");

        System.out.println("our ages combined is in total " + (regularStudent.getAge() + topStudent.getAge()));
    }
}
