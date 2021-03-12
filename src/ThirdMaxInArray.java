public class ThirdMaxInArray {

    public static void main(String[] args) {
        int[] a = {5, 2, 8, 9, -1, 3};

        System.out.println(thirdMax(a));
    }

    public static int thirdMax(int[] nums) {
        Integer firstMax = null, secondMax = null,thirdMax= null;
        for(int i =0; i< nums.length; i++) {
            if(firstMax == null || nums[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];
            }
            else if (nums[i] == firstMax)
                continue;
            else if(secondMax == null || nums[i] > secondMax) {
                thirdMax = secondMax;
                secondMax = nums[i];
            }
            else if (nums[i] == secondMax)
                continue;
            else if (thirdMax == null || nums[i] > thirdMax )
                thirdMax = nums[i];
        }
        if(thirdMax != null)
            return thirdMax;
        else
            return firstMax;
    }

}
