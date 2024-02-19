package Java.Collection;

import java.util.ArrayList;
import java.util.Collections;



public class Compare {
    public static void main(String[] args) {
        class Student implements Comparable<Student> {
            int rollno;
            String name;
            int age;
        
            Student(int rollno,String name,int age){
                this.rollno = rollno;
                this.name = name;
                this.age = age;
            }
            // For ascending order...
            // public int compareTo(Student st){
            //     if (rollno==st.rollno) 
            //         return 0;
            //     else if (rollno<st.rollno)
            //     return -1;
            //     else
            //     return 1;
            // }
            // For descending order...
            public int compareTo(Student st){
                if (rollno==st.rollno) 
                    return 0;
                else if (rollno<st.rollno)
                return 1;
                else
                return -1;
            }
        }

        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(12, "Vardhan", 12));
        al.add(new Student(18, "Anshika", 11));
        al.add(new Student(20, "Suman", 15));
        al.add(new Student(15, "Zara", 17));

        Collections.sort(al);
        System.out.println("R.N : Name : Age");
        for(Student st:al){
            System.out.println(st.rollno+" : "+st.name+" : "+st.age);
        }
    }
}

