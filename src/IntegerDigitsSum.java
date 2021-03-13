public class IntegerDigitsSum {

    public static int subtractProductAndSum() {

        int sum = 0, product = 1;
        int a = 234;

        while (a > 0){
            int s = a % 10;
            sum += s;
            product *= s;
            a /= 10;
        }
        return product - sum;
    }
}
