
class CircleSphereCalculator {
    private static final double PI = 3.14159; // Immutable value of PI
    private double radius; // Mutable radius

   
    public CircleSphereCalculator(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

   
    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    public double calculateAreaOfCircle() {
        return PI * radius * radius;
    }

    public double calculateVolumeOfSphere() {
        return (4.0 / 3.0) * PI * Math.pow(radius, 3);
    }

    
    public double calculateSurfaceAreaOfSphere() {
        return 4 * PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
       
        CircleSphereCalculator calculator = new CircleSphereCalculator(16.0); 

        System.out.println("Calculations for Radius: " + calculator.getRadius());
        System.out.println("Circumference of Circle: " + calculator.calculateCircumference());
        System.out.println("Area of Circle: " + calculator.calculateAreaOfCircle());
        System.out.println("Volume of Sphere: " + calculator.calculateVolumeOfSphere());
        System.out.println("Surface Area of Sphere: " + calculator.calculateSurfaceAreaOfSphere());

        // Update radius and recalculate
        calculator.setRadius(7.0); // Update radius to 7
        System.out.println("\nUpdated Calculations for Radius: " + calculator.getRadius());
        System.out.println("Circumference of Circle: " + calculator.calculateCircumference());
        System.out.println("Area of Circle: " + calculator.calculateAreaOfCircle());
        System.out.println("Volume of Sphere: " + calculator.calculateVolumeOfSphere());
        System.out.println("Surface Area of Sphere: " + calculator.calculateSurfaceAreaOfSphere());
    }
}
