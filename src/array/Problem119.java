package array;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
public class Problem119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>(rowIndex+1);
        for(int i=0;i<rowIndex+1;i++){
            list.add(0,1);
            for(int j=1;j<list.size()-1;j++){
                list.set(j,list.get(j)+list.get(j+1));
            }
        }
        return list;
    }
    public static void main(String[] args){
        Problem119 solution = new Problem119();
        List<Integer> list = solution.getRow(2);
        for(int i : list)
            System.out.print(i);
        System.out.println();
    }
}