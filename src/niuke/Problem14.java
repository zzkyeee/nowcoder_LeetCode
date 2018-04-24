package niuke;

/**
 * @Description:
 * 题目名称：	word-break
 * 题目描述：Given a string s and a dictionary of words dict,
 * determine if s can be segmented into a space-separated sequence of one or more dictionary words.
 *
 * For example, given
 * s ="leetcode",
 * dict =["leet", "code"].
 * Return true because"leetcode"can be segmented as"leet code".
 *
 * @author: zhangzhikai
 * @date: 2018/4/22 下午3:42
 * @version: V1.0.0
 * @since: JDK 1.8
 */

import java.util.HashSet;
import java.util.Set;

public class Problem14 {
    public boolean wordBreak(String s, Set<String> dict) {
        boolean[] dp = new boolean[s.length()];
        //dp[i]表示前i个字符串在dict中
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                String subStr = s.substring(j, i + 1);
                if (dict.contains(subStr) && (j == 0 || dp[j - 1])) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length() - 1];
    }
    public static void main(String[] args) {
        Problem14 problem14 = new Problem14();
        Set<String> dict = new HashSet<>();
        dict.add("leet");
        dict.add("code");
        System.out.println(problem14.wordBreak("leetcode", dict));
    }
}
