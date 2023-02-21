package org.example.Objects;

public class Employee {
    protected String numId;
    protected String name;
    protected String phone_number;
    protected String email;
    protected float salary;

    public Employee(String numId, String name, String phone_number, String email, float salary) {
        this.numId = numId;
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
        this.salary = salary;
    }


    public String getNumId() {
        return numId;
    }

    public void setNumId(String numId) {
        this.numId = numId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "numId='" + numId + '\'' +
                ", name='" + name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }


}
