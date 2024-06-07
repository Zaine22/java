public class Circle {
     
    private double radius;

    
    public Circle() {
        this.radius = 1.0;
    }

 
    public Circle(double radius) {
        this.radius = radius;
    }

  
    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calcArea() {
        return Math.PI * radius * radius;
    }

    public double calcCircumference() {
        return 2 * Math.PI * radius;
    }

 
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        System.out.println("Circle1: radius=" + circle1.getRadius());
        System.out.println("Area: " + circle1.calcArea());
        System.out.println("Circumference: " + circle1.calcCircumference());


        Circle circle2 = new Circle(2.5);
        System.out.println("Circle2: radius=" + circle2.getRadius());
        System.out.println("Area: " + circle2.calcArea());
        System.out.println("Circumference: " + circle2.calcCircumference());

        circle2.setRadius(3.0);
        System.out.println("Circle2 (new radius): radius=" + circle2.getRadius());
        System.out.println("Area: " + circle2.calcArea());
        System.out.println("Circumference: " + circle2.calcCircumference());
    }
}
