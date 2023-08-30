public class Atm {
    public static void main(String[] args) {
        double balance = 25.0;
        double withdrawValue = 17.0;

        if (withdrawValue < balance)
            balance -= withdrawValue;

        System.out.println(balance);
    }
}
