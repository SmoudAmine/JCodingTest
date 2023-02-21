package org.example.Objects;

import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee{

    private Enum level;
    List<String> languages =new ArrayList<>();


    public Developer(String numId, String name, String phone_number, String email, float salary, Enum level) {
        super(numId, name, phone_number, email, salary);
        this.level = level;
    }

    public Developer(String numId, String name, String phone_number, String email, float salary, ArrayList<String> languages) {
        super(numId, name, phone_number, email, salary);
        this.languages = languages;
    }

    public Developer(String numId, String name, String phone_number, String email, float salary, Enum level, List<String> languages) {
        super(numId, name, phone_number, email, salary);
        this.level = level;
        this.languages = languages;
    }

    public Enum getLevel() {
        return level;
    }

    public void setLevel(Enum level) {
        this.level = level;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public float calculateSalary(){
        float salaire = this.salary;
        if (level == Enum.MID_LEVEL) {
            salaire = (float) (salaire*1.2);
        } else {
            salaire = (float) (salaire*1.5);
        }
        return salaire;
    }
    public boolean isJavaDeveloper(){
        boolean isTrue = false;
        for (String s : languages) {
            if (s.equalsIgnoreCase("java")){
                isTrue = true;
            }
        }
        return isTrue;
    }


}
