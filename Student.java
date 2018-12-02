package ua.i.sonne.homework3;

import java.util.Objects;

public class Student extends Human {

    private int recordBook;
    private String group;

    public Student() {
    }

    public Student(String name, String surname, String patronymic, int age, boolean male, int recordBook, String group) {
        super(name, surname, patronymic, age, male);
        this.recordBook = recordBook;
        this.group = group;
    }

    public int getRecordBook() {
        return recordBook;
    }

    public void setRecordBook(int recordBook) {
        this.recordBook = recordBook;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        Student other = (Student) otherObject;
        return getRecordBook() == other.getRecordBook() &&
                getGroup().equals(other.getGroup());
    }

    @Override
    public String toString() {
        return "Student{" +
                "recordBook=" + recordBook +
                ", group='" + group + '\'' +
                "} " + super.toString();
    }

}
