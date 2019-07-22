package staff;

public abstract class Employee {

    private String name;
    private String NINumber;
    protected int salary;

    public Employee(String name, String NINumber, int salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNINumber() {
        return NINumber;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(Double percentRaise) {
        if(percentRaise > 0) {
            this.salary *= 1 + (percentRaise / 100);
        }
    }

    public int payBonus() {
        return this.salary / 100;
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
    }
}
