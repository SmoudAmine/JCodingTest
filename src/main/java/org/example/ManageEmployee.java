package org.example;

import org.example.Objects.Administrator;
import org.example.Objects.Developer;
import org.example.Objects.Employee;
import org.example.Objects.Enum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ManageEmployee {

    ArrayList<Employee> employees = new ArrayList<>();



    public void addEmployee(Employee emp){
        employees.add(emp);
    }
    public void getEmployee(){
        employees.stream().forEach(System.out::print);
    }

    public Employee highestPaidJavaDeveloper(){
        Comparator<Employee> comparator = Comparator.comparing( Employee::getSalary );

        Employee maxObject = employees.stream()
                .filter(emp -> ((emp instanceof Developer) && ((Developer) emp).isJavaDeveloper()))
                .max(comparator)
                .get();
        return maxObject;
    }
    public Employee lowestPaidHr(){
        Comparator<Employee> comparator = Comparator.comparing( Employee::getSalary );

        Employee maxObject = employees.stream()
                .filter(emp -> ((emp instanceof Administrator) && ((Administrator) emp).getFunction().equals(Enum.HR)))
                .min(comparator)
                .get();
        return maxObject;
    }
    public Employee highestPaidMidLevelDev(){
        Comparator<Employee> comparator = Comparator.comparing( Employee::getSalary );

        Employee maxObject = employees.stream()
                .filter(emp -> ((emp instanceof Developer) && ((Developer) emp).getLevel().equals(Enum.MID_LEVEL)))
                .max(comparator)
                .get();
        return maxObject;
    }

    public List<Employee> getEmployeesSortedBySalary(){
        List < Employee > employeesSortedList = employees.stream()
                .sorted((o1, o2) -> (int)(o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
        return employeesSortedList;
    }

}
