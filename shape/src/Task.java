import java.util.*;
import taskClass.*;

public class Task {
    static void Dimensions(Shapes myShapes) throws Exception {
        myShapes.area();
        myShapes.perimeter();
    }

    public static void main(String[] args) throws Exception {
        boolean flag = true;
        System.out.println("Select the Shape you want:");
        System.out.println("Triangle => Enter t");
        System.out.println("Circle => Enter c");
        System.out.println("Square => Enter s");
        System.out.println("Out of the system => Enter o");
        Scanner input = new Scanner(System.in);
        while (flag) {
            char user = input.next().charAt(0);
            if (Character.toLowerCase(user) == 't') {
                Shapes myTriangle = new Triangle();
                System.out.println("Enter the following to calculate the area and perimeter");
                System.out.println("Enter Side1");
                double Side1 = input.nextDouble();
                System.out.println("Enter Side2");
                double Side2 = input.nextDouble();
                System.out.println("Enter Base");
                double Base = input.nextDouble();
                System.out.println("Enter Height");
                double Height = input.nextDouble();
                ((Triangle) myTriangle).setAttribute(Side1, Side2, Base, Height);
                Dimensions(myTriangle);
            } else if (Character.toLowerCase(user) == 'c') {
                Shapes myCircle = new Circle();
                System.out.println("Enter radius to calculate the area and perimeter");
                double radius = input.nextDouble();
                ((Circle) myCircle).setRadius(radius);
                Dimensions(myCircle);
            } else if (Character.toLowerCase(user) == 's') {
                Shapes mySquare = new Square();
                System.out.println("Enter Side to calculate the area and perimeter");
                double Side = input.nextDouble();
                ((Square) mySquare).setSide(Side);
                Dimensions(mySquare);
            } else if (Character.toLowerCase(user) == 'o') {
                System.out.println("Goodbye");
                break;
            } else {
                System.out.println("Please try again");
            }
            System.out.println("Re-Select the Shape you want:");
        }
        input.close();
    }
}
