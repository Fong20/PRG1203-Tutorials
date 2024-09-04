package Lab13;

public class Staff extends Person {
	//Create attributes
	private String school;
	private double pay;
	
	//Create constructor
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}
	
	//Setters and getters
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}
	
	//if the staff stays in Selangor (staff’s address contains “Selangor”), give additional 200 allowances.
	public void setPay(double pay) {
		if (getAddress().equals("Selangor")) {
			this.pay = pay + 200;
		}
		
		else {
			this.pay = pay;
		}
	}
	
	@Override
	public String toString() {
		return String.format("Staff [%s], school= %s , pay= %.2f", super.toString(), school, pay);
	}
	

}
