import java.util.Scanner;

public class sphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double volume = 0;
        double pi = 3.14;
        int radius = in.nextInt();
        volume = 4 * pi * Math.pow(radius,3)/3;
        System.out.println(volume);
    }
}
