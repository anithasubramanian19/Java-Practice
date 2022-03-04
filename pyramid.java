import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int volume = 0;
        int length = in.nextInt();
        int width = in.nextInt();
        int height = in.nextInt();
        volume = length * width * height /3;
        System.out.println(volume);
    }
}
