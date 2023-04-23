
public class EnginePoweredVehicle extends Vehicle {
	public EnginePoweredVehicle (String name, int numWheels, InsurancePolicy policy) {
		super (name, numWheels);
		setInsurancePolicy (policy);
	}
}
