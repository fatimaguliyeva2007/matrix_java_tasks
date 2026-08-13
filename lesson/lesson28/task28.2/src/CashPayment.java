public record CashPayment(
        int id,
        int customerId,
        double amount,
        String terminalId
) implements Payment {
}
