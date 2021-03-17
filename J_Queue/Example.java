package J_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Example {

	public static void main(String[] args) {
		example(5);
	}

	public static void example(int length) {

		Queue<Object> q = new LinkedList<>();

		for (int i = 0; i < length; i++) {
			if (i == 0)	q.add(i + 11);
			if (i == 3)	q.add(i + 23);
			if (i == 4) q.add(i + 56);
			if (i == 5) q.add(i + 45);
			q.add(i);
		}
		System.out.println("Default queue: " + q);

		Object removedele = q.remove(0);
		System.out.println("removed: " + removedele);
		System.out.println(q);

		Object head = q.peek();
		System.out.println("peaked: " + head);
		System.out.println(q);

		Object size = q.size();
		System.out.println("get size: " + size);
		System.out.println(q);
	}

	public static void example() {
		Queue<Integer> q = new LinkedList<>();

		// Adds elements {0, 1, 2, 3, 4} to queue
		for (int i = 0; i < 5; i++)
			q.add(i);

		// Display contents of the queue.
		System.out.println("Elements of queue-" + q);

		// To remove the head of queue.
		int removedele = q.remove();
		System.out.println("removed element-" + removedele);

		System.out.println(q);

		// To view the head of queue
		int head = q.peek();
		System.out.println("head of queue-" + head);

		// Rest all methods of collection interface,
		// Like size and contains can be used with this
		// implementation.
		int size = q.size();
		System.out.println("Size of queue-" + size);

	}
}
