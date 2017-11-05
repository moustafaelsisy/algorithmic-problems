package maxSpan;

public class MaxSpan {
    public static int maxSpan(int[] nums) {
        if(nums.length == 0)
            return 0;

        int iterations = nums.length;
        int maxSpan = 1;

        for(int startPoint = 0; startPoint < iterations; startPoint++){
            int endPoint = startPoint;
            for(int j = nums.length-1; j > startPoint; j--){ //iterate through array from the right
                if(nums[j] == nums[startPoint]){
                    endPoint = j;
                    break;
                }
            }
            //We only need to do `x` further checks, where `x` is the number of elements to the right of
            //endPoint, because in each iteration the max. possible value for maxSpan decreases by 1.
            iterations = (nums.length - 1) - endPoint < iterations ? (nums.length - 1) - endPoint : iterations;
            int span = (endPoint - startPoint) + 1;
            if(span > maxSpan)
                maxSpan = span;
        }
        return maxSpan;
    }
}
