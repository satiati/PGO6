import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private List<Goal> goals;

    public Manager(String name, String surname, String address, String email, String PESEL, int yearOfEmployment) {
        super(name, surname, address, email, PESEL, yearOfEmployment);
        this.goals = new ArrayList<>();
    }

    public void addGoal(Goal goal) {
        goals.add(goal);
    }

    @Override
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        int additionalBonus = 0;
        for (Goal goal : goals) {
            if (goal.isAchieved()) {
                additionalBonus += goal.getBonus();
            }
        }
        return baseSalary + additionalBonus;
    }
}
