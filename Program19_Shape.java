// Design a class hierarchy for a shape. Create a base class Shape with methods area() and perimeter(). Derive classes Circle, Rectangle, and Triangle from Shape. Implement the necessary methods in each derived class. Create objects of each class and calculate the area and perimeter for each.

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

    double perimeter(float rad) {
        return (2 * Math.PI * rad);
    }

    double area(double rad) {
        return (Math.PI * Math.pow(rad, 2));
    }
}

public class Program19_Shape {

}
