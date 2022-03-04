import java.util.Scanner;

public class cylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double volume = 0;
        double pi = 3.14;
        int height = in.nextInt();
        int radius = in.nextInt();
        volume = pi * Math.pow(radius,2) * height;
        System.out.println(volume);
    }
}
