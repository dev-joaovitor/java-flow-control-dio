import java.util.concurrent.ThreadLocalRandom;

public class LoopsExample {
    public static void main(String[] args) {
        //// normal for
        System.out.println("Normal For");
        for (int sheeps = 1; sheeps <= 20; sheeps++){
            System.out.println(sheeps);
        }
        System.out.println("\n");

        //// using for with arrays
        System.out.println("For with array");
        String students[] = {"Joao", "Lucas", "Matheus"};

//        for (int i = 0; i < students.length; i++) {
//            System.out.println(i);
//            System.out.println(students[i]);
//        }
        // or for each
        for (String student: students) {
            System.out.println(student);
        }
        System.out.println("\n");

        //// break and continue
        System.out.println("break and continue");
        for (int num = 1; num <= 5; num++) {
            System.out.println(num);
            if (num == 3){
                System.out.println("break > loop interrupted\n");
                break;
            }
        }

        for (int num = 0; num < 10; num++) {
            if (num % 2 == 1){
                System.out.println("continue > num it's odd, loop jumped");
                continue;
            }
            System.out.println(num);
        }
        System.out.println("\n");

        // while
        System.out.println("while loop");
        double balance = 0;

        while (balance > 0){
            double candyPrice = randomNum();

            if (candyPrice > balance) candyPrice = balance;

            System.out.println("Candy of price: " + candyPrice + " added to shopping list");

            balance -= candyPrice;
            System.out.println(balance);
        }
        System.out.println("\n");

        // do while
        System.out.println("do while loop");

        boolean isRinging = false;
        int timesRinged = 0;
        System.out.println("Typing...");

        do {
            System.out.println("Ringing...");

            timesRinged++;

            if (timesRinged >= 4) isRinging = false;

        } while (isRinging);
    }
    private static double randomNum(){
        return ThreadLocalRandom.current().nextDouble(1, 3);
    }
}
