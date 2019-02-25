package queue;

import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
		PriorityQueue pQueue = new PriorityQueue();
		pQueue.add(123);
		pQueue.add(46);
		pQueue.add(78);
		pQueue.add(99);
		System.out.println("Size of the Queue " + pQueue.size());
		System.out.println("Queue Elements" + pQueue);
		System.out.println("First Element in the Queue"+pQueue.poll());
		System.out.println("Size of the Queue " + pQueue.size());
		System.out.println("First Element in the Queue"+pQueue.poll());
		System.out.println("Size of the Queue " + pQueue.size());
	}
}
