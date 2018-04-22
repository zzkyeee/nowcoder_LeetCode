package niuke;

import java.util.Arrays;
/**
 * 题目名称：candy
 * 题目描述：There are N children standing in a line. Each child is assigned a rating value.

 You are giving candies to these children subjected to the following requirements:

 Each child must have at least one candy.
 Children with a higher rating get more candies than their neighbors.
 What is the minimum candies you must give?
 */
public class Problem13 {
    public int candy(int[] ratings) {
        int[] nums = new int[ratings.length];
        //赋初值
        Arrays.fill(nums, 1);
        //从左到右扫描
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i-1]) {
                nums[i] = nums[i-1] + 1;
            }
        }
        int sum = 0;
        //从右到左扫描
        for (int i = ratings.length-1; i > 0; i--) {
            if (ratings[i-1] > ratings[i]) {
                nums[i-1] = Math.max(nums[i] + 1, nums[i-1]);
            }
            sum += nums[i];
        }
        sum += nums[0];
        return sum;
    }
    public static void main(String[] args) {
        Problem13 problem13 = new Problem13();
        System.out.println(problem13.candy(new int[] {2, 3, 2}));
    }
}
