package niuke;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashMap;
import java.util.Map;
/**
 * @Description: LeetCode算法题
 * @author: zhangzhikai
 * @date: 2018/4/22 下午3:42
 * @version: V1.0.0
 * @since: JDK 1.8
 */
class Point {
    int x;
    int y;
    Point() { x = 0; y = 0; }
    Point(int a, int b) { x = a; y = b; }
}
public class Problem5 {


    //map key:斜率 value：点数
    public int maxPoints(Point[] points) {
        int max = 0;
        for (int i = 0;i < points.length;i++) {
            Map<Double,Integer> map = new HashMap<Double, Integer>();
            int x1 = points[i].x;
            int y1 = points[i].y;
            int vert = 1; //垂直点
            int dup = 1;  //重复点
            for (int j = 0;j < points.length;j++) {
                if(j == i) continue;
                int x2 = points[j].x;
                int y2 = points[j].y;
                //垂直x轴
                if (x2 == x1 && y2 == y1) {
                    ++dup;
                    continue;
                }
                if(x2 == x1){
                    ++vert;
                    continue;
                }
                double slope = ((y2 - y1)*1.0) / (x2 - x1);
                int  count;
                if (map.containsKey(slope)) {
                    count = map.get(slope)+1;
                } else {
                    count = 2;
                }
                map.put(slope, count);
                dup = Math.max(dup, count);
            }
            int m = Math.max(vert, dup);
            max = Math.max(m, max);
        }
        return max;
    }
    public static void main(String[] args){
        Problem5 problem5 = new Problem5();
        Point[] points = {new Point(1,1), new Point(1,1),
                new Point(2,2), new Point(2,2)};
        System.out.println(problem5.maxPoints(points));
    }
}
