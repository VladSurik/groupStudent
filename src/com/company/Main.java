package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Birthday birthday = new Birthday();
        String[] namePerson = new String[]{"Petr", "Alex", "Roman", "Evgeniy", "Mark", "Victor", "Matvey", "Miron", "Oleg", "Yaroslav"};
        String[] surnamePerson = new String[]{"Petrovich", "Simonyn", "Nesterov", "Durmanov", "Vasilenko", "Ostrovskiy", "Matveychenko", "Migor", "Lenin", "Pslovko", "Artev"};

        ArrayList<Student> personList = new ArrayList<Student>();

        for (int i = 0; i < 14; i++) {
            String name = namePerson[random.nextInt(namePerson.length)];
            String surname = surnamePerson[random.nextInt(surnamePerson.length)];
            Student stundent = new Student(surname,name,birthday.createDateBirthday(),"+380670000000",TypePerson.STUDENT);
            personList.add(stundent);
        }

	    Group firstGroup = new Group( "java", "28.01.2021", 16, 2 , personList);
        Student newStudent = new Student("Surguchev","Vlad","20.09.1991","+380936158489",TypePerson.STUDENT);
        Student newStudent1 = new Student("Surch","Victor","20.09.1991","+380936158000",TypePerson.STUDENT);
        firstGroup.addStudent(newStudent);
        firstGroup.deleteStudent("Surch");

        Teacher teacher = new Teacher("Tolstoy", "Lev", "13.03.1950", "+380936767343", TypePerson.TEACHER, 25000);
        personList.add(teacher);

        System.out.println(firstGroup.getFullNameCroup());
        System.out.println(firstGroup.getDateLastLesson());
        System.out.println(firstGroup.getListStudent());
        System.out.println(firstGroup.checkStudent("Vasilenko"));
    }
}
