package com.example;

import com.example.model.Employee;
import com.example.repository.DataSet;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        var employees = DataSet.getEmployees();
//        Basic Stream Operations
//
//        Filter:
//        Find employees with a salary greater than 70,000.
//        List employees older than 30 years.
        System.out.println("Employees with salary > 70K");
        Consumer<Employee> printResult = (emp) -> System.out.print(emp + "\n");

        Predicate<Employee> salaryMoreThan70K = (emp) -> emp.getSalary() >= 70000;
        var result = employees.stream().filter(salaryMoreThan70K).collect(Collectors.toList());
        result.forEach(printResult);

        System.out.println();
        System.out.println("Employees oder than 30 years.");
        Predicate<Employee> empAgeGreaterThan30 = employee -> employee.getAge() > 30;
        result = employees.stream().filter(empAgeGreaterThan30).collect(Collectors.toList());
        result.forEach(printResult);

//        Map:
//        Extract only th eF names of employees.
        Function<Employee, String> extractName = Employee::getName;
        List<String> names = employees.stream().map(extractName).toList();
        System.out.println(names.size() + " empployees");
        names.forEach(System.out::println);
        System.out.println();
//        Convert the salaries of all employees to a different currency (e.g., USD to INR).

//        Sorted:
//        Sort employees by name.
        System.out.println("Sorting by name");
        employees.stream()
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .toList()
                .forEach(System.out::println);
        System.out.println();

//        Sort employees by salary in descending order.
        System.out.println("Sorting by salary");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList()
                .stream()
                .limit(3)
                .forEach(System.out::println);
        System.out.println();
//
//        Intermediate Stream Operations
//        Distinct:
//        Remove duplicate departments from a list.
        System.out.println();
        System.out.println("Unique department names");
        var deptNames = employees.stream()
                .map(emp -> emp.getDepartmentName())
                .collect(Collectors.toSet());
        System.out.println(deptNames);
        var listdeptNames = employees.stream()
                .map(emp -> emp.getDepartmentName())
                .distinct()
                .toList();
        System.out.println(listdeptNames);
        System.out.println();
//        Limit/Skip:
//        Get the top 3 highest-paid employees.
//                Skip the first 2 employees and print the rest.
//                FlatMap:
//        Combine lists of department names from multiple locations.
//        Collect:
//        Group employees by gender.
//        Create a list of employee names.
//
//        Advanced Stream Operations
//
//        Reduce:
//        Calculate the total salary of all employees.
        var total = employees.stream()
                .map(emp -> emp.getSalary())
                .reduce((s1, s2) -> s1 + s2);
        System.out.println(total.get());
//        Find the employee with the highest salary.
//        GroupingBy:
//        Group employees by department.
//        Group employees by age range (e.g., <30, 30–40, >40).
//        PartitioningBy:
//        Partition employees into those earning more or less than 70,000.
//        Parallel Streams:
//        Use parallel streams to calculate the total salary for performance benchmarking.
    }


}