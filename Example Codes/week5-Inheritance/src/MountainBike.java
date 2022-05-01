
public class MountainBike extends Bicycle {
		private int suspension;
		private String wheelType;
		
		MountainBike(){
			this(1,"spiked",0,0.0f,0);
		}
		MountainBike(int s, String wt, int gear, float speed, int cad){
			super(gear,speed,cad);
			this.suspension=s;
			this.wheelType=wt;
		}
		public void setSuspension(int s) {
			this.suspension=s;
		}
		public void setWheelType(String wt) {
			this.wheelType=wt;
		}
		public int getSuspension() {
			return this.suspension;
		}
		public String getWheelType() {
			return this.wheelType;
		}
		@Override
		public void printDescription (){
			super.printDescription();
			System.out.println("and"+this.suspension );
			}
			
}
