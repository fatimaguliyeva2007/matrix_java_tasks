public record BonusPayment(
        int id,
        int customerId,
        double amount,
        String bonusType
) implements Payment {
}
