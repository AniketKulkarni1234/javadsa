public class IntersectionLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // length nikalna
    static int getLength(Node head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    // intersection find karna
    static Node getIntersection(Node head1, Node head2) {

        int len1 = getLength(head1);
        int len2 = getLength(head2);

        // agar first list badi hai
        if (len1 > len2) {
            int diff = len1 - len2;
            while (diff > 0 && head1 != null) {
                head1 = head1.next;
                diff--;
            }
        }
        // agar second list badi hai
        else {
            int diff = len2 - len1;
            while (diff > 0 && head2 != null) {
                head2 = head2.next;
                diff--;
            }
        }

        // dono ko saath move karo
        while (head1 != null && head2 != null) {

            if (head1 == head2) {
                return head1;   // intersection mil gaya
            }

            head1 = head1.next;
            head2 = head2.next;
        }

        return null;
    }

    public static void main(String[] args) {

        // common part
        Node common = new Node(3);
        common.next = new Node(2);
        common.next.next = new Node(1);

        // list 1 : 7 → 6 → 3 → 2 → 1
        Node head1 = new Node(7);
        head1.next = new Node(6);
        head1.next.next = common;

        // list 2 : 4 → 5 → 3 → 2 → 1
        Node head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = common;

        Node ans = getIntersection(head1, head2);

        if (ans != null)
            System.out.println("Intersection at node: " + ans.data);
        else
            System.out.println("No Intersection");
    }
}
