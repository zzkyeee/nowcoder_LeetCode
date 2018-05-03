package niuke;

/**
 * @Description: (用一句话描述该文件做什么)
 * @author: zhangzhikai
 * @date: 2018/5/3 上午9:01
 * @version: V1.0.0
 * @since: JDK 1.8
 */
public class Problem18 {

	public int singleNumber(int[] A) {
		int ones = 0;
		int twos = 0;
		int threes = 0;
		for (int i = 0; i < A.length; i++) {
			twos |= ones & A[i];
			ones ^= A[i];
			threes = ones & twos;
			ones &= ~threes;
			twos &= ~threes;
		}
		return ones;
	}

	public static void main(String[] args) {
		Problem18 problem18 = new Problem18();
		int res = problem18.singleNumber(new int[]{123, 123, 123, 1});
		System.out.println(res);
	}

}
