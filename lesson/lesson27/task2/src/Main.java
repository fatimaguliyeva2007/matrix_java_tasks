void main() {
    List<Customer> customers = new ArrayList<>();

    customers.add(new Customer(2, null, 20, 1000, "Baku"));
    customers.add(new Customer(1, "Fatima", 19, 1200, "Baku"));
    customers.add(new Customer(4, "Deniz", 18, 2000, "Ganja"));
    customers.add(new Customer(3, "Nuray", 21, 2500, "Quba"));
    customers.add(new Customer(5, "Ali", 20, 1800, "Baku"));

    //Comparable (id)

    Collections.sort(customers);
    System.out.println("Sort by id");
    customers.forEach(System.out::println);


    Collections.sort(customers, new CustomerNameComparator());
    System.out.println("\nSort by name");
    customers.forEach(System.out::println);


    Collections.sort(customers, new CustomerAgeComparator());
    System.out.println("\nSort by age");
    customers.forEach(System.out::println);


    Collections.sort(customers, new CustomerBalanceComparator());
    System.out.println("\nSort by balance");
    customers.forEach(System.out::println);


    // Lambda

    customers.sort((c1, c2) ->
            Comparator.nullsLast(String::compareTo)
                    .compare(c1.getName(), c2.getName()));

    System.out.println("\nLambda - Name Ascending");
    customers.forEach(System.out::println);


    customers.sort((c1, c2) ->
            Integer.compare(c2.getAge(), c1.getAge()));

    System.out.println("\nLambda - Age Descending");
    customers.forEach(System.out::println);


    customers.sort((c1, c2) ->
            Double.compare(c1.getBalance(), c2.getBalance()));

    System.out.println("\nLambda - Balance Ascending");
    customers.forEach(System.out::println);


    // Comparator.comparing()

    customers.sort(Comparator.comparing(Customer::getName,
            Comparator.nullsLast(String::compareTo)));

    System.out.println("\nComparator.comparing(Name)");
    customers.forEach(System.out::println);


    customers.sort(Comparator.comparing(Customer::getAge));

    System.out.println("\nComparator.comparing(Age)");
    customers.forEach(System.out::println);


    customers.sort(Comparator.comparing(Customer::getBalance));

    System.out.println("\nComparator.comparing(Balance)");
    customers.forEach(System.out::println);


    //thenComparing()

    customers.sort(
            Comparator.comparing(Customer::getAge)
                    .thenComparing(
                            Customer::getName,
                            Comparator.nullsLast(String::compareTo))
    );

    System.out.println("\nAge then Name");
    customers.forEach(System.out::println);


    customers.sort(
            Comparator.comparing(Customer::getCity)
                    .thenComparing(
                            Comparator.comparing(Customer::getBalance)
                                    .reversed())
                    .thenComparing(
                            Customer::getName,
                            Comparator.nullsLast(String::compareTo))
    );

    System.out.println("\nCity -> Balance(desc) -> Name");
    customers.forEach(System.out::println);


    // reversed()

    customers.sort(
            Comparator.comparing(Customer::getAge)
                    .reversed());

    System.out.println("\nAge Descending");
    customers.forEach(System.out::println);


    // nullsFirst() nullsLast()

    customers.sort(
            Comparator.comparing(
                    Customer::getName,
                    Comparator.nullsFirst(String::compareTo))
    );

    System.out.println("\nNulls First");
    customers.forEach(System.out::println);


    customers.sort(
            Comparator.comparing(
                    Customer::getName,
                    Comparator.nullsLast(String::compareTo))
    );

    System.out.println("\nNulls Last");
    customers.forEach(System.out::println);


    // Stream API

    System.out.println("\nCustomers from Baku");

    customers.stream()
            .filter(c -> "Baku".equals(c.getCity()))
            .sorted(
                    Comparator.comparing(Customer::getBalance)
                            .reversed())
            .forEach(System.out::println);


    // Richest

    Customer richest =
            Collections.max(customers, new CustomerBalanceComparator());

    System.out.println("\nRichest Customer");
    System.out.println(richest);


    // Youngest

    Customer youngest =
            Collections.min(customers, new CustomerAgeComparator());

    System.out.println("\nYoungest Customer");
    System.out.println(youngest);


    // Bonus
    sortCustomers(customers);

}
    public static void sortCustomers(List<Customer> customers) {

        customers.sort(
                Comparator.comparing(
                        Customer::getName,
                        Comparator.nullsLast(String::compareTo)
                )
        );

        System.out.println("\nGeneric Sort");
        customers.forEach(System.out::println);
    }
