class Person {
	
    private String name;
    private int id;

    public Person(String name, int id) {
    this.name = name;
    this.id = id;
    }
        public String getName() {
        return name;
    }

        public int getId() {
        return id;
    }

        public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    }
    
    // Main class 
    public class SchoolTest {
        public static void main(String[] args) {
            Person per = new Person("Raquiren", 18);
            per.displayInfo();

            Student stud = new Student("Raquiren", 18, "12th Grade");
            stud.displayInfo();

            Teacher tea = new Teacher("Mr. Chie", 18, "OOP");
            tea.displayInfo();

            Staff sta = new Staff("Wolverin", 18, "Guard");
            sta.displayInfo();
       
        }
        
    }

   
