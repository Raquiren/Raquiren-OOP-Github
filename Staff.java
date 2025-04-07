public class Staff extends Person {
    
    private String department;

    // Constructor
    public Staff(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
