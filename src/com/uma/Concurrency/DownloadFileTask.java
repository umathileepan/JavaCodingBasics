package com.uma.Concurrency;

public class DownloadFileTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Downloading Files " + Thread.currentThread().getName());
    }
}
