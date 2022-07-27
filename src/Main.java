public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthPayment1year = service.calculate(9.99, 1000000, 1);
        int result = (int) monthPayment1year;
        System.out.println();
        System.out.println("ставка 9.99%; сумма кредита 1000000 рублей; срок 1 год");
        System.out.println("ежемесячный платеж составляет: " + result);

        double monthPayment2years = service.calculate(9.99, 1000000, 2);
        result = (int) monthPayment2years;
        System.out.println();
        System.out.println("ставка 9.99%; сумма кредита 1000000 рублей; срок 2 года");
        System.out.println("ежемесячный платеж составляет: " + result);

        double monthPayment3years = service.calculate(9.99, 1000000, 3);
        result = (int) monthPayment3years;
        System.out.println();
        System.out.println("ставка 9.99%; сумма кредита 1000000 рублей; срок 3 года");
        System.out.println("ежемесячный платеж составляет: " + result);
    }
}
