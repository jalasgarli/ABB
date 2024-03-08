package Exercise_11;

// Java program to illustrate Starvation concept
class StarvationExample extends Thread {
	static int threadcount = 1;
	public void run()
	{
		System.out.println(threadcount + "st Child" + 
							" Thread execution starts");
		System.out.println("Child thread execution completes");
		threadcount++;
	}
	public static void main(String[] args) 
			throws InterruptedException
	{
		System.out.println("Main thread execution starts");

		// Thread priorities are set in a way that thread5
		// gets least priority.
		StarvationExample thread1 = new StarvationExample();
		thread1.setPriority(10);
		StarvationExample thread2 = new StarvationExample();
		thread2.setPriority(9);
		StarvationExample thread3 = new StarvationExample();
		thread3.setPriority(8);
		StarvationExample thread4 = new StarvationExample();
		thread4.setPriority(7);
		StarvationExample thread5 = new StarvationExample();
		thread5.setPriority(6);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		// Here thread5 have to wait because of the
		// other thread. But after waiting for some
		// interval, thread5 will get the chance of 
		// execution. It is known as Starvation
		thread5.start();

		System.out.println("Main thread execution completes");
	}
}
