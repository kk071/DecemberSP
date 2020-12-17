package rd.epam.com;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList();

        Student student = new Student("Андрей", "Юрьевич");
        student.setGroup(Group.FIRST);
        student.setSecondName("Иванов");

        students.add(student);
Student student = new Student("Максим", "Сергеевич");
        student.setGroup(Group.FIRST);
        student.setSecondName("Чумаков");

        students.add(student);
        students.forEach(System.out::println);
    }
}
