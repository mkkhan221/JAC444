import java.lang.IllegalArgumentException;

public class CircleException {
	 /** The radius of the circle */
	  private double radius;

	  /** The number of the objects created */
	  private static int numberOfObjects = 0;

	  /** Construct a circle with radius 1 */
	  public CircleException() {
	    this(1.0);
	  }

	  /** Construct a circle with a specified radius */
	  public CircleException(double newRadius) {
		  try {
		  setRadius(newRadius);
	    numberOfObjects++;
		  }
		  catch(IllegalRadiusException e) {
			  System.out.println(e);
		  }
	  }

	  /** Return radius */
	  public double getRadius() {
	    return radius;
	  }

	  /** Set a new radius */
	  public void setRadius(double newRadius) throws IllegalRadiusException {
		  if (newRadius >0) {
			  radius=newRadius;
		  }
		  else {
	      throw new IllegalRadiusException();
		  }
	  }

	  /** Return numberOfObjects */
	  public static int getNumberOfObjects() {
	    return numberOfObjects;
	  }

	  /** Return the area of this circle */
	  public double findArea() {
	    return radius * radius * 3.14159;
	  }
}
