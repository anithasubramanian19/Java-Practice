import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rhombus = 0;
        System.out.println("Enter Diagonal1: ");
        int diagonal1 = in.nextInt();
        System.out.println("Enter Diagonal2: ");
        int diagonal2 = in.nextInt();
        rhombus = diagonal1 * diagonal2/2;
        System.out.println(rhombus);
    }
}
