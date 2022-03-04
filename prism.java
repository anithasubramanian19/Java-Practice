import java.util.Scanner;

public class prism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int volume = 0;
        int length = in.nextInt();
        int breadth = in.nextInt();
        int height = in.nextInt();
        volume = length * breadth * height;
        System.out.println(volume);
    }
}
