package array;

import java.util.HashMap;
import java.util.LinkedList;

public class Problem167 {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(numbers[i])){
                return new int[]{map.get(numbers[i])+1,i+1};
            }
//            LinkedList
            map.put(target-numbers[i],i);
        }
        return null;
    }
}
