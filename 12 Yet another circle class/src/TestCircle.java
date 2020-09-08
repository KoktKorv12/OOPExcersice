import java.awt.*;

/**
 *  A Test Driver for the Circle class
 */
public class TestCircle {  // Save as "TestCircle.java"
    public static void main(String[] args) {
        // Declare an instance of Circle class called c1.
        // Construct the instance c1 by invoking the "default" constructor
        // which sets its radius and color to their default value.
        Circle c1 = new Circle();
        // Invoke public methods on instance c1, via dot operator.
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and circumreference of " + c1.getCircumreference());
        //The circle has radius of 1.0 and area of 3.141592653589793

        // Declare an instance of class circle called c2.

        System.out.println("The color of the circle is " + c1.getColor());
    }
}