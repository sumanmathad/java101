package programs.tuf.BeginnerPrograms.LanguageBasic;

public class SumFirstLastElementArray {

    public static void main(String[] args) {
        int[]nums={1,2,3};
        System.out.println(sumOfFirstAndLast(nums));
    }

    public static int sumOfFirstAndLast(int[] nums) {
        int len= nums.length;
        if (len==0)
            return 0;
        else
            return nums[0]+nums[nums.length-1];
    }
}
