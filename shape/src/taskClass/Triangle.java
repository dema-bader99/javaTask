package taskClass;

public class Triangle extends Shapes {
    private Double Side1;
    private Double Side2;
    private Double Base;
    private Double Height;

    public void setAttribute(Double userSide1, Double userSide2, Double userBase, Double userHeight) throws Exception {
        if (userSide1 > 0 && userSide2 > 0 && userBase > 0) {
            Side1 = userSide1;
            Side2 = userSide2;
            Base = userBase;
            Height = userHeight;
        } else {
            throw new Exception("Null or Negative number is invalid.");
        }
    }

    public void area() throws Exception {
        System.out.println("Triangle formula is ½ * base * height");
        System.out.println("Triangle area = " + ((Base*Height)/2));
    }

    public void perimeter() throws Exception {
        System.out.println("Triangle perimeter formula = Side1 + Base + Side2");
        System.out.println("Triangle perimeter ="+ (Side1+Base+Side2));
    }
}
