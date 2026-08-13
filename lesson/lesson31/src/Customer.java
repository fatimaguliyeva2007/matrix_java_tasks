public class Customer {
    private String name;
    private int age;
    private String fin;

    public Customer(String name, int age, String fin) {
        this.name = name;
        this.age = age;
        this.fin = fin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
