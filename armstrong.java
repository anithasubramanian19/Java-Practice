public class armstrong {
    public static void main(String[] args) {
        int number = 153;
        int originalnum = number;
        int result = 0;
        while (originalnum>0){
            int rem = number%10;
            result += Math.pow(rem,3);
            originalnum /=10;

        if (result==number){
            System.out.println(number + "is armstrong number.");
        }
        else {
            System.out.println(number + "is not armstrong number.");
        }
        }

    }
}
