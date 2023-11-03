package ra;

public class StopWatch {
    private long startTime;
    private long stopTime;

    public StopWatch() {
        stopTime = System.currentTimeMillis();
        // trả về thời gian hiện tại mili giây của hệ thống tính từ 1/1/1970
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    public void setStopTime(long stopTime) {
        this.stopTime = stopTime;
    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        stopTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.stopTime-this.startTime;
    }
}
