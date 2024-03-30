package Week3.P1;

import java.util.HashSet;

public class P2Hashing {
    public static void main(String[] args) {
        Node n1, n2, n3, n4, n5;

        // First, I will create a list like this
        // n1 -> n2 -> n3 -> n4 -> n5 -> n2 (loop)
        n5 = new Node(5, null);
        n4 = new Node(4, n5);
        n3 = new Node(3, n4);
        n2 = new Node(2, n3);
        n1 = new Node(1, n2);
        n5.next = n2;

        // Detect and remove the loop
        removeLoop(n1);

        // Now, if I traverse this list 10 times OR reach the end
        // I will encounter some nodes more than once
        Node node = n1;
        int count = 0;
        System.out.println("After loop removal");
        while (count < 10 && node != null) {
            System.out.println(node.data);
            node = node.next;
            count++;
        }
    }

    public static void removeLoop(Node head) {
        HashSet<Node> set = new HashSet<>();
        Node prev = null;
        Node current = head;

        while (current != null) {
            if (set.contains(current)) {
                // Loop detected, remove the loop by setting prev.next to null
                prev.next = null;
                break;
            } else {
                // Add current node to the set
                set.add(current);
                // Move to the next node
                prev = current;
                current = current.next;
            }
        }
    }
}
