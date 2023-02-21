package org.example;

import org.example.Objects.Administrator;
import org.example.Objects.Developer;
import org.example.Objects.Enum;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        ManageEmployee manager = new ManageEmployee();
        List<String> languages = Arrays.asList("java", "python");
        List<String> language = Arrays.asList("c#", "c++");

        Developer dev = new Developer(
                "213",
                "Amine",
                "29170554",
                "aminesamd123@gmail.com",
                100,
                Enum.MID_LEVEL,
                languages
        );
        Developer JavaDev = new Developer(
                "300",
                "Ala",
                "29170554",
                "ala@gmail.com",
                250,
                Enum.MID_LEVEL,
                language
        );
        Administrator adminHR = new Administrator(
                "520",
                "Ons",
                "29170554",
                "ons@gmail.com",
                250,
                Enum.HR
        );
        Administrator adminHrAssistant = new Administrator(
                "92",
                "Ahlem",
                "29170554",
                "ahlem@gmail.com",
                500,
                Enum.HR
        );
        Administrator adminManager = new Administrator(
                "520",
                "Ons",
                "29170554",
                "ons@gmail.com",
                250,
                Enum.MANAGER
        );
        Developer frontendDev = new Developer(
                "101",
                "Mohamed",
                "29170554",
                "mohamed@gmail.com",
                120,
                Enum.SENIOR,
                languages
        );
        Developer backendDev = new Developer(
                "105",
                "Ali",
                "29170554",
                "ali@gmail.com",
                255,
                Enum.SENIOR,
                languages
        );

        manager.addEmployee(dev);
        manager.addEmployee(backendDev);
        manager.addEmployee(adminHR);
        manager.addEmployee(adminHrAssistant);
        manager.addEmployee(adminManager);
        manager.addEmployee(JavaDev);
        manager.addEmployee(frontendDev);

        manager.getEmployee();

        System.out.println("\n"+manager.highestPaidJavaDeveloper()); // highest paid java developer
        System.out.println("\n"+manager.lowestPaidHr()); // lowest paid HR employee
        System.out.println("\n"+manager.highestPaidMidLevelDev()); // highest paid mid-level developer
        System.out.println(manager.getEmployeesSortedBySalary()); // sorted list employees





    }
}