public class Customer implements Comparable<Customer>{
    int id;
    String name;
    int age;
    double balance;
    String city;

    public Customer(int id, String name, int age, double balance, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.balance = balance;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getBalance() {
        return balance;
    }

    public String getCity() {
        return city;
    }

    @Override
    public int compareTo(Customer other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + balance + " " + city;
    }
}
