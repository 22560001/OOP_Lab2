package Rectangle;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width > 0 && height > 0) {
        	this.width = width;
            this.height = height;
        } else {
        	System.out.println("\nTry again! Width and height must be greater than 0.");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
        	this.width = width;
        } else {
        	System.out.println("\nTry again! Width must be greater than 0.");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
        	this.height = height;
        } else {
        	System.out.println("\nTry again! Height must be greater than 0.");
        }
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(16, 25);
        
        double area = rectangle.calculateArea();
        if (area > 0) {
            System.out.println("Area of the rectangle: " + area);
        }

        double perimeter = rectangle.calculatePerimeter();
        if (perimeter > 0) {
            System.out.println("Perimeter of the rectangle: " + perimeter);
        }

        rectangle.setWidth(10);
        rectangle.setHeight(16);
       
        if (rectangle.getWidth() > 0 && rectangle.getHeight() > 0) {
            area = rectangle.calculateArea();
            perimeter = rectangle.calculatePerimeter();
            System.out.println("\nUpdated width of the rectangle: " + rectangle.getWidth());
            System.out.println("Updated height of the rectangle: " + rectangle.getHeight());
            System.out.println("Updated area of the rectangle: " + area);
            System.out.println("Updated perimeter of the rectangle: " + perimeter);
        }
    }
}


