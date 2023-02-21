package org.example.Objects;

public class Administrator extends Employee{

    private Enum function;

    public Administrator(String numId, String name, String phone_number, String email, float salary) {
        super(numId, name, phone_number, email, salary);
    }

    public Administrator(String numId, String name, String phone_number, String email, float salary, Enum function) {
        super(numId, name, phone_number, email, salary);
        this.function = function;
    }

    public Enum getFunction() {
        return function;
    }

    public void setFunction(Enum function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                super.toString()+
                "function=" + function +
                '}';
    }


}
