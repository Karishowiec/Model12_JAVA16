public class Tasl2 {
    public static void main(String[] args) {
    FizzBuzz fizzBuzz = new FizzBuzz(15);
    Thread threadA = new Thread(()-> fizzBuzz.fizz());
    Thread threadB = new Thread(()-> fizzBuzz.buzz());
    Thread threadC = new Thread(()-> fizzBuzz.fizzbuzz());
    Thread threadD = new Thread(()-> fizzBuzz.number());
    threadA.start();
    threadB.start();
    threadC.start();
    threadD.start();

    }
}
