package com.uma.Concurrency;

public class DownloadFileTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Downloading Files " + Thread.currentThread().getName());

        /*
        //Pausing Thread
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        */

        /*

        //Interrupting or Cancelling a Thread - like canceling download
        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            if(Thread.currentThread().isInterrupted()) return;
            System.out.println("Downloading byte: " + i);
        }
        System.out.println("Download complete: " + Thread.currentThread().getName());

        */

    }

}
