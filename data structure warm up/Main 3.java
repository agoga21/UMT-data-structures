import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(10);
        list.add(5);
        list.add(30);
        list.add(40);
        System.out.println(findKthSmallest(list,3));

    }
    public static int findKthSmallest(List<Integer> list, int k){
        Collections.sort(list);
        return list.get(k-1);
    }
}