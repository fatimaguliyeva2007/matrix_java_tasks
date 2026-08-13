void main() {
    Payment card1 = new CardPayment(1, 101, 100, "Bank1");
    Payment card2 = new CardPayment(2, 102, 200, "Bank2");
    Payment card3 = new CardPayment(3, 103, 60, "Bank3");
    Payment card4 = new CardPayment(4, 104, 50, "Bank4");

    Payment cash1 = new CashPayment(1, 101, 40, "Terminal1");
    Payment cash2 = new CashPayment(2, 102, 400, "Terminal1");
    Payment cash3 = new CashPayment(3, 103, 1100, "Terminal1");

    Payment bonus1 = new BonusPayment(1, 101, 100, "Best");
    Payment bonus2 = new BonusPayment(2, 102, 10, "Best");
    Payment bonus3 = new BonusPayment(3, 103, 300, "Best");

    List<Payment> payments = Arrays.asList(card1, card2, card3, card4, cash1, cash2, cash3, bonus1, bonus2, bonus3);

    System.out.println("Amount > 100");
    List<Payment> amount = payments
            .stream()
            .filter(payment -> getAmount(payment) > 100)
            .toList();
    System.out.println(amount);

    System.out.println("\nTotal amount:");
    double total = payments
            .stream()
            .mapToDouble(payment -> getAmount(payment))
            .sum();
    System.out.println(total);

    System.out.println("\nOnly card payments:");
    List<CardPayment> cardPayments = payments
            .stream()
            .filter(payment -> payment instanceof CardPayment)
            .map(payment -> (CardPayment) payment)
            .toList();
    System.out.println(cardPayments);

    System.out.println("\nGrouped");
    Map<Integer, List<Payment>> grouped = payments
            .stream()
            .collect(Collectors.groupingBy(payment -> getCustomerId(payment)));
    System.out.println(grouped);

    Payment highestPayment = payments
            .stream()
            .max(Comparator.comparingDouble(payment -> getAmount(payment)))
            .get();
    System.out.println(highestPayment);

    System.out.println("\nSwich pattern:");
    payments.forEach(p->System.out.println(getType(p)));

    LocalTime start = LocalTime.now();
    double streamSum = payments
            .stream()
            .mapToDouble(payment -> getAmount(payment))
            .sum();
    LocalTime end = LocalTime.now();
    Duration duration = Duration.between(start, end);
    System.out.println("\nStream sum: "+ streamSum);
    System.out.println("Time: "+ duration.toNanos());

    start = LocalTime.now();
    double paralelSum = payments
            .parallelStream()
            .mapToDouble(payment-> getAmount(payment))
            .sum();
    end = LocalTime.now();
    duration = Duration.between(start, end);
    System.out.println("\nParalel stream sum: " + paralelSum);
    System.out.println("Time: "+ duration.toNanos());
}
public static double getAmount(Payment payment){
    switch (payment){
        case CardPayment cardPayment -> {
            return cardPayment.amount();
        }
        case CashPayment cashPayment -> {
            return cashPayment.amount();
        }
        case BonusPayment bonusPayment -> {
            return bonusPayment.amount();
        }
    }
}
public static int getCustomerId(Payment payment){
    switch (payment){
        case CardPayment cardPayment -> {
            return cardPayment.id();
        }
        case CashPayment cashPayment -> {
            return cashPayment.id();
        }
        case BonusPayment bonusPayment -> {
            return bonusPayment.id();
        }
    }
}
public static String getType(Payment payment){
    switch (payment){
        case CardPayment cardPayment -> {
            return "Card Payment";
        }
        case CashPayment cashPayment -> {
            return "Cash Payment";
        }
        case BonusPayment bonusPayment -> {
            return "Bonus Payment";
        }
    }
}
