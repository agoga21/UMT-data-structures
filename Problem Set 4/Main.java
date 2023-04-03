import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> emails = new LinkedList<>();
        String domain = "@gmail.com";
        emails.add("angjelosG@gmail.com");
        emails.add("something@yahoo.com");
        emails.add("testing@facebook.com");
        emails.add("iDontKnow@gmail.com");
        System.out.println(filtering(emails,domain));
        System.out.println(attachmentFiltering(emails));

    }
    public static LinkedList<String> filtering(LinkedList<String> emails,String domain){
        LinkedList<String> filteredList = new LinkedList<>();
        for(String email:emails){
            if(email.contains(domain)){
                filteredList.add(email);
            }
        }
        return filteredList;
    }
    public static int attachmentFiltering(LinkedList<String> emails){
        int cnt =0;
        for(String email:emails){
            if(email.contains("attachment")||email.contains("attached")||email.contains("enclosed")){
                cnt++;
            }
        }
        return cnt;
    }
}