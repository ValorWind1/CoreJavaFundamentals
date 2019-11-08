package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MoreStreamMethods {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,26,93,4,105,6,77,8,9);

        // Limit - > return the first n elements

        numbers.stream().limit(4).forEach(System.out ::println);

        System.out.println("-----");

        // skip - > starts the stream at the element n
        numbers.stream().skip(6).forEach(System.out::println);

        // sorted -> sort the stream by some logic ( ascending )
        List<Integer> sortedNums = numbers.stream().sorted() // sorted sorts by ascending orde
                                .collect(Collectors.toList());
        System.out.println(sortedNums);


        // descending order sorting
        List<Integer> sortedNumsDesc = numbers.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedNumsDesc);


        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee("Josiah", 90000, "Engineer"));
        employees.add(new Employee("Matt", 100000, "Engineer"));
        employees.add(new Employee("Abe", 250000, "Engineer"));
        employees.add(new Employee("Terry", 250001, "Database Arch"));
        employees.add(new Employee("Roy", 2500000, "CEO"));
        employees.add(new Employee("Brian", 70000, "Dev"));
        employees.add(new Employee("Danny", Integer.MAX_VALUE, "Juggling"));
        employees.add(new Employee("Dan", 3000000, "Management"));
        employees.add(new Employee("Lee", 0, "Intern"));
        employees.add(new Employee("Terri", 350000, "Dev"));
        employees.add(new Employee("Stanley", 75000, "Dev"));
        employees.add(new Employee("Donny", 85000, "Mobile Eng"));
        employees.add(new Employee("Rebecca", 650000, "Finances"));

        // add .reverse()

        // get two poorest employees and print them
        employees.stream().sorted(Comparator.comparing(Employee::getSalary)).limit(2).forEach(System.out::println);

        // lowest two again
        employees.stream().sorted((e1 ,e2) -> e1.getSalary() - e2.getSalary()).limit(2).forEach(System.out::println);

        // highest 2
        employees.stream().sorted((e1,e2) -> e2.getSalary() - e1.getSalary()).limit(2).forEach(System.out::println);

        // highest salary
        Employee richestEmployee = employees.stream().max((e1,e2)-> e1.getSalary()- e2.getSalary()).get();

        System.out.println("Richest Employee: ");
        System.out.println(richestEmployee);

        // lowest salary
        Employee poorestEmployee = employees.stream().min((e1,e2)-> e1.getSalary() - e2.getSalary()).get();

        System.out.println("poorest Employee");
        System.out.println(poorestEmployee);

        // matches
        // anyMatch
        boolean check = employees.stream().anyMatch(e -> e.getName().equals("Terri"));

        if(check)
            System.out.println("Terri works here");
        else
            System.out.println("terri doesnt work here");


        // all match
        check = employees.stream().allMatch(e -> e.getSalary() >= 40000);

        if(check)
            System.out.println("Everyone makes good money");
        else
            System.out.println("Some people dont make good money");


        // noneMatch
        check = employees.stream().noneMatch(e -> e.getDepartment().equals("Robots"));

        if(check)
            System.out.println("No robots");
        else
            System.out.println("Robots");


        // count

        long numEmp1 = employees.stream()
                .count();

        System.out.println(numEmp1 + "Employees");



    }
}
