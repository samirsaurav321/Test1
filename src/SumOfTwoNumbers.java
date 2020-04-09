import java.util.HashMap;

public class SumOfTwoNumbers {

    public int[] twoSum(int[] nums, int target) {
        if (nums.length==0){
            return new int[]{};
        }

        HashMap<Integer,Integer> hp= new HashMap<>();

        for (int i=0;i<nums.length;i++){

            if (hp.get(target-nums[i])!=null){
                return new int[]{hp.get(target-nums[i]),i};
            }

            hp.put(nums[i],i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        int[] nums=new int[]{2, 7, 11, 15};
        int target =9;

        SumOfTwoNumbers  st= new SumOfTwoNumbers();
        st.twoSum(nums,target);




    }
}
