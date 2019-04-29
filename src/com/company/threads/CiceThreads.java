package com.company.threads;

public class CiceThreads extends Thread{

    @Override
    public void run(){
        try{
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
        }
    }
}
