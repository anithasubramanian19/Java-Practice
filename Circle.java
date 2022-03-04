import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double area = 0;
        double pi = 3.14;
        System.out.println("Enter Radius: ");
        double r = in.nextDouble();
        area = pi * r * r ;
        System.out.println(area);

    }
}
