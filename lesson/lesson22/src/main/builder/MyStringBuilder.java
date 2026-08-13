package main.builder;

public class MyStringBuilder {
    private char[] arr = new char[10];

    public MyStringBuilder append(String str) {
        int index = 0;
        while (index < arr.length && arr[index] != '\0') {
            index++;
        }
        if (index + str.length() > arr.length) {
            char[] newArr = new char[index + str.length()];
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        for (int i = 0; i < str.length(); i++) {
            arr[index++] = str.charAt(i);
        }
        return this;
    }

    @Override
    public String toString() {
        String result = "";
        for (char c : arr) {
            if (c == '\0') {
                break;
            }
            result += c;
        }
        return result;
    }
}
