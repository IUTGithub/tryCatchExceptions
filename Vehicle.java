
public class Vehicle {
	protected double gasmileage;
	protected double type;
	protected double numperson;
	public Vehicle (double gmileage, int vehicleType) {
		gasmileage = gmileage;
		type = vehicleType;
	}
	public boolean driveOnHOV(int numPerson) {
		if (numPerson > 1) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public String toString() {
		return String.format("%s with %.2f", this.type, this.gasmileage);
	}
	
}
