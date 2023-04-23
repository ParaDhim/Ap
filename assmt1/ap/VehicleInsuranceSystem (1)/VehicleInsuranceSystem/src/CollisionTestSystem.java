import java.util.ArrayList;

public class CollisionTestSystem {

	public static void collide (Vehicle v1, Vehicle v2) {
		v1.settle(v2.getInsurancePolicy());
		v2.settle(v1.getInsurancePolicy());
	}
	
	public static void main (String[] args) {
		Vehicle car1 = new FourWheelerEnginePoweredVehicle("Honda Civic 01");
		car1.getInsurancePolicy().setPolicyExpired();
		Vehicle car2 = new FourWheelerEnginePoweredVehicle("Hyundai Verna 02");
		
		Vehicle bike1 = new TwoWheelerEnginePoweredVehicle("Hero Splendour 03", new PackageInsurancePolicy());
		bike1.getInsurancePolicy().setPolicyExpired();
		Vehicle bike2 = new TwoWheelerEnginePoweredVehicle("Bajaj Pulsar 04", new ThirdPartyInsurancePolicy());
		
		Vehicle cycle = new NonEnginePoweredVehicle("Atlas 05", 2);
		Vehicle rickshaw = new NonEnginePoweredVehicle("Chetak 06", 3);
		
		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
		vehicleList.add(car1);
		vehicleList.add(car2);
		vehicleList.add(bike1);
		vehicleList.add(bike2);
		vehicleList.add(cycle);
		vehicleList.add(rickshaw);
		
		for(int i = 0; i < vehicleList.size() - 1; i++)
			for(int j = i + 1; j < vehicleList.size(); j++) {
				Vehicle v1 = vehicleList.get(i);
				Vehicle v2 = vehicleList.get(j);
				System.out.println(v1);
				System.out.println(v1.getInsurancePolicy());
				System.out.println(v1.getDamages());
				System.out.println(v2);
				System.out.println(v2.getInsurancePolicy());
				System.out.println(v2.getDamages());
				collide (v1, v2);
				System.out.println("----------------------------------------------");
				System.out.println(v1.getDamages());
				System.out.println(v2.getDamages());
				System.out.println("----------------------------------------------");
				System.out.println();
			}
	}

}
