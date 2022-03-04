import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rectangle = 0;
        System.out.println("Enter Length: ");
        int length = in.nextInt();
        System.out.println("Enter Breadth: ");
        int breadth = in.nextInt();
        rectangle = length * breadth;
        System.out.println(rectangle);
    }
}
