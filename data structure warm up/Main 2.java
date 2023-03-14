import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(2);
        list.add(10);
        list.add(7);
        System.out.println(findEven(list));

    }
    public static List<Integer> findEven(List<Integer>list){
        List<Integer> evenList = new ArrayList<>();
        for(int i: list){
            if(i %2 ==0){
                evenList.add(i);

            }
        }
        return evenList;
    }
}