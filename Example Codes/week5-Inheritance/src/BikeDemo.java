
public class BikeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle generalbike= new Bicycle();
		MountainBike bm=new MountainBike(7,"Hard",3,4.0f,2);
		RoadBike rd=new RoadBike();
		generalbike.setCadence(3);
		System.out.println("Bicycle calling"+generalbike.getCadence());
		
		//bm.setCadence(7);
		//bm.setSuspension(4);
		System.out.println("Mountain Bicycle calling"+bm.getCadence());
		System.out.println("Mountain Bicycle calling"+bm.getSuspension());
		
		rd.setCadence(4);
		System.out.println("Road Bicycle calling"+rd.getCadence());
		
		bm.printDescription();
	}
	

}
