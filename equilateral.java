import java.util.Scanner;

public class equilateral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       double equilateral = 0;
       int a = in.nextInt();
       equilateral = Math.sqrt(3)/4 * Math.pow(a,2);
        System.out.println(equilateral);

    }
}
