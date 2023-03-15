public class LinkedList {
    private Node head;

    public LinkedList(Node head) {
        this.head = null;
    }
    public void addNode(int data){
        Node node = new Node(data);
        if(head ==null){
            head = node;
        }
        else{
            Node current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(node);
        }

    }
    public void printList(){
        Node current = head;
        while(current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
    public boolean contains(int data){
        Node current = head;
        while(current != null){
            if(current.getData() == data){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
    public int findMax(){
        Node current = head;
        int max =0;
        while(current != null){
            if(current.getData() > max){
                max = current.getData();
            }
            current = current.getNext();
        }
        return  max;
    }
    public double findAvg(){
        Node current = head;
        double sum = 0;
        int idx = 0;
        while(current != null){
            sum += current.getData();
            idx++;
            current = current.getNext();
        }
        double avgSum = sum/idx;
        return avgSum;

    }
}
