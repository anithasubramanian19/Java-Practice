import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float dollar;
        System.out.println("Please enter dollar");
        dollar = in.nextLong();
        float rupees = dollar * 64;
        System.out.println(rupees + "Rupees");


    }
}
