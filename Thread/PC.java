import java.io.*;
//consumer producer problem
class Q {
	int n;

	int get() {
		System.out.println("GOT : " + n);
		return n;
	}

	void put(int a) {
		System.out.println("PUT : " + a);
		n = a;
	}
}

class Producer implements Runnable {
	Q q;
	Thread t;

	Producer(Q q) {
		this.q = q;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		int i = 0;
		while (true) {
			q.put(i++);
		}
	}

}

class Consumer implements Runnable {
	Q q;
	Thread t;

	Consumer(Q q) {
		this.q = q;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		int i = 0;
		while (true) {
			q.get();
		}
	}

}

class PC {
	public static void main(String args[]) {
		Q q = new Q();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
	}
}
