import java.util.Arrays;

public class App {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);

        for(int i=0; i<nums.length;i=i+2){
            int min = Math.min(nums[i], nums[i+1]);
            sum += min;
        }

        return sum;
    }

    public static void main(String[] args) throws Exception {
        int[] nums = {1,4,3,2};
        App ap = new App();

        System.out.println(ap.arrayPairSum(nums));
    }
}
