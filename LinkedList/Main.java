package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL List = new LL();
        List.insertFirst(10);
        List.insertFirst(9);
        List.insertFirst(8);
        List.insertFirst(7);
        List.insert(89,3);
        List.display();
         List.deleteFirst();
        List.deleteLast();
       List.display();
        List.delete(3);
        List.display();
    }
}
