import java.util.Scanner;

public class periparallelo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int perimeter = 0;
        int a = in.nextInt();
        int b = in.nextInt();
        perimeter = 2* (a+b);
        System.out.println(perimeter);
    }
}
