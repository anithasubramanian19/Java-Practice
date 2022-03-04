import java.util.Scanner;

public class parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int parallelogram = 0;
        System.out.println("Enter Breadth: ");
        int breadth = in.nextInt();
        System.out.println("Enter Height: ");
        int height = in.nextInt();
        parallelogram = breadth * height;
        System.out.println(parallelogram);

    }
}
