
public class InsurancePolicy {
	private final double selfDamageCover;
	private final double oncomingDamageCover;
	private boolean policyExpired;
	
	public InsurancePolicy (double selfDamage, double oncomingDamage) {
		this.selfDamageCover = selfDamage;
		this.oncomingDamageCover = oncomingDamage;
		policyExpired = false;
	}
	
	public double getSelfDamageCover () {
		return this.selfDamageCover;
	}
	
	public double getOncomingDamageCover () {
		return this.oncomingDamageCover;
	}
	
	public void setPolicyExpired () {
		this.policyExpired = true;
	}
	
	public boolean hasPolicyExpired () {
		return this.policyExpired;
	}
}
