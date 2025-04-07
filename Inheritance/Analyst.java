public class Analyst extends Employee {
    
    public Analyst(String name, int age, double salary) {
        super(name, age, salary);
    }

    public double getAnnualBonus() {
        return getSalary() * 0.05; // 5% of salary as annual bonus
    }
}
