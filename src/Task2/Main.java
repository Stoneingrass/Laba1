package Task2;

public class Main {
    public static void main(String[] args) {
        outputFizzBuzz();
    }

    public static void outputFizzBuzz() {
        for (int i=1; i<=100; i++) {

            //checking for divisibility by 3, 5 and 15
            if (i%3==0 && i%5==0) {
                System.out.print("FizzBuzz!");
            }
            else if (i%3==0) {
                System.out.print("Fizz!");
            }
            else if (i%5==0) {
                System.out.print("Buzz!");
            }
            else {
                System.out.print(i);
            }

            //output formatting
            if (i%20==0) {
                System.out.println();
            }
            else {
                System.out.print("\t");
            }
        }
    }
}