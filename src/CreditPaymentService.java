public class CreditPaymentService {
    public double calculate (double rate, int sumCredit, int years) {
        double monthRate = rate / 12 / 100;
        double monthPayment = sumCredit * (monthRate * Math.pow(1 + monthRate, 12 * years) / (Math.pow(1 + monthRate, 12 * years) - 1));
        return monthPayment;

    }
}
