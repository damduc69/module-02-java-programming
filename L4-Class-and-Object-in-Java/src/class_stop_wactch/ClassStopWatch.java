package class_stop_wactch;

public class ClassStopWatch {
    private long startTime;
    private long endTime;

    private boolean running;

    public  ClassStopWatch() {
        this.running = false;
        this.startTime = 0;
        this.endTime = 0;
    }

    public void start() {
        this.running = true;
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.running = false;
        this.endTime = System.currentTimeMillis();
    }

    public void reset() {
        this.startTime = 0;
        this.endTime = 0;
        this.running = false;
        System.out.println("StopWatch reset");
    }

    public long getElapsedTime() {
        if (this.running) {
            return System.currentTimeMillis() - this.startTime;
        } else {
            return this.endTime - this.startTime;
        }
    }

    public double getElapsedTimeInSeconds() {
        return (double)getElapsedTime() / 1000;
    }

    public static void main(String[] args) {
        ClassStopWatch stopWatch = new ClassStopWatch();
        stopWatch.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopWatch.stop();
        System.out.println("Elapsed time: " + stopWatch.getElapsedTime() + " milliseconds");

        System.out.println("Elapsed time: " + stopWatch.getElapsedTimeInSeconds() + " seconds");

        stopWatch.reset();
    }
}
