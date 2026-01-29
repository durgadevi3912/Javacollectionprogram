import java.util.*;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // For removing duplicates using Set
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return id == s.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

public class Main {
    public static void main(String[] args) {

        // 1. Store student objects in ArrayList
        ArrayList<Student> list = new ArrayList<>(5); // optimized memory

        list.add(new Student(1, "Amit", 85));
        list.add(new Student(2, "Neha", 92));
        list.add(new Student(3, "Ravi", 78));
        list.add(new Student(1, "Amit", 85)); // duplicate

        // 4. Remove duplicates using Set
        Set<Student> set = new HashSet<>(list);
        list = new ArrayList<>(set);

        // 2. HashMap for fast lookup
        HashMap<Integer, Student> map = new HashMap<>();
        for (Student s : list) {
            map.put(s.id, s);
        }

        // 3. Sorting using Comparator (by marks)
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                retu
