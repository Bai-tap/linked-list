package list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(14);
        ll.addFirst(13);
        ll.addFirst(12);

        ll.add(4, 9);
        ll.add(1, 1);
        ll.printList();
    }
}