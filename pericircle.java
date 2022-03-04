import java.util.Scanner;

public class pericircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pi = 3.14;
        double perimeter = 0;
        int radius = in.nextInt();
        perimeter = 2 * pi * radius;
        System.out.println(perimeter);

    }
}
