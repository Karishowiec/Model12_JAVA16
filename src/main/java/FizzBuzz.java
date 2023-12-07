public class FizzBuzz {
    private int n;
    private int current;

    public FizzBuzz(int n) {
        this.n = n;
        this.current = 1;
    }
    public synchronized void fizz() {
        while (current <= n) {
          if (current % 3 == 0 && current % 5 != 0) {
              System.out.println("fizz");
              current++;
              notifyAll();
          } else {
              try {
                  wait();
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
        }
    }

    public synchronized void buzz() {
        while (current <= n) {
            if (current % 5 == 0 && current % 3 != 0) {
                System.out.println("buzz");
                current++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public synchronized  void fizzbuzz () {
        while (current <= n) {
            if (current % 3 == 0 && current % 5 == 0) {
                System.out.println("fizzbuzz");
                current++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public synchronized void number() {
        while (current <= n) {
            if (current % 3 != 0 && current % 5 != 0) {
                System.out.println(current);
                current++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

