package MMN15Q1;


class PrimaryCheckThread extends Thread {


    PrimaryCheckThread(String name) {
        super(name);
    }


    @Override
    public void run() {


        while (myNumberCollection.getSize() !=0) {

            try {


                int temp = myNumberCollection.blockingGet();

                boolean isPrime = true;
                for (int divisor = 2; divisor <= temp / 2; divisor++) {
                    if (temp % divisor == 0) {
                        isPrime = false;
                        break; // num is not a prime, no reason to continue checking
                    }
                }

                if (isPrime && temp != 1) {
                    myNumberCollection.blockingPut(temp);
                }


            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }




    }


}
