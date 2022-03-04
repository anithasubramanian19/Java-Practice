import java.util.Scanner;

public class allnumbers {
    public static void main(String[] args) {
        int counter =0;
        double sum = 0;
        double even = 0;
        double odd = 0;
        int small = 0;
        int large = 0;
        int input = 0;
        double average ;
        System.out.println("Enter series 0 to quit");
        Scanner in = new Scanner(System.in);
        while ((input = in.nextInt()) !=0){
            small = in.nextInt();
            large = in.nextInt();
            if (input!=0){
                sum = input + sum;
                counter++;
            }
            if (input>large){
                large = input;
            }
            if (input<small){
                small = input;
            }
            if (input %2==0){
                even = even + 1;
            }
            else {
                odd = odd +1;
            }


        }
        if (counter>0){
            average = sum/counter;
            System.out.println("The smallest integer is: " + small);
            System.out.println("The largest integer is: " + large);
            System.out.println("The even integer is: " + even);
            System.out.println("The odd integer is: " + odd);
            System.out.println("The average integer is: " + average);
            System.out.println("The counter integer is: " + counter);

        }else {
            System.out.println("No data was entered");
        }


    }
}
