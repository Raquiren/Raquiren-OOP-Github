public class Salesperson extends Employee {

	private double commissionPercentage;

	public Salesperson(String name, int age, double salary, double commission) {
		super(name, age, salary);
		this.commissionPercentage = commissionPercentage;
		
	}

	public double getComissionPercentage() {
		return this.commissionPercentage;
	}

	public void raiseComission() {
		if (this.commissionPercentage < 20) {
			this.commissionPercentage += salary; 
		}
	}
}
