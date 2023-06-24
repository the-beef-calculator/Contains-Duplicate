public class Main {
    public static void main(String[] args) {

        System.out.println(search(new int[]{-2,0,3,5,9,12}, 4));
    }

    public static int search(int[] nums, int target)
    {
        int left = 0;
        int right = nums.length;
        int center = (left + right)/2;

        for (int i = 0; i < nums.length; i++)
        {
            center = (left + right)/2;

            if (nums[center] == target)
            {
                return center;
            }
            if(nums[center] < target)
            {
                left = center;
                continue;
            }
            if(nums[center] > target)
            {
                right = center;
                continue;
            }

        }
        return -1;

    }
}