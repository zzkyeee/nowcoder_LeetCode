package array;

public class Problem66 {
    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        //if the number less than 9,plus and return
        for(int i=length-1;i>=0;i--){
            if(digits[i]<9){
                ++digits[i];
                return digits;
            }

            digits[i]=0;
        }

        //if all numbers is 9
        int []newArray = new int[length+1];
        newArray[0]=1;
        return newArray;
    }
    public static void main(String[] args){
        int[] digits = {1,3,5,7,9};
        int []a = plusOne(digits);
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
