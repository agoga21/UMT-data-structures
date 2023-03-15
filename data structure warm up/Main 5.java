import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(longestConsecutive(list));

    }
    public static List<Integer> longestConsecutive(List<Integer> list){
        int[] x = new int[list.size()];
        List<Integer> list1 = new ArrayList<>();
        Arrays.fill(x,1);   // fill array x with 1's as in Dynamic Programming
        for(int i=1;i<list.size();i++){
            for(int j =i-1;j<i;j++){
                if(list.get(i)-1 ==list.get(j)){
                    x[i] = x[j]+1;  // checks if there are consecutive ints from the list and will add 1 in the x array

                }
            }
        }

        int maxIdx = 0;
        int maxVal = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > maxVal) {
                maxIdx = i;           //After x[] is fixed this checks for the max value and the index of this max value
                maxVal = x[i];
            }
        }


        for (int i = maxIdx - maxVal + 1; i <= maxIdx; i++) {
            list1.add(list.get(i));         //And finally the longest consecutive integers will be added in the list
        }
        return list1;

    }
}