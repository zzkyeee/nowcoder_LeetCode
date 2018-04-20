package niuke;

/**
 * 题目名称：single-number
 * 题目描述：Given an array of integers, every element appears twice except for one. Find that single one.
 Note:
 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class Problem3 {

    //use extra memory
//    public int singleNumber(int[] A) {
//        HashSet<Integer> set = new HashSet<>();
//        for(int a : A){
//            if(set.contains(a)){
//                set.remove(a);
//            }else{
//                set.add(a);
//            }
//        }
//        return set.iterator().next();
//    }

    //improve:位运算
    public int singleNumber(int[] A) {
        int result = A[0];
        for(int i=1;i<A.length;i++){
            result = result ^ A[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Problem3 problem3 = new Problem3();
        int[] A = {1, 2, 2, 3, 3};
        System.out.println(problem3.singleNumber(A));
    }
}
