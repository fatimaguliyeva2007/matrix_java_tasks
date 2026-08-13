public sealed interface Payment
    permits CardPayment, CashPayment, BonusPayment {
}

//id name price categories