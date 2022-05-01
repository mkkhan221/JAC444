
public class Bicycle {
	protected int gear;
	protected float speed;
	protected int cadence;
	protected static int a;
	
	Bicycle(){
		this(0,0.0f,0);
	}
	Bicycle(int gear,float speed, int cadence){
		this.gear=gear;
		this.speed=speed;
		this.cadence=cadence;
	}
	public void setGear(int gear) {
		this.gear=gear;
	}
	public int getGear() {
		return (this.gear);
	}
    public void setSpeed(float speed) {
		this.speed=speed;
	}
	public float getSpeed() {
		return (this.speed);
	}
    public void setCadence(int cad) {
    	this.cadence=cad;
	}
	public int getCadence() {
		return (this.cadence);
	}
	public void printDescription (){
	System.out.println("Bike is " + "in gear " + this.gear + "with a cadence of " + this.cadence + " and travelling at a speed of "
	+ this.speed + ". ");
	}
	
}

