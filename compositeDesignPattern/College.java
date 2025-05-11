package compositeDesignPattern;
import java.util.ArrayList;
import java.util.List;

public class College implements OrganizationalUnit {
    private String name;
    private List<OrganizationalUnit> units = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void addUnit(OrganizationalUnit unit) {
        units.add(unit);
    }

    public void removeUnit(OrganizationalUnit unit) {
        units.remove(unit);
    }

    @Override
    public void displayDetails() {
        System.out.println("College: " + name);
        for (OrganizationalUnit unit : units) {
            unit.displayDetails();
        }
    }

    @Override
    public int getStudentCount() {
        int count = 0;
        for (OrganizationalUnit unit : units) {
            count += unit.getStudentCount();
        }
        return count;
    }

    @Override
    public double calculateBudget() {
        double budget = 0;
        for (OrganizationalUnit unit : units) {
            budget += unit.calculateBudget();
        }
        return budget;
    }
}

