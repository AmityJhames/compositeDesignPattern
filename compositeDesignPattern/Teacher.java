package compositeDesignPattern;
import java.util.ArrayList;
import java.util.List;

public class Teacher implements OrganizationalUnit {
    private String name;
    private String subject;
    private double salary;
    private List<Student> students = new ArrayList<>();

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public void displayDetails() {
        System.out.println("Teacher: " + name + ", Subject: " + subject + ", Salary: $" + salary);
        for (Student student : students) {
            student.displayDetails();
        }
    }

    @Override
    public int getStudentCount() {
        return students.size();
    }

    @Override
    public double calculateBudget() {
        double budget = salary;
        for (Student student : students) {
            budget += student.calculateBudget();
        }
        return budget;
    }
}
