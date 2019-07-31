package MMN15Q1;


class Main {
    public static void main(String[]args)  {

        int m=1000;
        int n=10;

        myNumberCollection myNumberCollection=new myNumberCollection(m);
        checkPrimaryNumbers(n);



    }


    private static  void checkPrimaryNumbers(int n )  { // making the Threads and starting them

        if(n>0){

        PrimaryCheckThread[] threadArray=new PrimaryCheckThread[n];
        for(int i=0;i<n;i++){
            threadArray[i]=new PrimaryCheckThread(("Thread Number: "+i));
        }

        for(int i=0;i<n;i++){
            try {
                threadArray[i].start();
                threadArray[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
        myNumberCollection.printPrimes();

    }
}
