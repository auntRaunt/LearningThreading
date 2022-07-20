package com.jobready.threading;

public class Application {
    public static void main(String[] args) {

        System.out.println("Starting Thread1...");
        Task taskRunner = new Task("thread a");
        taskRunner.start();

        System.out.println("Starting Thread2...");
        Task taskRunner2 = new Task("thread b");
        taskRunner2.start();
    }
}

class Task extends Thread{

    String name;

    public Task(String name){
        this.name = name;
    }

    public void run(){
        Thread.currentThread().setName(name);

        for(int i=0;i <1000; i++){
            System.out.println("number: "+ i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
