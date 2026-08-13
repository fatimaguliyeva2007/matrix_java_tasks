public class MyStack2<T> {
    private int index = 0;
    private int index2 = 0;
    private T[] arr = (T[]) new Object[10];

    public void setT(T value) {
        arr[index] = value;
        index++;
    }

    public T getT(){
        T value = arr[index2];
        index2++;
        return value;
    }

}
