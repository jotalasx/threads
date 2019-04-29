package com.company;

import com.company.threads.CiceThreads;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        /*// Esto se ejecuta en segundo plano
        CiceThreads ciceThreads = new CiceThreads();
        ciceThreads.start();
        // Esto se ejecuta en primer plano
        System.out.println("Hello");
        System.out.println("My friend");
        Thread.sleep(2000);
        System.out.println("Hi");
        System.out.println("My friend");*/

        Runnable runnable = () -> {
            try {
            long start = System.currentTimeMillis();
            int contador = 0;
            while(contador <= 9){
                Thread.sleep(1000);
                System.out.println(++contador + " seconds.");
            }
            long finalTime = System.currentTimeMillis() - start;
            System.out.println(finalTime);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }};
        Thread thread1 = new Thread(runnable);
        thread1.start();

    }
}
