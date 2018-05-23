package com.example.feliphe;

public class Main {

    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello for the main thread.");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("=== ANOTHER THREAD ===");
        anotherThread.start();

        new Thread(){
            @Override
            public void run() {
                System.out.println(ThreadColor.ANSI_CYAN + "Hello from the anonymous class thread.");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ThreadColor.ANSI_GREEN + "Hello from the anonymous class's implementation of MyRunnable");
                try {
                    anotherThread.join();
                    System.out.println(ThreadColor.ANSI_GREEN + "AnotherThread terminated or timed out, so I'm running again");
                }catch (InterruptedException e){
                    System.out.println(ThreadColor.ANSI_GREEN + "I couldn't wait after all. I was interrupted");
                }
            }
        });
        myRunnableThread.start();
//        anotherThread.interrupt();

        System.out.println(ThreadColor.ANSI_PURPLE + "Hello again from the main thread.");
    }
}
