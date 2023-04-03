import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        int size = 100_000;
        Random random = new Random();
        for(int i=0;i<size;i++){
            linkedList.add(generateString(random,10));
            arrayList.add(generateString(random,10));
            String randomWord = generateString(random,10);
            linkedList.add(randomWord);
            arrayList.add(randomWord);
        }
        String target = generateString(random,10);
        int iterations = 100;
        long linkedListTime = 0;
        long arrayListTime = 0;
        for(int i=0;i<iterations;i++){
            long startTime = System.nanoTime();
            int idx = linkedList.indexOf(target);
            long endtime = System.nanoTime();
            linkedListTime +=(endtime - startTime);
        }
        for(int i=0;i<iterations;i++){
            long startTime = System.nanoTime();
            int idx = arrayList.indexOf(target);
            long endtime = System.nanoTime();
            arrayListTime +=(endtime - startTime);
        }
        double avgLinkedTime = (double)(linkedListTime/iterations);
        double avgArrayListTime = (double)(arrayListTime/iterations);
        System.out.println("Array List time in nano seconds: "+avgArrayListTime);
        System.out.println("Linked list time in nano seconds: "+avgLinkedTime);
    }
    public static String generateString(Random random,int length){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<length;i++){
            stringBuilder.append(random.nextInt((char)'a'+random.nextInt(26)));
        }
        return stringBuilder.toString();
    }
}