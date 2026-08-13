void main() {
    Person persons1 = new Person("Fatima", LocalDate.of(2007, 5, 26));
    Person persons2 = new Person("Aygun", LocalDate.of(2006, 5, 26));
    Person persons3 = new Person("Banu", LocalDate.of(2002, 5, 26));
    Person persons4 = new Person("Leyla", LocalDate.of(2008, 5, 26));

    ArrayList<Person> list = new ArrayList<>();
    list.add(persons1);
    list.add(persons2);
    list.add(persons3);
    list.add(persons4);
    System.out.println(list);



    System.out.println(list);
}
//person class field name, birth date list collect0iona yig sonra yeni liste yig
//        student 2 field name, course
//        yasi 18 olani student cevir map olunsun 1 , 19 2, 20 3, 21 4 , eger bu araligda deyilse filter eliyib cixardsin
//        list person u list student e cevirmeliyik
//        yeni collectionda ad uzre siralasin
