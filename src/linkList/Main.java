package linkList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.display();

        list.insertLast(40);
        list.insertLast(50);
        list.insertLast(60);
        list.display();

        list.insertAt(2, 44);
        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.deleteAt(4));
        list.display();

        list.reverse();
        list.display();

        list.bubbleSort();
        list.display();

        DLL dll = new DLL();
        dll.insertFirst(1);
        dll.insertFirst(2);
        dll.insertFirst(3);
        dll.insertFirst(4);
        dll.display();

        dll.insertAt(2, 77);
        dll.display();
    }
}
