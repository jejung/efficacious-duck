package main;

import java.net.URL;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Class that handle and URL queue to be consumed by Connection Producer.
 * 
 * @author johnny w. g. g.
 *
 */
public class URLQueue {

	private Queue<URL> queue;
	private static URLQueue instance = new URLQueue();

	// TODO create an .ini file or store these values in a DB
	private static final int MAX_URLS = 100;

	public int size() {
		return queue.size();
	}

	private URLQueue() {
		this.queue = new ArrayDeque<>();
	}

	public static URLQueue getInstance() {
		return instance;
	}

	public synchronized boolean isEmpty() {
		return queue.isEmpty();
	}

	public synchronized boolean isFull() {
		return queue.size() > MAX_URLS;
	}

	public synchronized void add(URL url) {

		// TODO here we will to make some machanism to store the urls on the
		// database because if wait() is called could have an deadlock in some
		// specific cases
		if (isFull()) {
			return;
		}

		// TODO we will use isFull in the future, after fix TODO described above
		/*
		 * while (isFull()) { wait(); }
		 */
		queue.add(url);
		// System.err.println("ADDED " + url);

		notifyAll();
	}

	synchronized public URL poll() {
		try {
			while (isEmpty()) {
				wait();
			}
			
			URL url = queue.poll();
			notifyAll();
			
			return url;
		} catch (InterruptedException e) {
			return null;
		}
	}
}