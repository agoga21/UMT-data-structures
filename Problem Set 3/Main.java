
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,3,7,10};
        int[] array2 = {3,4,1,10};
        System.out.println(arrayToCheck(array1,array2));


    }
    public static List<Integer> arrayToCheck(int[] arr1, int[] arr2){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            for(int j = 0; j<arr2.length;j++){
                if(arr1[i]==arr2[j]){       //check if in the array 2 exists the number same as in array 1
                    list.add(arr1[i]);      //if it exists, add them in the list in the order they appear in array 1
                }
            }
        }
        return list;
    }
}