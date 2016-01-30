import java.util.HashSet;
import java.util.Set;

public class LinkedListProblems {

	/* Node takes an int as data */
	public static void removeDupes(Node head) {

		Set<Integer> seenValues = new HashSet<>();

		if (head == null || head.next == null) {
			return; /* There can only be dupes if there's >1 element */
		}

		Node prev = head;
		Node curr = prev.next;

		seenValues.add(prev.data);

		while (curr != null) {

			if (seenValues.contains(curr.data)) {
				prev.next = curr.next;
			} else {
				seenValues.add(curr.data);
				prev = curr;
			}
			curr = curr.next;
		}
	}

	public static Node buildListWithEvenNumsDuplicated(int listSize) {
		Node head = new Node();

		head.data = 0;

		Node curr = head;

		for (int i = 0; i < listSize; i++) {

			Node dupe1 = new Node();
			dupe1.data = i;

			curr.next = dupe1;
			curr = dupe1;
			if (i > 0 && i % 2 == 0) {
				Node dupe2 = new Node();
				dupe2.data = i;
				curr.next = dupe2;
				curr = dupe2;
			}
		}
		return head;
	}

}
