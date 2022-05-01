
public class Bicycle {
	private double speed;
	private int cadence;
	private int gear;
	
	Bicycle(){
	    this(0,0,0);
			 
	}
	
	Bicycle(double speed, int cadence,int gear){
		this.speed=speed;
		this.cadence=cadence;
		this.gear=gear;
	}
	
	Bicycle(Bicycle b){
		this.speed=b.getSpeed();
		this.cadence=b.getCadence();
		this.gear=b.getGear();
	}
	
	public void setSpeed(double speed) {
		this.speed=speed;
	}
	public void setGear(int gear) {
		this.gear=gear;
	}
	public void setCadence(int cad) {
		this.cadence=cad;
	}
	
	public double getSpeed() {
		return this.speed;
	}
	public int getCadence() {
		return this.cadence;
	}
	public int getGear() {
		return this.gear;
	}
	public void printDescription (){
		System.out.println("Bike is " + "in gear " + this.getGear() + "with a cadence of " + this.getCadence() + " and travelling at a speed of "
		+ this.getSpeed() + ". ");
		}
		
}
