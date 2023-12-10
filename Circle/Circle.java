package Circle;

public class Circle {
    private double radius;
    
    public Circle(double radius) {
        if (radius > 0) {
        	this.radius = radius;
        } else {
        	System.out.println("\nTry again! Radius must be greater than 0.");
        }
    }
 
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        if (radius > 0) {
         this.radius = radius;
        } else {
         System.out.println("\nTry again! Radius must be greater than 0.");
        }
    }
    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4);
 
        double area = circle.calculateArea();
        System.out.println("Area of the circle: " + area);

        double circumference = circle.calculateCircumference();
        System.out.println("Circumference of the circle: " + circumference);

        circle.setRadius(16); 
        area = circle.calculateArea();
        circumference = circle.calculateCircumference();

        if (circle.getRadius() > 0) {
            System.out.println("\nUpdated radius of the circle: " + circle.getRadius());
            System.out.println("Updated area of the circle: " + area);
            System.out.println("Updated circumference of the circle: " + circumference);
        }
    }
}



