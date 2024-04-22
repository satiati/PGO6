import java.time.LocalDate;

public class Goal {
    private String name;
    private LocalDate date;
    private int bonusAmount;

    public Goal(int year, int month, int dayOfMonth, String name, int bonusAmount) {
        this.date = LocalDate.of(year, month, dayOfMonth);
        this.name = name;
        this.bonusAmount = bonusAmount;
    }

    public boolean isAchieved() {
        return LocalDate.now().isAfter(date);
    }

    public int getBonus() {
        return isAchieved() ? bonusAmount : 0;
    }
}
