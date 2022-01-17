package ForkJoinCalculate;

import java.util.concurrent.RecursiveTask;

public class ForkJoinCalculate extends RecursiveTask<Long> {
    private static final long serialVersionID = 123L;
    private long start;
    private long end;

    private static final long THRESHOLD = 1000L;

    public ForkJoinCalculate(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        return null;
    }
}
