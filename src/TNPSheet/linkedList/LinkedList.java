package TNPSheet.linkedList;



public class LinkedList {
    private Node head;
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
    }

    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
    }
}
