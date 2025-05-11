package compositeDesignPattern;
import java.util.ArrayList;
import java.util.List;

public class Student implements OrganizationalUnit {
    private String name;
    private String studentID;
    private double tuitionFee;

    public Student(String name, String studentID, double tuitionFee) {
        this.name = name;
        this.studentID = studentID;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student: " + name + ", ID: " + studentID + ", Tuition Fee: $" + tuitionFee);
    }

    @Override
    public int getStudentCount() {
        return 1;
    }

    @Override
    public double calculateBudget() {
        return -tuitionFee;
    }
}
