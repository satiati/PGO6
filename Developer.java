import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee {
    private List<Technology> technologies;

    public Developer(String name, String surname, String address, String email, String PESEL, int yearOfEmployment) {
        super(name, surname, address, email, PESEL, yearOfEmployment);
        this.technologies = new ArrayList<>();
    }

    public void addTechnology(Technology technology) {
        technologies.add(technology);
    }

    @Override
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        int additionalBonus = 0;
        for (Technology tech : technologies) {
            additionalBonus += tech.getBonus();
        }
        return baseSalary + additionalBonus;
    }
}
