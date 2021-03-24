package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Group {

    ListGroup listGroup = new ListGroup();

    private Student student;
    private String nameCourse;
    private String dateStart;
    private int sumLessons;
    private int countLessonsPerMonth;
    private String surname;
    private ArrayList<Student> personList = new ArrayList<Student>();
    private Object Group;

    public Group(String nameCourse, String dateStart, int sumLessons, int countLessonsPerMonth, ArrayList<Student> personList) {
        this.nameCourse = nameCourse;
        this.dateStart = dateStart;
        this.sumLessons = sumLessons;
        this.countLessonsPerMonth = countLessonsPerMonth;
        this.personList = personList;
    }

    public Group(Student student) {
        this.student = student;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public int getSumLessons() {
        return sumLessons;
    }

    public int getCountLessonsPerMonth() {
        return countLessonsPerMonth;
    }

    public ArrayList<Student> getPersonList() {
        return personList;
    }

    public String getFullNameCroup() {
        return nameCourse + "_" + dateStart;
    }

    public String getDateLastLesson() {
        int stepDayForMonth = (int) 7 / countLessonsPerMonth;
        int lastLesson = stepDayForMonth * sumLessons;
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(sdf.parse(dateStart));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        calendar.add(Calendar.DATE, lastLesson);
        return sdf.format(calendar.getTime());
    }

    public String getListStudent() {
        String listStudent = "";
        for (int i = 0; i < personList.size(); i++) {
            listStudent += (personList.get(i)).getName().charAt(0) + "." + (personList.get(i)).getSurname() + "\n";
        }
        return listStudent;
    }

    public void addStudent(Student student) {
        personList.add(student);
        listGroup.addGroup(getFullNameCroup());
        System.out.println(listGroup.toString());
    }

    public void addTeacher(Student teacher) {
        personList.add(teacher);
    }

    public String checkStudent(String surname) {
        for (int i = 0; i < personList.size(); i++) {
            if (surname.equals((personList.get(i)).getSurname())) {
                return (personList.get(i)).getTypePerson() + ": "
                        + (personList.get(i)).getSurname() + ' '
                        + (personList.get(i)).getName() + '\n'
                        + (personList.get(i)).getDateBirthday() + '\n'
                        + (personList.get(i)).getNumberPhone();
            }
        }
        return "Student not found";
    }

    public void deleteStudent(String numberOrSurname) {
        for (int i = 0; i < personList.size(); i++) {
            if ((personList.get(i)).getSurname().equals(numberOrSurname) | (personList.get(i)).getNumberPhone().equals(numberOrSurname)) {
                personList.remove(i);
            }
        }
    }
}
