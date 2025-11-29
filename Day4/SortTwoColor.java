import java.util.Arrays;
public class SortTwoColor {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,0,0,1,1};
        int i = 0;
        int j = nums.length-1;
        while (i<j) {
            if(nums[i]==0){
                i = i+1;
            }else if(nums[i]==1){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j = j-1;
            }            
        }
        System.out.println(Arrays.toString(nums));
    }
}