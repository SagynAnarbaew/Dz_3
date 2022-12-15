public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println("вы пополнили счет" + sum);
    }

    public void withDraw(int sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException(" вы хотите снять больше чем на счете", amount);
        } else {
            amount -= sum;
            System.out.println("вы сняли -" + sum);

        }
    }
}