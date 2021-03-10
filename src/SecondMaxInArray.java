public class SecondMaxInArray {

    public static void main(String[] args) {

        int[] a = {5, 7, 8, 9, -1, 3};
        int firstMax = Math.max(a[0], a[1]);
        int secondMax = Math.min(a[0], a[1]);

        for(int i = 2; i < a.length;i ++){
            if(a[i]> firstMax) {
                secondMax = firstMax;
                firstMax = a[i];
            } else if(a[i] > secondMax)
                secondMax = a[i];
        }
        System.out.println(firstMax + " "+ secondMax);
    }

}
