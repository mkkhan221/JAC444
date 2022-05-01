

public class InnerClassExample {
	int x = 20;
	static int y = 50;
	private int z = 60;

	InnerClass obj = new InnerClass();
	public void outerMethod() {
		System.out.println("I am from outer class");
		System.out.println("Outer class can call the inner variables"+ obj.x
				+"and static outer"+ InnerClass.in_y + "and private variables" + obj.getIn_z());
	}
	
	class InnerClass{
		int x = 10;
		static final int in_y = 15;
		private int in_z = 25;
		public void outerMethod() {
			System.out.println("I am from Inner Class");
			System.out.println("Inne class can call the outer variables"+ x
					+"and static outer"+y + "and private variables" + z);
		}
		public int getIn_z() {
			return in_z;
		}
		public void setIn_z(int in_z) {
			this.in_z = in_z;
		}
	}
}

