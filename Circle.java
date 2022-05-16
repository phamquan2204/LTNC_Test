public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double newRadius)
            throws InvalidRadiusException {
        setRadius(newRadius);
    }

    public void setRadius(double newRadius)
            throws InvalidRadiusException {
        if (newRadius > 0)
            radius = newRadius;
        else
            throw new InvalidRadiusException(newRadius);
    }

    public double getRadius() {
        return radius;
    }

    public static void main(String[] args) {
        try {
            new Circle(5);
            new Circle(-5);
            new Circle(0);
        } catch (InvalidRadiusException ex) {
            System.out.println(ex);
        }
    }
}