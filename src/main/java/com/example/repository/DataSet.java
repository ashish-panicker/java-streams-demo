package com.example.repository;

import com.example.model.Department;
import com.example.model.Employee;

import java.util.Arrays;
import java.util.List;

public class DataSet {

    public static List<Department> getDepartments() {
        return Arrays.asList(
                new Department("IT", "New York"),
                new Department("Finance", "San Francisco"),
                new Department("HR", "Chicago")
        );
    }

    public static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1, "Alice", 75000, 29, "Female", "IT"),
                new Employee(2, "Bob", 60000, 34, "Male", "Finance"),
                new Employee(3, "Charlie", 120000, 45, "Male", "IT"),
                new Employee(4, "Diana", 80000, 32, "Female", "HR"),
                new Employee(5, "Eve", 95000, 28, "Female", "Finance"),
                new Employee(6, "Frank", 70000, 50, "Male", "HR"),
                new Employee(7, "Grace", 55000, 25, "Female", "IT"),
                new Employee(8, "Henry", 45000, 22, "Male", "Finance"),
                new Employee(9, "Isabella", 67000, 30, "Female", "HR"),
                new Employee(10, "Jack", 50000, 40, "Male", "IT"),
                new Employee(11, "Kate", 88000, 31, "Female", "Finance"),
                new Employee(12, "Leo", 60000, 33, "Male", "IT"),
                new Employee(13, "Mia", 110000, 35, "Female", "HR"),
                new Employee(14, "Nathan", 73000, 42, "Male", "Finance"),
                new Employee(15, "Olivia", 64000, 27, "Female", "IT"),
                new Employee(16, "Paul", 58000, 29, "Male", "Finance"),
                new Employee(17, "Quinn", 49000, 24, "Female", "HR"),
                new Employee(18, "Robert", 76000, 46, "Male", "IT"),
                new Employee(19, "Sophia", 72000, 30, "Female", "Finance"),
                new Employee(20, "Tom", 90000, 36, "Male", "HR")
        );
    }
}
