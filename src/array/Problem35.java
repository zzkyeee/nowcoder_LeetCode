package array;

public class Problem35 {
    public static int searchInsert(int[] nums, int target) {
        int first=0,last=nums.length-1;
        while(first<=last){
            int mid=(last+first)/2;
            if(target==nums[mid])
                return mid;
            else if(target>nums[mid])
                first=mid+1;
            else
                last=mid-1;
        }
        return first;
    }
    public static void main(String[] args){
        int []nums={1,3,4,5,6};
        int index = searchInsert(nums,3);
        System.out.println(index);
    }
}
