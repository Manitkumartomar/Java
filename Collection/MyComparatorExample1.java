package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyComparatorExample1 {
    public static void main(String args[]) {
        class Student {
            int rollno;
            String name;
            int age;

            @SuppressWarnings("unused")
            public int getRollno() {
                return rollno;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }

            Student(int rollno, String name, int age) {
                this.rollno = rollno;
                this.name = name;
                this.age = age;
            }
        }

        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));

        System.out.println("Sorting by Name");

        Collections.sort(al, Comparator.comparing(Student::getName));
        al.forEach(st -> System.out.println(st.rollno + " " + st.name + " " + st.age));

        System.out.println("Sorting by Age");

        Collections.sort(al, Comparator.comparingInt(Student::getAge));
        al.forEach(st -> System.out.println(st.rollno + " " + st.name + " " + st.age));
    }
}
