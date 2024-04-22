public class Employee {
    protected String name;
    protected String surname;
    protected String address;
    protected String email;
    protected String PESEL;
    protected int yearOfEmployment;

    public Employee(String name, String surname, String address, String email, String PESEL, int yearOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.PESEL = PESEL;
        this.yearOfEmployment = yearOfEmployment;
    }

    public int calculateSalary() {
        int baseSalary = 3000;
        int yearsWorked = 2024 - yearOfEmployment;
        int totalSalary = baseSalary + (yearsWorked * 1000);
        return totalSalary;
    }
}
