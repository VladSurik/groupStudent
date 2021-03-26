package com.company;

public class Teacher extends Student {
    private int salary;

    public Teacher(String surname, String name, String dateBirthday, String number, TypePerson typePerson, int salary) {
        super(surname, name, dateBirthday, number, typePerson);
        this.salary = salary;
    }
}
