// Design a class hierarchy for a shape. Create a base class Shape with methods area() and perimeter(). Derive classes Circle, Rectangle, and Triangle from Shape. Implement the necessary methods in each derived class. Create objects of each class and calculate the area and perimeter for each.
// Date : 10/01/2024, Author : Yash Wadhvani

class Shape {
    double area() {
        return 0.0d;
    }

    double perimeter() {
        return 0.0d;
    }
}

class Circle extends Shape {
    double rad;

    Circle(double rad) {
        this.rad = rad;
    }

    @Override
    double perimeter() {
        return (2 * Math.PI * this.rad);
    }

    @Override
    double area() {
        return (Math.PI * Math.pow(this.rad, 2));
    }

    void displayMetrics() {
        System.out.println(String.format("Radius of Circle= %.2f", this.rad));
        System.out.println(String.format("Perimeter of Circle = %.2f", this.perimeter()));
        System.out.println(String.format("Area of Circle = %.2f", this.area()));
        System.out.println();
    }
}

class Rectangle extends Shape {
    double height, width;

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    double perimeter() {
        return (2 * (this.height + this.width));
    }

    @Override
    double area() {
        return (this.height * this.width);
    }

    void displayMetrics() {
        System.out.println(String.format("Height of Rectangle = %.2f", this.height));
        System.out.println(String.format("Width of Rectangle = %.2f", this.width));
        System.out.println(String.format("Perimeter of Rectangle = %.2f", this.perimeter()));
        System.out.println(String.format("Area of Rectangle = %.2f", this.area()));
        System.out.println();
    }
}

class Triangle extends Shape {
    double side;

    Triangle(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return ((Math.sqrt(3) / 4) * Math.pow(this.side, 2));
    }

    @Override
    double perimeter() {
        return (3 * this.side);
    }

    void displayMetrics() {
        System.out.println(String.format("Side of Triangle = %.2f", this.side));
        System.out.println(String.format("Perimeter of Triangle = %.2f", this.perimeter()));
        System.out.println(String.format("Area of Triangle = %.2f", this.area()));
        System.out.println();
    }
}

public class Program19_Shape {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.displayMetrics();

        Rectangle rectangle = new Rectangle(15, 20);
        rectangle.displayMetrics();

        Triangle triangle = new Triangle(5);
        triangle.displayMetrics();
    }
}
