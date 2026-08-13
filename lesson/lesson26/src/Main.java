void main() {
//    my hashmap de next olmalidi linked listde tapsin deye
    MyMap<Integer, String> map = new MyHashMap<>();

    map.put(1, "Hello");
    map.put(2, "World");
    map.put(3, "Fatima");

    System.out.println(map.get(2));

    map.remove(2);

    System.out.println(map.size());

    for (MyMap.Entry<Integer, String> e : map.entrySet()) {
        System.out.println(e.key + " - " + e.value);
    }


}