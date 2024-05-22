package Thuchanh.Map_Tree.HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Student studen1 = new Student("Nam", 20, "HN");
        Student studen2 = new Student("Hung", 21, "HN");
        Student studen3 = new Student("Ha", 22, "HN");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, studen1);
        studentMap.put(2, studen2);
        studentMap.put(3, studen3);
        studentMap.put(4, studen1);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }

        System.out.println(".....................Set");

        Set<Student> students = new HashSet<Student>();
        students.add(studen1);
        students.add(studen2);
        students.add(studen3);
        students.add(studen1);

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
