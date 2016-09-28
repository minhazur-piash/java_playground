
class TestSync implements Runnable {
    private boolean isRunning = true; //shared object state
    private int balance;  //shared object state

    public void run() {
        taskToRun();
    }

    private synchronized void taskToRun() {   //need intrinsic/ monitor/ mutex lock before accessing this method via same object.
        for (int i = 0; i < 50; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " running, balance is " + increment());

            /*try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }

    private int increment() {
        int i = balance;
        balance = i + 1;

        return balance;
    }

    public synchronized boolean isRunning() {
        return isRunning;
    }

    public synchronized void setIsRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }
}