package Exercise_11;
import java.util.concurrent.locks.ReentrantLock;

class StarvationExample {
	static class Worker {
        private String name;
        private ReentrantLock lock;
        public Worker(String name) {
            this.name = name;
            lock = new ReentrantLock();
        }

        public void work() {
            while (true) {
                try {
                    lock.lock();
                    System.out.println(name + " is working...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }
    public static void main(String[] args) {
        final Worker starvingWorker = new Worker("Starving Worker");
        Thread starvingThread = new Thread(() -> starvingWorker.work());
        starvingThread.start();

        for (int i = 1; i <= 5; i++) {
            final int threadNum = i;
            Thread additionalThread = new Thread(() -> System.out.println("Additional Thread " + threadNum + " is trying to work..."));
        }
    }
}
