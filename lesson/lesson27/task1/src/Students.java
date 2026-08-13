public class Students implements Comparable<Students> {

    private String name;
    private double avgScore;
    private int age;
    private String course;

    public Students(String name, double avgScore, int age, String course) {
        this.name = name;
        this.avgScore = avgScore;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public int compareTo(Students other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " | " + avgScore + " | " + age + " | " + course;
    }
}