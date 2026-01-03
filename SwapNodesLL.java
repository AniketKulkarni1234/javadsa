class SwapNodesLL {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node swapNodes(Node head, int x, int y) {

        if (x == y) return head;

        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        // agar koi key na mile
        if (currX == null || currY == null)
            return head;

        // prevX link change
        if (prevX != null)
            prevX.next = currY;
        else
            head = currY;

        // prevY link change
        if (prevY != null)
            prevY.next = currX;
        else
            head = currX;

        // next pointers swap
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

        return head;
    }

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

        head = swapNodes(head, 2, 4);
        printList(head);
    }
}
