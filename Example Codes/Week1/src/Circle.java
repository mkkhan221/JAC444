import java.util.Scanner;

public class Circle {
	
	private double radius;
	
	Circle(){
		radius=0;
	}
	Circle(double radius){
		this.radius=radius;
	}
	Circle(Circle c){
		this.radius=c.radius;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r;
		
		Circle c=new Circle(5);
		System.out.println("the radius for Circle 1 is "+c.getRadius());
		Circle ncircle=new Circle(c);
		System.out.println("the radius for Circle 2 is "+ncircle.getRadius());
		
		c.setradius(ncircle.getRadius()); // copying by ref
		
		System.out.println("the radius for Circle 1 is "+c.getRadius());
		
		Scanner input=new Scanner(System.in);
		//getRadius()
		System.out.print("Enter radius for Circle 1");
		
		r=input.nextDouble();
		c.setradius(r);
		System.out.print("Enter radius for Circle 2");
		
		r=input.nextDouble();
		ncircle.setradius(r);
		
		if (c.getRadius()==ncircle.getRadius()) {
			System.out.print("Circle 1 and Circle 2 are same");
		}
		else 
		{
			System.out.print("Circle 1 and Circle 2 are different");
		}
		System.out.print("The area of circle with radius="+c.getRadius()+"is="+c.getArea());
	}
	
	public double getRadius() {
		return radius;
	}
	public void setradius(double r) {
		radius=r;
	}
	public double getArea() {
		return computeArea();
	}
	private double computeArea() {
		
		return 3.14*radius * radius;
	}

}
