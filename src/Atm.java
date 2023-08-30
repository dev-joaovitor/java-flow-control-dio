public class Atm {
    public static void main(String[] args) {
        double balance = 25.0;
        double withdrawValue = 25.01;

        if (withdrawValue < balance) {
            balance -= withdrawValue;
            System.out.println("New balance: " + balance);
        } else
            System.out.println("Insufficient balance");
    }
}
