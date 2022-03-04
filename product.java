public class product {
    public static void main(String[] args) {
        int n = 234;
        int sum = 0;
        int product = 1;
        int subtract = 0;
        while (n>0){
            int rem = n%10;
            n/=10;
            product = product*rem;
            sum += rem;
            subtract = product - sum;
        }





        System.out.println(subtract);

    }
}
