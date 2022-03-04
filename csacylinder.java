import java.util.Scanner;

public class csacylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double surface = 0;
        int radius = in.nextInt();
        int height = in.nextInt();
        double pi = 3.14;
        surface = 2 * pi * radius * height;
        System.out.println(surface);
    }
}
