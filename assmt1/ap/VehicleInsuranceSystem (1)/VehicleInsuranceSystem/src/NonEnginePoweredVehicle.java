
public class NonEnginePoweredVehicle extends Vehicle {

	public NonEnginePoweredVehicle(String name, int numWheels) {
		super(name, numWheels);
		//this.insurancePolicy = new NullPolicy ();
	}

	public void setInsurancePolicy(InsurancePolicy policy) {
		System.out.println("Non-engine-powered vehicles cannot have any insurance policy.");
	}

}
