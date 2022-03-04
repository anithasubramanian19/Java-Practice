import java.util.Scanner;

public class perirectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int perimeter = 0;
        int length = in.nextInt();
        int breadth = in.nextInt();
        perimeter = 2*(length + breadth);
        System.out.println(perimeter);
    }
}
