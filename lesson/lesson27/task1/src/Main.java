void main() {
    ArrayList<Students> students = new ArrayList<>();

    students.add(new Students("Fatima", 96, 19, "Computer engineering"));
    students.add(new Students("Nigar", 88, 20, "Information technology"));
    students.add(new Students("Aygun", 95, 21, "Computer science"));
    students.add(new Students("Aysel", 84, 18, "Cyber security"));
    Collections.sort(students);

    System.out.println("Sorted by Name:");
    for (Students s : students) {
        System.out.println(s);
    }

    students.sort(Comparator.comparing(Students::getAvgScore));

    System.out.println("\nSorted by Score:");
    for (Students s : students) {
        System.out.println(s);
    }

    students.sort(Comparator.comparing(Students::getAge));

    System.out.println("\nSorted by Age:");
    for (Students s : students) {
        System.out.println(s);
    }

    students.sort(Comparator.comparing(Students::getCourse));

    System.out.println("\nSorted by Course:");
    for (Students s : students) {
        System.out.println(s);
    }
}
