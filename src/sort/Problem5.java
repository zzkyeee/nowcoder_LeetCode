package sort;

import java.util.HashMap;

public class Problem5 {
    public String longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int l = s.length();
        if(l==1) return s;
        int max=0,size=0;
        char t = 0;
        for(int i=0;i<l;i++){
            char c = s.charAt(i);
            if(map.containsKey(c)&&((i-map.get(c))>size)){
                size=i-map.get(c);
                max = i;
                t=c;
                continue;
            }
            map.put(c,i);
        }
        return s.substring(map.get(t),max+1);
    }

    public static void main(String[] args){
        Problem5 problem5 = new Problem5();
        String s = problem5.longestPalindrome("abadd");
        System.out.println(s);
    }
}
