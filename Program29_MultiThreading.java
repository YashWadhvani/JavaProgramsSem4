// Write a java program to showcases how multithreading allows multiple tasks to be executed simultaneously by printing a count from 1 to 5 with a 1-second delay between each count
// Date : 20/03/2024, Author : Yash Wadhvani

class CountingThread extends Thread {
    private int start;
    private String threadName;

    public CountingThread(String threadName, int start) {
        this.threadName = threadName;
        this.start = start;
    }

    @Override
    public void run() {
        for (int i = start; i <= start + 4; i++) {
            System.out.println(threadName + "\tCount :" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Program29_MultiThreading {
    public static void main(String[] args) {
        CountingThread thread1 = new CountingThread("Thread A", 1);
        CountingThread thread2 = new CountingThread("Thread B", 6);

        thread1.start();
        thread2.start();
    }
}
