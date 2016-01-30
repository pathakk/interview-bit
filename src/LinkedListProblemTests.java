import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListProblemTests {

	@Test
	public void test_buildListWhereEvenNumsDuplicated() {
		Node head = LinkedListProblems.buildListWithEvenNumsDuplicated(10);

		int i = 0;
		while (head != null) {

			if (i % 2 == 0) {
				assertEquals(head.data, i);
				head = head.next;
				assertEquals(head.data, i);
			} else {
				assertEquals(head.data, i);
			}
			head = head.next;
			i++;

		}
	}

	@Test
	public void test_removeDupes() {

		Node head = LinkedListProblems.buildListWithEvenNumsDuplicated(10);

		LinkedListProblems.removeDupes(head);
		int i = 0;
		while (head != null) {
			assertEquals(head.data, i);
			head = head.next;
			i++;
		}

	}

}
