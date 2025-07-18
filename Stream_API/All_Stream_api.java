package Stream_API;
import java.util.*;
import java.util.stream.Collectors;
class Employee{
    private String name;
    private double salary;
    private String dept;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
     public Employee(String name, double salary , String dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
     public String getDept(){
        return dept;
    }
    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + '}';
    }

}
public class All_Stream_api {
    public static void strings_starting_name(){
         List<String> names = Arrays.asList("Ankit", "Bob", "Aman", "Charlie");
         List<String> list = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
         System.out.println("Names starting with 'A': " + list);
    }
    public static void Strings_to_Uppercase(){
        List<String> name =Arrays.asList("aniket","saurabh");
        List<String> upperCase = name.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Names in uppercase: " + upperCase);
    }
    public static void first_even_number_greater_than_10(){
        List<Integer> number =Arrays.asList(12, 15, 8, 20, 5);
        Optional<Integer> evenNum = number.stream().filter(f->f%2 == 0 && f>10).findFirst();
        System.out.println("Even numbers greater than 10: " + evenNum);
    }
    public static void strings_that_start_with_A_letter(){
        List<String> names =Arrays.asList("aniket" , "saurabh", "Aman", "Ankit", "Bob");
        long count = names.stream().map(s -> s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase()).filter(a -> a.startsWith("A")).count();
        System.out.println("Count of strings starting with 'A': " + count);

    }
    public static void Sort_employees_by_salary(){
    List<Employee> employees = Arrays.asList(
            new Employee("Aniket", 50000),
            new Employee("Saurabh", 60000),
            new Employee("Pranav", 55000)
        );
        // .sorted(Comparator.comparing(Employee::getSalary).reversed())
        List<Employee> sortedEmployees = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
                
        System.out.println("Sorted Employees by Salary: " + sortedEmployees);
    }
    public static void Find_max_min_in_list(){
       List<Integer> number= Arrays.asList( 12, 15, 8, 20, 5);
    //    Optional<Integer> max = number.stream().max((a, b) -> a.compareTo(b));
         Optional<Integer> max = number.stream().max(Integer::compareTo);
         Optional<Integer> min = number.stream().min(Integer::compareTo);
         System.out.println("Maximum number: " + max.orElse(null));
         System.out.println("Minimum number: " + min.orElse(null));
    }
    public static void Group_employees_by_department(){
        List<Employee> employees =Arrays.asList(null,
            new Employee("Aniket", 50000, "IT"),
            new Employee("Saurabh", 60000, "HR"),
            new Employee("Pranav", 55000, "IT"),
            new Employee("Rohan", 70000, "Finance")
        );
        Map<String, List<Employee>> groupedByDept = employees.stream()
            .filter(Objects::nonNull) // Filter out null employees
            .collect(Collectors.groupingBy(Employee::getDept));

        groupedByDept.forEach((dept, empList) -> {
            System.out.println("Department: " + dept);  
            empList.forEach(emp -> System.out.println("  " + emp));
        });
    }
    public static void Average_salary_by_department(){
        List<Employee> employees = Arrays.asList( null,
            new Employee("Aniket",520000, "Hr"),
             new Employee("pravin",20000, "Backend"),
              new Employee("rohit",6000000, "Hr"),
               new Employee("mahesh",50000, "Frontend"),
               new Employee("manoj",560000, "Frontend"),
                new Employee("rushi",20000, "Backend")
        );
        Map<String,Double> avrg = employees.stream().filter(Objects::nonNull).collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSalary) ));
        avrg.forEach((dept,avrgSala) ->{
            System.out.println("Department: " + dept + ", Average Salary: " + avrgSala);
        });
    }
    public static void Flatten_List_of_Lists(){
      List<List<Integer>> listOfList = Arrays.asList(null,
      Arrays.asList(1,2,3,4,5,6),
      Arrays.asList(7,8,9),
      Arrays.asList(10,11,12)
      );
      List<Integer> flattenedList = listOfList.stream()
          .filter(Objects::nonNull) // Filter out null lists
          .flatMap(List::stream) // Flatten the lists
          .collect(Collectors.toList());
        System.out.println("Flattened List: " + flattenedList); 
    }

    public static void Find_duplicate_elements_in_a_list(){
        List<Integer> numbers = Arrays.asList(1,4,3,4,5,5,43);
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = numbers.stream().filter(s->s!=null && !seen.add(s)).collect(Collectors.toSet());
        System.out.println("Duplicate elements in the list: " + duplicate);
    }

    public static void Find_second_highest_salary(){
        List<Employee> employees = Arrays.asList(
            new Employee("Aniket", 50000, "IT"),
            new Employee("Saurabh", 60000, "HR"),
            new Employee("Pranav", 55000, "IT"),
            new Employee("Rohan", 70000, "Finance")
        );
        Optional<Double> secondHighest = employees.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        if (secondHighest.isPresent()) {
            System.out.println("Second highest salary: " + secondHighest.get());
        } else {
            System.out.println("No second highest salary found.");
        }

    }

    public static void Partition_list_into_even_and_odd(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
            .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Even numbers: " + partitioned.get(true));
        System.out.println("Odd numbers: " + partitioned.get(false));
    }
    public static void main(String[] args) {
    //    strings_starting_name();
    //    Strings_to_Uppercase();
    //    first_even_number_greater_than_10();
    //    strings_that_start_with_A_letter();
    //    Sort_employees_by_salary();
    //    Find_max_min_in_list();
    //    Group_employees_by_department();
        //   Average_salary_by_department();
        // Flatten_List_of_Lists();
        // Find_duplicate_elements_in_a_list();
        // Find_second_highest_salary();
        Partition_list_into_even_and_odd();
    }
}
