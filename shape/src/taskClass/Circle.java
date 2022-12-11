package taskClass;

public class Circle extends Shapes {
    private Double radius;

    public void setRadius(Double userRadius) throws Exception {
        if (userRadius > 0){
            radius = userRadius;
        } else {
            throw new Exception("Null or Negative number is invalid.");
        }
    }

    public void area() throws Exception {
        System.out.println("Circle area formula is 3.14 * radius * radius");
        System.out.println("Circle area = " + (radius*radius*3.14));
    }

    public void perimeter() throws Exception {
        System.out.println("Circle perimeter formula is 2 * 3.14 * radius");
        System.out.println("Circle perimeter = "+ (2*3.14*radius));
    }
}
