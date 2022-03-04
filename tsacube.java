import java.util.Scanner;

public class tsacube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tsa = 0;
        int a = in.nextInt();
        tsa = 6 * Math.pow(a,2);
        System.out.println(tsa);
    }
}
