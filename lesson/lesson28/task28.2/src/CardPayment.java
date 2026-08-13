public record CardPayment(
        int id,
        int customerId,
        double amount,
        String bankName
) implements Payment{
}
