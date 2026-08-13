public class MyStack<T> {
    private int index = 0;
    private T[] arr = (T[]) new Object[10];

    public void setT(T value) {
        arr[index] = value;
        index++;
    }

    public T getT() {
        index--;
        T value = arr[index];
        return value;
    }
}
