package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MyComparatorExample2 {
    public static void main(String[] args) {
        class Employee {
            int id;
            String name;

            public int getId() {
                return id;
            }

            public String getName() {
                return name;
            }

            public double getSalary() {
                return salary;
            }

            double salary;

            Employee(int id, String name, double salary) {
                this.id = id;
                this.name = name;
                this.salary = salary;
            }

        }

        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(102, "Bonny", 24000));
        al.add(new Employee(100, "Abhi", 10000));
        al.add(new Employee(123, "Maneesh", 20500));
        al.add(new Employee(108, "Komal", 12000));
        al.add(new Employee(100, "Lokendra", 23000));
        al.add(new Employee(99, "Pushpendra", 12500));
        al.add(new Employee(111, "Mohit", 13000));
        al.add(new Employee(132, "Bhola", 14500));
        al.add(new Employee(89, "Amit", 15440));

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option by which you want to sorting the data...");
        System.out.println("Type one of these: id, name, salary");
        String choice = sc.nextLine();
        sc.close();

        switch (choice) {
            case "id":
                System.out.println("Sorting by id...");
                Collections.sort(al, Comparator.comparing(Employee::getId));
                al.forEach(a -> System.out.println(a.getId() + " : " + a.getName() + " : " + a.getSalary()));
                break;

            case "name":
                System.out.println("Sorting by name...");
                Collections.sort(al, Comparator.comparing(Employee::getName));
                al.forEach(a -> System.out.println(a.getId() + " : " + a.getName() + " : " + a.getSalary()));
                break;

            case "salary":
                System.out.println("Sorting by salary...");
                Collections.sort(al, Comparator.comparing(Employee::getSalary));
                al.forEach(a -> System.out.println(a.getId() + " : " + a.getName() + " : " + a.getSalary()));
                break;
            default:
                System.out.println("Please enter valid choice");
                break;
        }

    }
}
