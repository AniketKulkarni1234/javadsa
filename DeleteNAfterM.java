public class DeleteNAfterM {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void deleteNAfterM(Node head, int M, int N) {

        Node curr = head;

        while (curr != null) {

            // Step 1: retain M nodes
            int count = 1;
            while (count < M && curr != null) {
                curr = curr.next;
                count++;
            }

            if (curr == null) {
                return;
            }

            // Step 2: delete next N nodes
            Node temp = curr.next;
            count = 1;

            while (count <= N && temp != null) {
                temp = temp.next;
                count++;
            }

            // Step 3: link remaining list
            curr.next = temp;

            // Step 4: move curr
            curr = temp;
        }
    }

    // print list
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        int M = 2;
        int N = 2;

        deleteNAfterM(head, M, N);
        printList(head);
    }
}
