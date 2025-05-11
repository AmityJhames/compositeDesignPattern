package compositeDesignPattern;

public class UniversityClient {
    public static void main(String[] args) {
        // Creating students
        Student s1 = new Student("Alice", "S001", 3000);
        Student s2 = new Student("Bob", "S002", 3200);

        // Creating teachers
        Teacher t1 = new Teacher("Dr. Smith", "Math", 5000);
        Teacher t2 = new Teacher("Dr. Brown", "Physics", 5500);

        // Assigning students to teachers
        t1.addStudent(s1);
        t2.addStudent(s2);

        // Creating a department
        Department csDept = new Department("Computer Science");
        csDept.addUnit(t1);
        csDept.addUnit(t2);

        // Creating a college
        College engineeringCollege = new College("College of Engineering");
        engineeringCollege.addUnit(csDept);

        // Display details
        engineeringCollege.displayDetails();
        System.out.println("Total Students: " + engineeringCollege.getStudentCount());
        System.out.println("Total Budget: $" + engineeringCollege.calculateBudget());
    }
}
