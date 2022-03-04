import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int triangle = 0;
        System.out.println("Enter Length:");
        int length = in.nextInt();
        System.out.println("Enter Breadth: ");
        int breadth = in.nextInt();
        triangle = length * breadth/2;
        System.out.println(triangle);
    }
}
