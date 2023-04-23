
public class Vehicle {
	private String ownerName;
	private final int numberOfWheels;
	private double damages;
	protected InsurancePolicy insurancePolicy;
	
	public Vehicle (String name, int numWheels) {
		this.ownerName = name;
		this.numberOfWheels = numWheels;
	}
	
	public String getOwnerName () {
		return ownerName;
	}
	
	public int getNumberOfWheels () {
		return numberOfWheels;
	}
	
	public InsurancePolicy getInsurancePolicy () {
		return insurancePolicy;
	}
	
	public double getDamages () {
		return this.damages;
	}	
	
	public void setInsurancePolicy (InsurancePolicy policy) {
		this.insurancePolicy = policy;
	}
	
	public void setDamages (double damageAmount) {
		this.damages = damageAmount;
	}
	
	public void settle (InsurancePolicy oncomingVehiclePolicy) {
		double selfDamageCover = this.getInsurancePolicy ().getSelfDamageCover ();
		double oncomingDamageCover = oncomingVehiclePolicy.getOncomingDamageCover ();
		this.setDamages ((1 - selfDamageCover) * (1 - oncomingDamageCover) * this.getDamages ());
	}
}