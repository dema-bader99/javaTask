package taskClass;

public class Square extends Shapes {
    private Double Side;

    public void setSide(Double userSide) throws Exception {
        if (userSide > 0){
            Side = userSide;
        } else {
            throw new Exception("Null or Negative number is invalid.");
        }
    }

    public void area() throws Exception {
        System.out.println("The Square area formula = Side * Side");
        System.out.println("Square area = " + (Side*Side));
    }

    public void perimeter() throws Exception {
        System.out.println("The Square perimeter formula = 4 * Side");
        System.out.println("Square perimeter =" + (4*Side));
    }
}
