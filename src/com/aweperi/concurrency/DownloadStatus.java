package com.aweperi.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {
    private boolean isDone;
    private final LongAdder totalBytes = new LongAdder();
    private int totalFiles;

    public DownloadStatus() {
    }

    public int getTotalBytes() {
        return totalBytes.intValue();
    }

    public void incrementTotalBytes() {
        totalBytes.increment();
    }

    public void incrementTotalFiles() {
        totalFiles++;
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}
