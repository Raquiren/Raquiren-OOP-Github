public class Student extends Person {

    private String gradeLevel;

    // Constructor
    public Student(String name, int id, String gradeLevel) {
        super(name, id);
        this.gradeLevel = gradeLevel;
    }

    public String getGradeLevel() {
        return this.gradeLevel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade Level: " + gradeLevel);
    }
}
