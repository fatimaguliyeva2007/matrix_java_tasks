public interface MyMap<K, V> {
    void put(K key, V value);
    V get(K key);
    void remove(K key);
    int size();
    Entry<K, V>[] entrySet();

    class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
