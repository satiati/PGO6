import java.util.ArrayList;
import java.util.List;

public class Tester extends Employee {
    private List<String> testTypes;

    public Tester(String name, String surname, String address, String email, String PESEL, int yearOfEmployment) {
        super(name, surname, address, email, PESEL, yearOfEmployment);
        this.testTypes = new ArrayList<>();
    }

    public void addTestType(String testType) {
        testTypes.add(testType);
    }

    @Override
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        int additionalBonus = testTypes.size() * 300;
        return baseSalary + additionalBonus;
    }
}
