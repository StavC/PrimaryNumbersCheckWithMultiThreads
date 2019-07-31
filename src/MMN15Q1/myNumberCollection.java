package MMN15Q1;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;


 class myNumberCollection {

   static private  ArrayBlockingQueue<Integer> buffer = null; // holds the range of numbers to check
   static private  ArrayList<Integer> primaryNumbersList = null; // primaryNumbers list


    protected myNumberCollection(int m) {
        buffer = new ArrayBlockingQueue<>(m);
        primaryNumbersList = new ArrayList<>();

        for (int i = 1; i <= m; i++) {
            buffer.add(i);
        }

    }

    protected  static int blockingGet() throws InterruptedException {
        return buffer.take();

    }

    protected  static void blockingPut(int value) {
        primaryNumbersList.add(value);
    }

    protected  static int getSize() {
        return buffer.size();
    }

    protected static void printPrimes() {
        for (int i = 0; i < primaryNumbersList.size(); i++) {
            System.out.println(primaryNumbersList.get(i) + " is Prime!");
        }



    }


}

