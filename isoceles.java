import java.util.Scanner;

public class isoceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       double isoceles = 0;
        System.out.println("Enter 'a'");
        int a = in.nextInt();
        System.out.println("Enter 'b'");
        int b = in.nextInt();
        isoceles = (Math.sqrt(Math.pow(a,2)) - (Math.pow(b,2)/4))*b/2;
        System.out.println(isoceles);
    }
}
