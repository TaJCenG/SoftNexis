package Task4;

import java.util.*;
import java.util.stream.Collectors;

// Employee class
class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }

    // Natural ordering → by ID
    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.id, o.id);
    }

    // Required for Set/Map correctness
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee e = (Employee) o;
        return this.id == e.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + department + ")";
    }
}

// Generic utility class
class DataSorter<T extends Comparable<T>> {

    // Natural sort
    public List<T> sort(List<T> list) {
        Collections.sort(list);
        return list;
    }

    // Custom sort
    public List<T> sort(List<T> list, Comparator<? super T> comp) {
        list.sort(comp);
        return list;
    }
}

public class CollectionsDemo {

    public static void main(String[] args) {

        // ===== LIST =====
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Alice", "Engineering"));
        list.add(new Employee(103, "Bob", "Marketing"));
        list.add(new Employee(102, "Charlie", "HR"));

        System.out.println("Original:");
        list.forEach(System.out::println);

        // ===== SET =====
        Set<Employee> set = new HashSet<>(list);
        set.add(new Employee(101, "Duplicate", "Engineering")); // ignored

        System.out.println("\nSet size (unique IDs): " + set.size());

        // ===== MAP =====
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee e : list) {
            map.put(e.getId(), e);
        }

        System.out.println("\nGet ID 102: " + map.get(102));

        // ===== SORTING =====
        DataSorter<Employee> sorter = new DataSorter<>();

        System.out.println("\nSorted by ID:");
        sorter.sort(new ArrayList<>(list))
              .forEach(System.out::println);

        System.out.println("\nSorted by Name:");
        sorter.sort(new ArrayList<>(list),
                Comparator.comparing(Employee::getName))
              .forEach(System.out::println);

        // ===== GROUPING =====
        Map<String, List<Employee>> grouped =
                list.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("\nGrouped:");
        grouped.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
