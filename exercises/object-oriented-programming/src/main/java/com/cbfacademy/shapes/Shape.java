package com.cbfacademy.shapes;
public abstract class Shape {
    protected String shapeName;

    public abstract double area();

    @Override
    public String toString() {
        return shapeName;
    }

    public class Sphere extends Shape {
        private double radius;

        public Sphere(double radius) {
            this.shapeName = "Sphere";
            this.radius = radius;
        }

        @Override
        public double area() {
            return 4 * Math.PI * Math.pow(radius, 2);
        }
    }

    public class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.shapeName = "Rectangle";
            this.length = length;
            this.width = width;
        }

        @Override
        public double area() {
            return length * width;
        }

        public Object getName() {
            return null;
        }
    }

    public class Cylinder extends Shape {
        private double radius;
        private double height;

        public Cylinder(double radius, double height) {
            this.shapeName = "Cylinder";
            this.radius = radius;
            this.height = height;
        }

        @Override
        public double area() {
            return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
        }

        public Object getName() {
            return null;
        }
    }

    public class Paint {
        private Double coverage;

        public Paint(Double coverage) {
            this.coverage = coverage;
        }

        public Double amount(Shape shape) {
            return shape.area() / coverage;
        }
    }

    public class PaintShapes {
        public static void main(String[] args) {
            Rectangle deck = new Rectangle(35, 20);
            Ball ball = new Ball(15);
            Cylinder tank = new Cylinder(10, 30);

            Paint paint = new Paint(350.0); // 350 sq ft per gallon

            System.out.printf("Paint needed for %s: %.2f gallons\n", deck.getName(), paint.amount(deck));
            System.out.printf("Paint needed for %s: %.2f gallons\n", ball.getName(), paint.amount(ball));
            System.out.printf("Paint needed for %s: %.2f gallons\n", tank.getName(), paint.amount(tank));

        }
    }

}

