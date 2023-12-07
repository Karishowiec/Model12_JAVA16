public class Task1 {
    public static void main(String[] args) {
        Thread fiveSecondLeft = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    System.out.println("5 секунд");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        Thread timeToKnow = new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                while(true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    long timeLeft = (currentTimeMillis - startTime) / 1000;
                    System.out.println(timeLeft);

                }
            }
        });
        timeToKnow.start();
        fiveSecondLeft.start();

    }
}


