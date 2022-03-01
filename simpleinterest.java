import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int n = in.nextInt();
        int r = in.nextInt();
        int simple = 0;
        if (p>0 && n>0 && r>0){
            simple = p*n*r/100;
        }
        System.out.println(simple);
    }
}
