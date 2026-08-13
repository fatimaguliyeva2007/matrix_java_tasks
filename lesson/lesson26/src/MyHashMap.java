public class MyHashMap<K,V> implements MyMap<K, V>{
    private int capacity = 16;
    private int size = 0;
    private Entry<K, V>[] table = new Entry[capacity];

    private void resize() {
        capacity *= 2;
        Entry<K, V>[] newTable = new Entry[capacity];
        for (int i = 0; i < size; i++) {
            newTable[i] = table[i];
        }
        table = newTable;
    }

    @Override
    public void put(K key, V value) {
        for (int i = 0; i < size; i++) {
            if (table[i].key.equals(key)) {
                table[i].value = value;
                return;
            }
        }
        if (size == capacity) {
            resize();
        }
        table[size] = new Entry<>(key, value);
        size++;
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (table[i].key.equals(key)) {
                return table[i].value;
            }
        }
        return null;
    }

    @Override
    public void remove(K key) {
        for (int i = 0; i < size; i++) {
            if (table[i].key.equals(key)) {
                V value = table[i].value;

                for (int j = i; j < size - 1; j++) {
                    table[j] = table[j + 1];
                }

                table[size - 1] = null;
                size--;
                return;
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Entry<K, V>[] entrySet() {
        Entry<K, V>[] entries = new Entry[size];
        for (int i = 0; i < size; i++) {
            entries[i] = table[i];
        }
        return entries;
    }
}
