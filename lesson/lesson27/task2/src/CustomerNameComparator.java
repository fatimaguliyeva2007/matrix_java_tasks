import java.util.Comparator;

public class CustomerNameComparator implements Comparator<Customer> {
    @Override

    public int compare(Customer c1, Customer c2) {
        return Comparator.nullsLast(String::compareTo)
                .compare(c1.getName(), c2.getName());
    }
}
