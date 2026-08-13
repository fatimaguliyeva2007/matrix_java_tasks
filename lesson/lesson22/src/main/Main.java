import main.builder.MyStringBuilder;

void main() {
    MyStringBuilder builder = new MyStringBuilder();

    builder.append("Hello");
    builder.append(" ");
    builder.append("World");
    builder.append("!");

    System.out.println(builder);
}
