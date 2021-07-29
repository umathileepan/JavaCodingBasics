package com.uma.Concurrency;

public class ThreadDemo {
    public static void show() {
        System.out.println(Thread.currentThread().getName());

        /*
        //Created and start the Thread
        for(int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("File is ready to be scanned");
        }

         */

        //Interrupting a Thread
        Thread thread = new Thread();
        thread.start();

        //Cancelling a Thread - like canceling download
        try {
            thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();

    }
}
