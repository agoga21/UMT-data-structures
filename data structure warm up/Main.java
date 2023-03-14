import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Purple");
        list.add("Yellow");
        list.add("Purple");
        list.add("Green");

        System.out.println(findUnique(list));

    }
    public static List<String> findUnique(List<String> list){
        List<String> uniqueList = new ArrayList<>();
        for(String str:list){
            if(!(uniqueList.contains(str))){
                uniqueList.add(str);
            }
        }
        return uniqueList;
    }
}