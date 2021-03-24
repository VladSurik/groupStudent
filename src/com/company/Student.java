package com.company;

public class Student {
    private String surname;
    private String name;
    private String dateBirthday;
    private String numberPhone;
    private TypePerson typePerson;

    public Student(String surname, String name, String dateBirthday, String number, TypePerson typePerson) {
        this.surname = surname;
        this.name = name;
        this.dateBirthday = dateBirthday;
        this.numberPhone = number;
        this.typePerson = typePerson;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getDateBirthday() {
        return dateBirthday;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public TypePerson getTypePerson() {
        return typePerson;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateBirthday(String dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setTypePerson(TypePerson typePerson) {
        this.typePerson = typePerson;
    }

}
