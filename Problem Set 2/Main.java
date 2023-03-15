public class Main {
    public static void main(String[] args) {
        Node node = new Node(5);

        LinkedList linkedList = new LinkedList(node);
        linkedList.addNode(1);
        linkedList.addNode(3);
        linkedList.addNode(7);
        linkedList.addNode(6);
        linkedList.printList();
        System.out.println(linkedList.contains(6));
        System.out.println(linkedList.findMax());
        System.out.println(linkedList.findAvg());

    }
}