import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//        int max = a;
//        if (b>a){
//            max = b;
//        }
//        if (c>a){
//            max = c;
//        }
//
        int max = 0;
        if (a>b && a>c){
            max = a;
        }
        if (b>a && b>c){
            max = b;
        }
        else if (c>a && c>b){
            max = c;
        }
        max = Math.max(c,Math.max(a,b));
        System.out.println(max);


    }
}
