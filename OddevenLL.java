public class OddevenLL {

    // Node class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    // addLast method
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Odd Even segregation
    public Node joins(Node head) {

        if (head == null) return null;

        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;

        Node temp = head;

        while (temp != null) {

            if (temp.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = evenTail = temp;
                } else {
                    evenTail.next = temp;
                    evenTail = evenTail.next;
                }
            } else {
                if (oddHead == null) {
                    oddHead = oddTail = temp;
                } else {
                    oddTail.next = temp;
                    oddTail = oddTail.next;
                }
            }

            temp = temp.next;
        }

        if (evenHead == null) return oddHead;
        if (oddHead == null) return evenHead;

        evenTail.next = oddHead;
        oddTail.next = null;

        return evenHead;
    }

    // print list
    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("NULL");
    }

    // ✅ main method (inside class)
    public static void main(String[] args) {

        OddevenLL ll = new OddevenLL();

        // add data
        ll.addLast(8);
        ll.addLast(12);
        ll.addLast(10);
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(1);
        ll.addLast(6);

        // segregate odd-even
        ll.head = ll.joins(ll.head);

        // print
        ll.printList(ll.head);
    }
}
