package test;

public class Triangle {


    /**
     *
     * @param a 三角形的一条边
     * @param b 三角形的一条边
     * @param c 三角形的一条边
     * @return 是否超出边界范围，如果超出则返回true，否则返回false
     */
    public boolean outOfRange(int a, int b, int c){
        if (a < 1 || a > 200) {
            System.out.println("a的取值不在允许取值的范围内。");
            return true;
        }
        if (b < 1 || b > 200) {
            System.out.println("b的取值不在允许取值的范围内。");
            return true;
        }
        if (c < 1 || c > 200) {
            System.out.println("c的取值不在允许取值的范围内。");
            return true;
        }
        return false;
    }
    /**
     *
     * @param a 三角形的一条边
     * @param b 三角形的一条边
     * @param c 三角形的一条边
     * @return 是否符合三角形的标准，是则返回true，否则返回false
     */
    public boolean isTriangle(int a, int b, int c) {
        if (a < b + c && b < a + c && c < a + b) {
            return true;
        }
        return false;
    }

    /**
     * 输出三角形的类型
     * @param a 三角形的一条边
     * @param b 三角形的一条边
     * @param c 三角形的一条边
     */
    public void printType(int a, int b, int c){
        if (isTriangle(a, b, c)) {
            if (a == b || a == c || b == c){
                if (a == b && b == c && a == c){
                    System.out.println("等边三角形");
                } else {
                    System.out.println("等腰三角形");
                }
            } else {
                System.out.println("不是等边三角形");
            }
        } else {
            System.out.println("非三角形");
        }
    }

    /**
     * 输出三角形的类型
     * @param a 三角形的一条边
     * @param b 三角形的一条边
     * @param c 三角形的一条边
     */
    public void triangleType(int a, int b, int c){
        if (outOfRange(a, b, c)) { return; }
        printType(a, b, c);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.triangleType(3, 3, 6);
    }

}