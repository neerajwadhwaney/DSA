package TNPSheet.linkedList;

import java.util.Scanner;

public class CreateAndDisplaySinglyLinkedList {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = kb.nextInt();
        for (int i = 0; i < n; i++) {
            list.append(kb.nextInt());
        }
        list.printList();
    }
}
