package com.multitasking;

import java.util.Scanner;
import java.util.Vector;

class Producer implements Runnable {

    private final Vector sharedQueue;
    private final int size;

    public Producer(Vector sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        this.size = size;
    }

    @Override
    public void run() {
        for (int i =0; i <7; i++) {
            System.out.println("Produced: " + i);
            try {
                produce(i);
            } catch (InterruptedException ex) {
            }
        }
    }

    private void produce(int i) throws InterruptedException {

        //wait if the queue is full
        while (sharedQueue.size() == size) {
            synchronized (sharedQueue) {
                System.out.println("The queue is full " + Thread.currentThread().getName()
                                    + " is waiting for consumer to consume it , size: " + sharedQueue.size() + " " + sharedQueue);
                sharedQueue.wait();
            }
        }

        //producing element and notify consumers
        synchronized (sharedQueue) {
            sharedQueue.add(i);
            System.out.println("Element " + (i+1) + " is Added notify to consumer");
            sharedQueue.notifyAll();
        }
    }
}

class Consumer implements Runnable {

    private final Vector sharedQueue;
    private final int size;

    public Consumer(Vector sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        this.size = size;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Consumed: " + consume());
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }

        }
    }

    private int consume() throws InterruptedException {
        //wait if the queue is empty
        while (sharedQueue.isEmpty()) {
            synchronized (sharedQueue) {
                System.out.println("The queue is empty " + Thread.currentThread().getName()
                                    + " is waiting for producer to produce item , size: " + sharedQueue.size() + " " + sharedQueue);
                sharedQueue.wait();
            }
        }

        //Otherwise consume element and notify the waiting producer
        synchronized (sharedQueue) {
        	System.out.println("Consumer is notify to producer..");
            sharedQueue.notifyAll();
            return (Integer) sharedQueue.remove(0);
        }
    }
}

public class ProducerConsumer {

	public static void main(String[] args) {
		Vector sharedQueue = new Vector();
		System.out.println("Enter capacity of array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
        Thread prodThread = new Thread(new Producer(sharedQueue, size), "Producer");
        Thread consThread = new Thread(new Consumer(sharedQueue, size), "Consumer");
        prodThread.start();
        consThread.start();

	}
}
