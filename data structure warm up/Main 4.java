import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(6);
        System.out.println(longestSubSequence(list));



    }
    public static List<Integer> longestSubSequence(List<Integer> list){
        List<Integer>[] list1 = new List[list.size()];
        int[] x = new int[list.size()];
        int length = 0;
        int idx = 0;
        Arrays.fill(x,1);
        for(int i = 0; i< list.size();i++){
            list1[i] = new ArrayList<>();
            list1[i].add(list.get(i));

            for(int j=0; j<i;j++){
                if(list.get(j) < list.get(i)&& x[i]<=x[j]){
                        x[i] = x[j] + 1;
                        list1[i] = new ArrayList<>(list1[j]);
                        list1[i].add(list.get(i));
                }
            }
            if(x[i] >length){
                length = x[i];
                idx = i;
            }
        }
        return list1[idx];
    }
}