import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Skriv in värdet för width");
        System.out.println("Skriv in värdet för height");
        System.out.println("Skriv in värdet för x");
        System.out.println("Skriv in värdet för y");

        Rectangle r1 = new Rectangle(sc1.nextDouble(), sc1.nextDouble(), sc1.nextDouble(), sc1.nextDouble());

        System.out.println("Area of rectangle is " +r1.calculateArea(r1.width, r1.heigth));
        System.out.println("Parameter of rectangle is " +r1.calculatePerimeter(r1.width, r1.heigth));


    }


}

